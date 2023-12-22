package com.example.demoapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

import com.example.demoapp2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

binding.fragment1Btn.setOnClickListener {
    replaceFragment(Fragment1())
}

        binding.fragment2Btn.setOnClickListener {
            replaceFragment(Fragment2())
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        val  fragmentManager=supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.FragmentContainer,fragment)
        fragmentTransaction.commit()
    }

}
