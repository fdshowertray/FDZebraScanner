package com.fdshowertray.fdzebrascanner

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fdshowertray.fdzebrascanner.databinding.FragmentEmpaquetadoBinding
/**
 * A simple [Fragment] subclass.
 * Use the [EmpaquetadoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class EmpaquetadoFragment : Fragment() {
    // Fragmento básico para escaneo de platos para registro de empaquetado
    private var _binding: FragmentEmpaquetadoBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentEmpaquetadoBinding.inflate(inflater,container,false)
        return binding.root
    }
}