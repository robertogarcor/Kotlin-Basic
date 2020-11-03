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

        // Arrays
        arrays()

        // Maps
        maps()

        // Bucle For
        bucleFor()

        // Bucle While
        bucleWhile()

        // Null Safely (Control/seguridad en puntos nulos
        nullSafely()

        // Funciones
        funciones()

        // Classes
        classes()

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

    /**
     * Arrays/Arreglos/List en Kotlin
     */
    private fun arrays() {

        //Vector
        var myArray = arrayOf("a","b") // Array/Vector de 2 posiciones no se pueden arregar mas
        println(myArray.size)

        // ArrayList
        var myArrayList = arrayListOf<String>()
        myArrayList.add("nombre")
        myArrayList.add("edad")
        myArrayList.add("sexo")
        //myArrayList.add(8) // No se puede agregar un elemento int (el arrayList es de Strings(
        println(myArrayList)

        var myArrayListNumber = arrayListOf<Int>(0,1,2,10,18)
        println(myArrayListNumber)

        // Añadir varios elementos
        myArrayList.addAll(listOf("nacionalidad", "profesion"))
        myArrayListNumber.addAll(listOf(4,7,2))
        println(myArrayList)
        println(myArrayListNumber)
        println(myArrayListNumber.size)

        // Acceso a datos
        println(myArray.get(0))
        println(myArray[1])
        println(myArrayList.get(3))
        println(myArrayListNumber[2])

        //Modificar datos
        myArray[0] = "d"
        myArrayList[1] = "edadMod"
        println(myArray[0] + " -- " + myArrayList)

        // Borrar datos
        myArray.drop(0)
        for(pos in myArray) {
            println(pos)
        }

        myArrayList.removeAt(1)
        myArrayListNumber.removeAt(2)
        println(myArrayList)
        println(myArrayListNumber)

        // Otras operaciones
        myArrayListNumber.sort()
        println("ArrayList size:" + myArrayList.size)
        println("ArrayList count:" + myArrayList.count())
        myArrayListNumber.forEach { println(it) }

        println(myArrayList.first())
        println(myArrayListNumber.last())

    }

    /**
     * Mapas o diccionarios en Kotlin
     */
    fun maps() {

        // Declaracion
        var myMap : Map<String, String> = mapOf()
        var myMap2 : Map<Int, String> = mapOf()

        // Inicializacion con datos elementos
        // Mapa mutable -> permite añadir elementos
        myMap = mutableMapOf("Nombre" to "Roberto", "Edad" to "45", "Profesion" to "Desarrollador")
        // Mapa no mutable -> no permite realizar operaciones
        myMap2 = mapOf(1 to "primero", 2 to "segundo", 3 to "tercero")
        println(myMap)
        println(myMap2)

        // Añadir un elemento
        myMap["Sexo"] = "Hombre"
        myMap.put("Nacionalidad", "España")
        println(myMap)

        // Acceso a un dato
        println(myMap2[1])
        println(myMap.get("Nombre"))

        // Actualizar elementos
        myMap["Nombre"] = "Roberto Apellidos"
        myMap.put("Edad", "46")
        println(myMap)

        // Borrar datos
        myMap.remove("Nacionalidad")
        println(myMap)

    }

    /**
     * Bucles for en kotlin
     */
    fun bucleFor() {

        var myArrayList : ArrayList<Int> = arrayListOf<Int>(1,2,3,4,5,7,8,9,10,12)
        var myMap : Map<Int, String> = mutableMapOf(1 to "primero", 2 to "segundo", 3 to "tercero", 4 to "cuarto")

        // Blucle for ArrayList
        for(Number in myArrayList) {
            println(Number)
        }

        // Bucle for Maps
        for((key,valor) in myMap) {
            println("$key = $valor")
        }
        // Bucle for Maps Key / Value Object
        for(element in myMap) {
            println("${element.key} + --- +  ${element.value}")
        }

        // Bucle for con rango
        for (n in 0..20) {
            println(n)
        }
        // Bucle de 0 a 20 de 2 en 2
        for (n in 0..20 step 2) {
            println(n)
        }
        // Bucle entre 0 y 10 no incluidos
        for (n in 0 until 10) {
            println(n)
        }
        // Bucle de 20 a 0
        for (n in 20 downTo 0) {
            println(n)
        }
        // Bucle de 10 a 0 no incluidos
        for (n in 10 until 0) {
            println(n)
        }

    }

    /**
     * Bucle While (Mientras) en Kotlin
     */
    fun bucleWhile() {

        println("While")

        var x = 0
        while(x<10) {
            println(x)
            x++
        }

        println("While 2")

        var j = 0
        while(j<10) {
            println(j)
            j += 2
        }

    }

    /**
     * Null Safely (Control / Seguridad valores null en Kotlin)
     */
    fun nullSafely() {
        var myString = "Una cadena de texto"
        //myString = null // Esto da un error en la compilacion

        // Null Safely
        var myStringNullSafely: String? = "El ? indica que la variable puede se nula 'variable?'"
        myStringNullSafely = null
        println("La variable ahora es null. Valor :" + myStringNullSafely)

        // Safe call (Llamadas seguras)
        //println("Asegurarse/Forzar que una variable no puede se nula con 'variable!!'" + myStringNullSafely!!)

        println("Si una variable puede se nula un control es 'variable?'. Su valor sigue siendo: " + myStringNullSafely?.length)

        myStringNullSafely?.let {
            println(it) // Se ejecuta cuando no es null
        } ?: run {
            println(myStringNullSafely)  // Se ejecuta cuando es null
        }

        myStringNullSafely = "Ya no soy null"
        myStringNullSafely.let {
            println(it)
        } ?: run {
            println("Sigo siendo null")
        }

    }

    /**
     * Funciones en Kotlin
     */
    fun funciones() {

        /**
         * Función sin retorno
         */
        fun funcionHola() {
            println("Hola funcion simple")
        }

        /**
         * Función con un parametro de entrada
         */
        fun funcionUnParametro(cadena: String) {
            println(cadena)
        }

        /**
         * Función suma con varios parametros de entrada
         */
        fun funcionSumaParametros(num1: Int, num2: Int) {
            println("La suma de los parametros enteros de entrada es ${num1 + num2}")
        }

        /**
         * Función con retorno de una operación suma
         */
        fun funcionSumaConRetorno(num1: Int, num2: Int) : Int {
            return num1 + num2
        }

        funcionHola()
        funcionHola()
        funcionUnParametro("Soy una función con un parametro de entrada tipo String")
        funcionSumaParametros(4, 6)
        var suma: Int = funcionSumaConRetorno(6, 10)
        println("Variable suma de la función suma con retorno:  $suma")
        println(funcionSumaConRetorno(funcionSumaConRetorno(10, 10), 20))

    }

    /**
     * Funciones en Kotlin
     */
    fun classes() {

        var roberto = Persona("Roberto", 30, arrayListOf("Deporte", "Lectura"), Persona.TipoPelo.CASTAÑO, null)
        println("${roberto.name} tiene una edad de ${roberto.edad} y un color de pelo ${roberto.colorPelo()}")
        roberto.edad = 35
        println("Ahora la edad de " + roberto.name + " es " +  roberto.edad)
        println("${roberto.name} tiene unas aficiones tales como : ${roberto.aficionesPersona()} y un color de pelo ${roberto.colorPelo()}")

        var pepa = Persona("Pepa", 25, null, Persona.TipoPelo.MORENO, roberto)
        println(pepa.name +
                " tiene una edad de " +
                pepa.edad +
                " unas aficiones " +
                pepa.aficionesPersona() +
                " y un color de pelo " +
                pepa.colorPelo() +
                " ademas es amiga de " +
                pepa.amigos?.name +
                " que tiene una edad de " +
                pepa.amigos?.edad +
                " , un color de pelo " +
                pepa.amigos?.colorPelo() +
                " y unas aficiciones : " +
                pepa.amigos?.aficionesPersona() )

    }


}