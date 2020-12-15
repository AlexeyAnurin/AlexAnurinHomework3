package ru.alexanurin.alexanurinhomework3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonToast: Button = findViewById(R.id.btn_showToast)
        val buttonSecondActivity: ImageButton = findViewById(R.id.ibtn_toSecondActivity)

        buttonToast.setOnClickListener {
            Toast.makeText(applicationContext, "Yeap, this is a toast at the first Activity", Toast.LENGTH_LONG).show()
        }

        buttonSecondActivity.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }

    }
}