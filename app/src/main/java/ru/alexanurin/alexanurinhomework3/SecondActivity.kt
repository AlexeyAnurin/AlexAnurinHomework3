package ru.alexanurin.alexanurinhomework3

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val buttonToast2: Button = findViewById(R.id.btn_showToast2)
        val buttonCustomView:View = findViewById(R.id.customView)

        buttonToast2.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "Yeap, this is a toast at the second Activity",
                Toast.LENGTH_LONG
            ).show()
        }

        buttonCustomView.setOnClickListener {
            onBackPressed()
        }

    }
}