package com.codegalaxy.graphqldemo.model.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codegalaxy.graphqldemo.databinding.CountryListItemBinding
import com.codegalaxy.graphqldemo.model.GetCountriesQuery

class CountryAdapter (private val list: List<GetCountriesQuery.Country>) :
    RecyclerView.Adapter<CountryAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: CountryListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(countryName: String) {
            binding.apply {
                countryTxt.text = countryName
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryAdapter.ViewHolder {
        return ViewHolder(
            CountryListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CountryAdapter.ViewHolder, position: Int) {
        holder.bind(list[position].name)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}