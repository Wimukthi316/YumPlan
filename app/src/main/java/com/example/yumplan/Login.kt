package com.example.yumplan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        // Handle system insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize views
        val loginButton: Button = findViewById(R.id.button5)
        val backImage: ImageView = findViewById(R.id.imageView40)

        // Navigate to MealPlans when login button is clicked
        loginButton.setOnClickListener {
            startActivity(Intent(this, Mealplans::class.java))
        }

        // Navigate to Registration when back image is clicked
        backImage.setOnClickListener {
            startActivity(Intent(this, Register::class.java))
        }
    }
}