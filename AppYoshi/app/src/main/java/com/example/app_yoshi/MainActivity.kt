package com.example.app_yoshi

import android.app.Activity
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Calcular(componente: View) {

        var contaPeso = peso.text.toString().toDouble() * 3.5

        resultado_peso.text = "Você deve tomar ${contaPeso} litros de água por dia!"

        var refriCampo = refri.text.toString().toDouble()

        var contaRefri = refriCampo/4.0
         resultado_refri.text = "Você precisar levar ${contaRefri} litros de refrigerante"

        var contaChurras = churrasco.text.toString().toDouble()/3.0
        resultado_churras.text = "Você precisar levar ${contaChurras} KL de comida"


    }
}