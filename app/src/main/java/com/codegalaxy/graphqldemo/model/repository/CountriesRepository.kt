package com.codegalaxy.graphqldemo.model.repository

import com.codegalaxy.graphqldemo.model.GetCountriesQuery
import com.apollographql.apollo.ApolloClient
import javax.inject.Inject

class CountriesRepository @Inject constructor(private val apolloClient: ApolloClient) {

    suspend fun getCountries() : List<GetCountriesQuery.Country>? {
        return apolloClient.query(GetCountriesQuery()).execute().data?.countries
    }
}