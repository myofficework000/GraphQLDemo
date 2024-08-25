package com.codegalaxy.graphqldemo.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codegalaxy.graphqldemo.model.GetCountriesQuery
import com.codegalaxy.graphqldemo.model.repository.CountriesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CountriesViewModel @Inject constructor(private val repo : CountriesRepository) : ViewModel() {

    var graphQLResponseModel: MutableLiveData<List<GetCountriesQuery.Country>?> = MutableLiveData()

    init {
        getContinents()
    }

    private fun getContinents() = viewModelScope.launch(Dispatchers.IO) {
        Log.d("CoroutineStart", "Starting API call")
        try {
            val apiResponse = repo.getCountries()
            Log.d("API_RESPONSE", apiResponse.toString()) // Log the response
            graphQLResponseModel.postValue(apiResponse)
        } catch (exception: Exception) {
            Log.e("ERROR", exception.message.toString())
        }
        Log.d("CoroutineEnd", "Finished API call")
    }

}