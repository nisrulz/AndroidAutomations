package com.github.nisrulz.example.androidautomations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.nisrulz.example.androidautomations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding?.apply {
            setContentView(root)
        }
        ExampleObject.descriptiveFn()
    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }
}
