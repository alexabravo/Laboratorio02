package com.example.laboratorio2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){

    private var num1 = 0.0
    private var num2 = 0.0
    private var operacion = 0

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
    private lateinit var btnPoint: Button

    private lateinit var btnSum: Button
    private lateinit var btnRes: Button
    private lateinit var btnMul: Button
    private lateinit var btnDiv: Button
    private lateinit var btnCle: Button
    private lateinit var btnBor: Button
    private lateinit var btnIgl: Button

    private var operador: String? = null
    private var valorAnterior: String ? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var resultado: Float = 0f

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
        btnPoint = findViewById(R.id.Punto)
        btnSum = findViewById(R.id.Suma)
        btnRes = findViewById(R.id.Resta)
        btnMul = findViewById(R.id.Multiplica)
        btnDiv = findViewById(R.id.Divide)
        btnCle = findViewById(R.id.Clean)
        btnBor = findViewById(R.id.Borrar)
        btnIgl = findViewById(R.id.Igual)

        txtResult.text = "0"
        operacion = SIN_OPERACION

        btnOne.setOnClickListener { numberPressed("1") }
        btnTwo.setOnClickListener { numberPressed("2") }
        btnThree.setOnClickListener { numberPressed("3") }
        btnFour.setOnClickListener { numberPressed("4") }
        btnFive.setOnClickListener { numberPressed("5") }
        btnSix.setOnClickListener { numberPressed("6") }
        btnSeven.setOnClickListener { numberPressed("7") }
        btnEight.setOnClickListener { numberPressed("8") }
        btnNine.setOnClickListener { numberPressed("9") }
        btnCero.setOnClickListener { numberPressed("0") }
        btnPoint.setOnClickListener { numberPressed(".") }

        btnCle.setOnClickListener { resetAll() }

        btnSum.setOnClickListener { operationPressed(SUMA) }
        btnRes.setOnClickListener { operationPressed(RESTA) }
        btnMul.setOnClickListener { operationPressed(MULTIPLICACION) }
        btnDiv.setOnClickListener { operationPressed(DIVISION) }

        btnIgl.setOnClickListener { resolvePressed() }
    }

    private fun numberPressed(num: String){
        if(txtResult.text == "0" && num != ".") {
            txtResult.text = "$num"
        } else {
            txtResult.text = "${txtResult.text}$num"
        }

        if(operacion == SIN_OPERACION){
            num1 = txtResult.text.toString().toDouble()
        } else {
            num2 = txtResult.text.toString().toDouble()
        }
    }

    private fun operationPressed(operacion: Int){
        this.operacion = operacion
        num1 = txtResult.text.toString().toDouble()

        txtResult.text = "0"
    }

    private fun resolvePressed(){

        val result = when(operacion) {
            SUMA -> num1 + num2
            RESTA -> num1 - num2
            MULTIPLICACION -> num1 * num2
            DIVISION -> num1 / num2
            else -> 0
        }

        num1 = result as Double

        txtResult.text = if("$result".endsWith(".0")) { "$result".replace(".0","") } else { "%.2f".format(result) }
    }

    private fun resetAll(){
        txtResult.text = "0"
        num1 = 0.0
        num2 = 0.0
    }

    companion object {
        const val SUMA = 1
        const val RESTA = 2
        const val MULTIPLICACION = 3
        const val DIVISION = 4
        const val SIN_OPERACION = 0
    }
}