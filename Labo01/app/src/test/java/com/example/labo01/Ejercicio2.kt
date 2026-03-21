package com.example.labo01

import org.junit.Test

class Ejercicio2 {

    class Calculadora(val Marca: String, val AniosVida: Int, val precio: Int) {
        fun Sumar(a: Int, b: Int): Int {
            return a + b
        }

        fun Restar(a: Int, b: Int): Int {
            return a - b
        }

        fun Dividir(a: Int, b: Int): Int {
            if (b == 0) {
                println("NO se puede dividir entre 0")
                return 0
            }
            return a/b
        }

        fun Multiplicar(a: Int, b: Int): Int {
            return a * b
        }

    }


    @Test
    fun main(){
        val miCalculadora = Calculadora("Casio Contador", 10 , 150)

        println("Informacion de la calculadora: Marca ${miCalculadora.Marca}, Anios de vida ${miCalculadora.AniosVida} y su precio ${miCalculadora.precio}")
        println("Funciones de la calculadora: ")
        println("La funcion sumar " + miCalculadora.Sumar(5,5))
        println("La funcion resta " + miCalculadora.Restar(10,7))
        println("La funcion dividir " + miCalculadora.Dividir(8,0))
        println("La funcion multiplicar " + miCalculadora.Multiplicar(12,4))
    }
}
