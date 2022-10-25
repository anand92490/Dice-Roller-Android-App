package com.exampleibm.mydicerollerv4.ui.main
import com.exampleibm.mydicerollerv4.databinding.FragmentMainBinding
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.exampleibm.mydicerollerv4.R
import kotlin.random.Random


class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
        private const val TAG = "MainActivity"

    }

    private lateinit var viewModel: MainViewModel

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    private val dice = arrayOf(
        R.drawable.die_1,
        R.drawable.die_2,
        R.drawable.die_3,
        R.drawable.die_4,
        R.drawable.die_5,
        R.drawable.die_6
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d(TAG, "OnCreateView: ")
       // return inflater.inflate(R.layout.fragment_main, container, false)
      _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "OnViewCreated: " )

        binding.dieImage.setImageResource((dice[viewModel.roll]))

        binding.buttonRoll.setOnClickListener {
            viewModel.roll = Random.nextInt(6)
            binding.dieImage.setImageResource(dice[viewModel.roll])
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

}

