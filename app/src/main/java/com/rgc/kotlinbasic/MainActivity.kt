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

        // Tipos de Datos
        tiposDeDatos()

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

    /**
     * Tipos de datos
     */
    private fun tiposDeDatos() {

        //Tipos de datos numericos (Byte, Short, Integer, Double, Float, Long)
        //Enteros (Integer)
        var int1 : Int = 2
        var int2 = 5
        println("Suma de enteros : ${int1 + int2}")

        //Decimales (Double, Float)
        var double1 = 2.6
        var float1 = 3.1f
        println("Suma de enteros y double :  ${int1 + double1}")
        println("print float $float1")

        //Tipos de datos de cadena de texto (String)
        var myString1 = "Soy una cadena de texto"
        val myString2 : String = "Soy otra segunda cadena de texto"
        val myString3 = myString1 + " 'concatenada con' " + myString2
        println("print cadena de texto :  $myString1")
        println(myString2)
        println(myString3)

        //Tipos de datos lógicos (Boolean - Bool)
        val boolean1 = true
        val boolean2 = false
        println(boolean1 == boolean2)
        println(boolean1 && boolean2)
        println(boolean1 || boolean2)



    }






}