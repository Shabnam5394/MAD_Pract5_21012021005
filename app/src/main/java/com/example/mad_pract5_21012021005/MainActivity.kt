package com.example.mad_pract5_21012021005

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnbrowse:Button=findViewById(R.id.btnbrowse)
        val browsetxt:EditText=findViewById(R.id.editTextText)
        btnbrowse.setOnClickListener {
            openbrowser(browsetxt.text.toString())
        }

    }
    fun openbrowser(url: String){
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also{
            startActivity(it)

        }

    }
    fun opencall(num:String){

    }
    fun opencallLog(){

    }
    fun opengalary(){

    }
    fun opencamera(){

    }
    fun openAlarm(){

    }
}

