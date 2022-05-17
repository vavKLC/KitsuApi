package com.example.kitsuapi.presentation.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.paging.PagingData
import androidx.viewbinding.ViewBinding
import com.example.kitsuapi.presentation.ui.state.UIState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch


abstract class BaseFragment<V : BaseViewModel, B : ViewBinding>(
    @LayoutRes layoutId: Int
) : Fragment(layoutId) {
    protected abstract val viewModel: V
    protected abstract val binding: B

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupViews()
        setupListeners()
        setupObserve()
        setupRequests()
        setupSubscribe()
    }

    open fun initialize() {}

    open fun setupViews() {}

    open fun setupListeners() {}

    open fun setupSubscribe() {}

    open fun setupObserve() {}

    open fun setupRequests() {}

    protected fun <T : Any> Flow<PagingData<T>>.collectPaging(
        lifecycleState: Lifecycle.State = Lifecycle.State.STARTED,
        success: suspend (data: PagingData<T>) -> Unit,
        error: ((error: String) -> Unit)? = null
    ) {
        collectFlowSafely(lifecycleState) {
            collect {
                success(it)
                error(it)
            }
        }
    }

    protected fun <T : Any> StateFlow<UIState<PagingData<T>>>.collectPagingData(
        lifecycleState: Lifecycle.State = Lifecycle.State.STARTED,
        success: ((data: PagingData<T>) -> Unit)? = null,
        loading: ((data: UIState.Loading<PagingData<T>>) -> Unit)? = null,
        error: ((error: String) -> Unit)? = null,
        idle: ((idle: UIState.Idle<PagingData<T>>) -> Unit)? = null,
        doSomethingInCollect: ((state: UIState<PagingData<T>>) -> Unit)? = null

    ) {
        collectFlowSafely(lifecycleState) {
            collect {
                doSomethingInCollect?.invoke(it)
                when (it) {
                    is UIState.Idle -> {
                        idle?.invoke(it)
                    }
                    is UIState.Loading -> {
                        loading?.invoke(it)
                    }
                    is UIState.Error -> {
                        error?.invoke(it.error)
                    }
                    is UIState.Success -> {
                        success?.invoke(it.data)
                    }
                }
            }
        }
    }

    protected fun <T> StateFlow<UIState<T>>.collectUIState(
        lifecycleState: Lifecycle.State = Lifecycle.State.STARTED,
        success: ((data: T) -> Unit)? = null,
        loading: ((data: UIState.Loading<T>) -> Unit)? = null,
        error: ((error: String) -> Unit)? = null,
        idle: ((idle: UIState.Idle<T>) -> Unit)? = null,
        doSomethingInCollect: ((state: UIState<T>) -> Unit)? = null,
    ) {
        collectFlowSafely(lifecycleState) {
            collect {
                doSomethingInCollect?.invoke(it)
                when (it) {
                    is UIState.Idle -> {
                        idle?.invoke(it)
                    }
                    is UIState.Loading -> {
                        loading?.invoke(it)
                    }
                    is UIState.Error -> {
                        error?.invoke(it.error)
                    }
                    is UIState.Success -> {
                        success?.invoke(it.data)
                    }
                }
            }
        }
    }

    private fun collectFlowSafely(
        lifecycleState: Lifecycle.State,
        collect: suspend () -> Unit
    ) {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(lifecycleState) {
                collect()
            }
        }

    }
}