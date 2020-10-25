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

        // Condicional sentencia if / else
        condicionalIf()

        // Condifional sentencia when / else
        condicionalWhen()

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

        // Constante
        val myConst = 1
        println("He creado $myConst contante en Kotlin")

        // No se puede asignar un valor distinto a una constante ya creada con un valor
        //myConst = 2
        println("No se puede asignar un valor distinto a una constante ya creada con un valor")
    }

    /**
     * Tipos de datos en Kotlin
     */
    private fun tiposDeDatos() {

        // Tipos de datos numericos (Byte, Short, Integer, Double, Float, Long)

        // Enteros (Integer)
        var int1 : Int = 2
        var int2 = 5
        println("Suma de enteros : ${int1 + int2}")

        // Decimales (Double, Float)
        var double1 = 2.6
        var float1 = 3.1f
        println("Suma de enteros y double :  ${int1 + double1}")
        println("print float $float1")

        // Tipos de datos de cadena de texto (String)
        var myString1 = "Soy una cadena de texto"
        val myString2 : String = "Soy otra segunda cadena de texto"
        val myString3 = myString1 + " 'concatenada con' " + myString2
        println("print cadena de texto :  $myString1")
        println(myString2)
        println(myString3)

        // Tipos de datos lógicos (Boolean - Bool)
        val boolean1 = true
        val boolean2 = false
        println(boolean1 == boolean2)
        println(boolean1 && boolean2)
        println(boolean1 || boolean2)

    }

    /**
     * Condicionales sentencia if
     *
     * Operadores condicionales aritmeticos
     *
     * > mayor que
     * > menor que
     * >= mayor o igual que
     * <= menor o igual que
     * == igual que
     * != diferente o desigual que
     *
     * Operadores condicionales logicos
     *
     * && and / y
     * || or / o
     * ! not / negacion
     *
     */
    private fun condicionalIf() {

        var myEdad = 45

        if ((myEdad > 30 && myEdad < 40) || myEdad != 45) {
           println("my edad es mayor a 30 y menor a 40 o diferente de 45")
        } else if (myEdad < 40 || myEdad >= 35) {
            println("my edad es menor a 40 o mayor igual a 30")
        } else if (myEdad  != 34) {
            println("my edad es diferente a 34")
        } else {
            println("my edad es menor que 40 y mayor a 30")
        }

        ////////////////////////////////////////////////////////////////

        var valor = 39
        var retorno : Boolean = false

        if (valor == 40) retorno = true else false

        if(retorno) {
            println("el valor 40 es el correcto")
        } else {
            println("el valor 40 no es el correcto")
        }

    }


    /**
     * Condicional sentencia when / else
     */
    private fun condicionalWhen() {

        var pais : String = "Italia"

        when(pais) {
            "España", "Mexico", "Venezuela", "Peru", "Ecuador" -> {
                println("El idioma es español")
            }
            "Alemania" -> {
                println("El idioma es aleman")
            }
            "Inglaterra" -> {
                println("El idioma es ingles")
            }
            "Italia" -> {
                println("El idioma es italiano")
            }
            else -> {
                println("El idioma predeterminado es el ingles o español")
            }
        }

        /////////////////////////////////////////////////////////////////

        var valor : Int = 8

        when(valor) {
            in 0..1 -> {
                println("El valor 0 o 1")
            }
            2 -> {
                println("El valor es 2")
            }
            in 3..6 -> {
                println("El valor esta entre 3 y 6")
            }
            7,8 -> {
                println("El valor es 7 o 8")
            }
            else -> {
                println("El valor es mas de 8")
            }
        }

    }



}