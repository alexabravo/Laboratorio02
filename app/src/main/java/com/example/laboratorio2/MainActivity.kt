package com.example.laboratorio2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){

    private lateinit var txtResult: TextView
    private lateinit var btnOne: Button
    private lateinit var btnTwo: Button
    private lateinit var btnThree: Button
    private lateinit var btnFour: Button
    private lateinit var btnFive: Button
    private lateinit var btnSix: Button
    private lateinit var btnSeven: Button
    private lateinit var btnEight: Button
    private lateinit var btnNine: Button
    private lateinit var btnCero: Button
    private lateinit var btnSum: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtResult = findViewById(R.id.Etiqueta)
        btnOne = findViewById(R.id.Uno)
        btnTwo = findViewById(R.id.Dos)
        btnThree = findViewById(R.id.Tres)
        btnFour = findViewById(R.id.Cuatro)
        btnFive = findViewById(R.id.Cinco)
        btnSix = findViewById(R.id.Seis)
        btnSeven = findViewById(R.id.Siete)
        btnEight = findViewById(R.id.Ocho)
        btnNine = findViewById(R.id.Nueve)
        btnCero = findViewById(R.id.Cero)
        btnSum = findViewById(R.id.Suma)

        btnCero.setOnClickListener {
            txtResult.append(getString(R.string.cero))
        }

        btnOne.setOnClickListener {
            txtResult.append(getString(R.string.one))
        }

        btnTwo.setOnClickListener {
            txtResult.append(getString(R.string.two))
        }

        btnThree.setOnClickListener {
            txtResult.append(getString(R.string.three))
        }

        btnFour.setOnClickListener {
            txtResult.append(getString(R.string.four))
        }

        btnFive.setOnClickListener {
            txtResult.append(getString(R.string.five))
        }

        btnSix.setOnClickListener {
            txtResult.append(getString(R.string.six))
        }

        btnSeven.setOnClickListener {
            txtResult.append(getString(R.string.seven))
        }

        btnEight.setOnClickListener {
            txtResult.append(getString(R.string.eight))
        }

        btnNine.setOnClickListener {
            txtResult.append(getString(R.string.nine))
        }

        btnSum.setOnClickListener {
            val valueA = txtResult.text.toString().toDouble()
            txtResult.text = ""
        }
    }
}

