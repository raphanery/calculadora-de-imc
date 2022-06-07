package com.example.calculadoradeimc

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val caixaNome = findViewById<EditText>(R.id.txtNome)
        val caixaPeso = findViewById<EditText>(R.id.txtPeso)
        val caixaAltura = findViewById<EditText>(R.id.txtAltura)
        val resultado = findViewById<TextView> (R.id.txtResultado)

        fun calcularIMC(): String {

            var saida:String
            val res = caixaPeso / (caixaAltura * caixaAltura)

            if (res >= 0 || res <= 18.4) {
                saida = "Olá, {caixaNome}. Seu imc é {imc}. Tome cuidado, pois você está abaixo da sua faixa de peso ideal."
            } else {
                if (res >= 18.4 || res <= 24.9) {
                    saida = "Olá, {caixaNome}. Seu imc é {imc}, e está dentro da sua faixa de peso ideal."
                } else {
                    if (res >= 25.0 || res <= 29.9) {
                        saida = "Olá, {caixaNome}. Seu imc é {imc}, e você está com sobrepeso, um pouco acima da sua faixa de peso ideal."
                    } else {
                        if (res >= 30.0 || res <= 39.9) {
                            saida = "Olá, {caixaNome}. Seu imc é {imc}, e você está com sobrepeso, ou obesidade nível I. Tome cuidado pois você está um pouco acima da sua faixa de peso ideal."
                        } else {
                            if (res >= 30.0 || res <= 39.9) {
                                saida = "Olá, {caixaNome}. Seu imc é {imc}, e você está com obesidade nível II. Procure atendimento médico, pois você está um muito acima da sua faixa de peso ideal."
                            } else {
                                saida = "Olá, {caixaNome}. Seu imc é {imc}, e você está com obesidade nível III. Procure atendimento médico, pois você está um muito acima da sua faixa de peso ideal."
                            }
                        }
                    }
                }
            }

            resultado.setText(saida)
            return ""

        }
    }
}