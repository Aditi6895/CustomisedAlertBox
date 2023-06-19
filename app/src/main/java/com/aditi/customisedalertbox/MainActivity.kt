package com.aditi.customisedalertbox

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var dialog:Dialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myButton = findViewById<Button>(R.id.btnClick)
        dialog=Dialog(this)
        dialog.setContentView(R.layout.custom_dialogue)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bg_alert_box))

        var btn2= dialog.findViewById<Button>(R.id.btn2)
        var btn1= dialog.findViewById<Button>(R.id.btn1)

        btn2.setOnClickListener {
            dialog.dismiss()
        }
        btn1.setOnClickListener {
            Toast.makeText(this,"Your feedback sent successfully", Toast.LENGTH_SHORT).show()

        }
        myButton.setOnClickListener {
            dialog.show()
        }
    }
}