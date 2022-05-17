package com.example.kitsuapi.presentation.ui.fragments.auth

import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuapi.R
import com.example.kitsuapi.common.extensions.safeNavigation
import com.example.kitsuapi.databinding.FragmentSignInBinding
import com.example.kitsuapi.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignInFragment : BaseFragment<SignInViewModel, FragmentSignInBinding>(
    R.layout.fragment_sign_in
) {
    override val viewModel: SignInViewModel by viewModels()
    override val binding by viewBinding(FragmentSignInBinding::bind)

    override fun setupSubscribe() {
        viewModel.signInState.collectUIState(
            error = {
                Toast.makeText(requireActivity(), "error", Toast.LENGTH_SHORT).show()
            },
            success = {
                findNavController().safeNavigation(R.id.action_signInFlowFragment_to_mainFlowFragment)
            }
        )
    }

    override fun setupListeners() {
        binding.signInBtn.setOnClickListener {
            viewModel.signIn(binding.emailEt.text.toString(), binding.passwordEt.text.toString())
        }
    }
}
