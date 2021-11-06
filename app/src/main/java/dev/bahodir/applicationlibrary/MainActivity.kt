package dev.bahodir.applicationlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dev.bahodir.applicationlibrary.databinding.ActivityMainBinding
import dev.bahodir.mylibrary.AlertMessage

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.show.setOnClickListener {
            AlertMessage.showToast(this, getString(R.string.app_name), "Hi... This is my library alert") {
                Toast.makeText(this, "Dismiss callback", Toast.LENGTH_SHORT).show()
            }
        }
    }
}