package com.codegalaxy.graphqldemo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.codegalaxy.graphqldemo.databinding.ActivityMainBinding
import com.codegalaxy.graphqldemo.model.adapter.CountryAdapter
import com.codegalaxy.graphqldemo.viewmodel.CountriesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val mainViewModel by viewModels<CountriesViewModel>()
    private lateinit var countryAdapter: CountryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        mainViewModel
        observer()
    }

    private fun observer() {
        mainViewModel.graphQLResponseModel.observe(this@MainActivity) { countries ->
            countries?.let {
                countryAdapter = CountryAdapter(it)
                binding.countryRecyclerView.adapter = countryAdapter
            }
        }
    }

}