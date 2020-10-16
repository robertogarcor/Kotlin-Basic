package com.rgc.kotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Hi Kotlin for Android")

        // Variables y Constantes
        variableConstantes()

    }

    /**
     * Variables y Constantes en Kotlin
     */
    private fun variableConstantes() {
        // Variable (Una variable tiene inicializarse con un tipo de dato o valor
        var myVariable1 : String
        var myVariable2 = "Hola Kotlin!"

        println("Una variable tiene inicializarse con un tipo de dato o valor")

        myVariable1 = "Soy la variable1 creada con un tipo de dato String"
        println(myVariable1)
        println(myVariable2)

        // No se puede cambiar el tipo de dato de una variable/constante ya inicializada.
        //myVariable1 = 1
        //myVariable2 = 2.5
        println("No se puede cambiar el tipo de dato de una variable/constante ya inicializada.")

        var myVariable3 = 1
        var myVariable4 = 5

        println("Esto es la suma de variables 3 y 4 : ${myVariable3 + myVariable4}")

        //Constante
        val myConst = 1
        println("He creado $myConst contante en Kotlin")

        //No se puede asignar un valor distinto a una constante ya creada con un valor
        //myConst = 2
        println("No se puede asignar un valor distinto a una constante ya creada con un valor")
    }




}