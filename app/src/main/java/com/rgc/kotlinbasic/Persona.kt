package com.rgc.kotlinbasic

/**
 * Classe Persona con Constructor embebido en la declaración de classe
 */
class Persona (val name: String,
               var edad: Int,
               var aficiones: ArrayList<String>?,
               val pelo : TipoPelo,
               var amigos: Persona?) {

    /**
     * enum Class -> Tipo de Estructura de datos tipo Interface de variables seguras
     */
    enum class TipoPelo {
        RUBIO,
        CASTAÑO,
        MORENO,
        PELIROJO
    }

    fun colorPelo() : String {
        return this.pelo.toString()
    }

    fun aficionesPersona() : String  {
        aficiones?.let {
            return aficiones.toString()
        } ?: run {
            return aficiones.toString()
        }
    }
}


/**
 * Classe Persona con Constructor Custom no embebido en la declaración de classe
 */
class Persona2 {
    val name: String
    var edad: Int
    var aficiones: ArrayList<String>?
    val pelo: TipoPelo
    var amigos: Persona2?

    enum class TipoPelo {
        RUBIO, CASTAÑO, MORENO, PELIROJO
    }

    constructor(name: String, edad: Int, aficiones: ArrayList<String>?, pelo: TipoPelo, amigos: Persona2) {
        this.name = name
        this.edad = edad
        this.aficiones = aficiones
        this.pelo = pelo
        this.amigos = amigos
    }

    fun colorPelo() : String {
        return this.pelo.toString()
    }

    fun aficionesPersona() : String  {
        aficiones?.let {
            return aficiones.toString()
        } ?: run {
            return aficiones.toString()
        }
    }

}