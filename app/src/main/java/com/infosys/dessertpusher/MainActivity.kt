package com.infosys.dessertpusher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LifecycleObserver
import com.infosys.dessertpusher.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), LifecycleObserver {
    private lateinit var binding: ActivityMainBinding

    data class desert(val imageid: Int, val price: Int, val productionAmount: Int)

    private val allDeserts = listOf(
        desert(R.drawable.cupcake, 5, 0),
        desert(R.drawable.donut, 10, 5),
        desert(R.drawable.eclair, 15, 20),
        desert(R.drawable.froyo, 30, 50),
        desert(R.drawable.gingerbread, 50, 100),
        desert(R.drawable.honeycomb, 100, 200),
        desert(R.drawable.icecreamsandwich, 500, 500),
        desert(R.drawable.jellybean, 1000, 1000),
        desert(R.drawable.kitkat, 2000, 2000),
        desert(R.drawable.lollipop, 3000, 4000),
        desert(R.drawable.marshmallow, 4000, 8000),
        desert(R.drawable.nougat, 5000, 16000),
        desert(R.drawable.oreo, 6000, 20000)
    )

    private var currentDesert = allDeserts[0]

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }
}