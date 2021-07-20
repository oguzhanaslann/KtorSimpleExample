package com.oguzhanaslann.ktorexample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.oguzhanaslann.ktorexample.R
import com.oguzhanaslann.ktorexample.databinding.ActivityMainBinding
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private lateinit var peopleListAdapter: PeopleListAdapter
    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews(binding)
        subscribeObservers()
    }

    private fun initViews(binding: ActivityMainBinding) {

        peopleListAdapter = PeopleListAdapter()

        binding.peopleListRv.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = peopleListAdapter
        }
    }

    private fun subscribeObservers() {
        mainViewModel.getRandomUsers(25)
        lifecycleScope.launch {
            mainViewModel
                .peopleListFlow
                .flowWithLifecycle(lifecycle, Lifecycle.State.STARTED)
                .collect {
                    peopleListAdapter.submitList(it)
                }

        }

    }
}