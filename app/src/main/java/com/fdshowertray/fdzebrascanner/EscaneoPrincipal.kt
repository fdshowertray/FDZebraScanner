package com.fdshowertray.fdzebrascanner

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.fdshowertray.fdzebrascanner.databinding.FragmentoEscaneoPrincipalBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class EscaneoPrincipal : Fragment() {

    private var _binding: FragmentoEscaneoPrincipalBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentoEscaneoPrincipalBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            view.findNavController().navigate(R.id.action_escaneoPrincipal_to_empaquetadoFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}