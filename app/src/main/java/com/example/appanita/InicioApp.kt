package com.example.appanita

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.AttributeSet
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appanita.calculadora.Calculadora
import com.example.appanita.databinding.ActivityInicioAppBinding
import com.example.appanita.databinding.FragmentHomeBinding

class InicioApp : AppCompatActivity() {
    private lateinit var binding: ActivityInicioAppBinding
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding= ActivityInicioAppBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMenu.setOnClickListener {
            val intent=Intent(this,Calculadora::class.java)
            startActivity(intent)
        }

        binding.btnMenu.setOnClickListener {
            val intent=Intent(this,Calculadora::class.java)
            startActivity(intent)
        }
    }
}