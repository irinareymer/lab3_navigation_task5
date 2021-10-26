package lab3.navigation_task5.lab3_navigation_task5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import lab3.navigation_task5.lab3_navigation_task5.databinding.AboutBinding

class ActivityAbout  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = AboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBack.setOnClickListener {
            finish()
        }
    }
}