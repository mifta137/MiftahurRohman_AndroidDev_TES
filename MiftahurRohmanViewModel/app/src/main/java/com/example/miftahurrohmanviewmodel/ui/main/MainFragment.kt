package com.example.miftahurrohmanviewmodel.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.miftahurrohmanviewmodel.R

/*

class MainFragment : Fragment() {

companion object {
fun newInstance() = MainFragment()
}

private lateinit var viewModel: MainViewModel

override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
TODO: Use the ViewModel
}

override fun onCreateView(
inflater: LayoutInflater, container: ViewGroup?,
savedInstanceState: Bundle?
): View {
return inflater.inflate(R.layout.fragment_main, container, false)
}

}
*/

//class MainFragment : Fragment() {
//
//    companion object {
//        fun newInstance() = MainFragment()
//    }
//
//    private lateinit var viewModel: MainViewModel
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View {
//        val view = inflater.inflate(R.layout.fragment_main, container, false)
//
//        val incrementButton = view.findViewById<Button>(R.id.incrementButton)
//        incrementButton.setOnClickListener {
//            viewModel.incrementCounter()
//        }
//
//        return view
//    }
//}

import androidx.lifecycle.Observer

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private lateinit var counterTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        viewModel.counter.observe(this, Observer { counterValue ->
            counterTextView.text = "Counter Value: $counterValue"
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        counterTextView = view.findViewById(R.id.counterTextView)

        val incrementButton = view.findViewById<Button>(R.id.incrementButton)
        incrementButton.setOnClickListener {
            viewModel.incrementCounter()
        }

        return view
    }
}

