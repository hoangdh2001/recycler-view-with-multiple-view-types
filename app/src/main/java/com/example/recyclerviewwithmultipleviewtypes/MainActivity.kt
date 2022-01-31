package com.example.recyclerviewwithmultipleviewtypes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerviewwithmultipleviewtypes.adapter.TripAdapter
import com.example.recyclerviewwithmultipleviewtypes.data.DataSource
import com.example.recyclerviewwithmultipleviewtypes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.adapter = TripAdapter(DataSource.items)
    }
}