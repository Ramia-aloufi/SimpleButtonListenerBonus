package com.example.simplebuttonlistenerbonus

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.simplebuttonlistenerbonus.databinding.ActivityMainBinding




class MainActivity : AppCompatActivity() {
    lateinit var btn1:Button
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        var btn2 =  addButton()
        setContentView(view)
        binding.bbb.setOnClickListener {
            toast()        }
        btn2.setOnClickListener {
            toast()        }





    }


        private fun addButton():Button {

            // Create Button programmatically.
            val button = Button(this)
            button.layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                150
            )
            button.gravity = Gravity.CENTER
            button.text = "Hy"

            button.setBackgroundColor(Color.LTGRAY)

            // Add Button to LinearLayout
            binding.rootLayout.addView(button)
            return button



    }

    private fun toast(){
        Toast.makeText(this,"Toast",LENGTH_SHORT).show()

    }
}