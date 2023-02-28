package com.jaytala.dynamicfragement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.jaytala.dynamicfragement.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.user.setOnClickListener {
            loadfragment(userragment())

        }
        binding.profile.setOnClickListener {
            loadfragment(profileFragment())
        }

    }

    private fun loadfragment(userFragment: Fragment) {
        var manager = supportFragmentManager
        var transation = manager.beginTransaction()
        transation.replace(R.id.fragframe, userFragment)
        transation.commit()
    }
}