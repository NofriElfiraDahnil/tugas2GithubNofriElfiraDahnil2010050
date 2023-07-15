package com.example.quizElfira2010050.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.quizElfira2010050.ActivityLogin
import com.example.quizElfira2010050.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.icon2.setOnClickListener{
            val Intent = Intent(this@DashboardFragment.requireContext(), ActivityLogin::class.java)
            startActivity(Intent)
        }

     //     val textView: TextView = binding.textDashboard
     //   dashboardViewModel.text.observe(viewLifecycleOwner) {
     //       textView.text = it
       // }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}