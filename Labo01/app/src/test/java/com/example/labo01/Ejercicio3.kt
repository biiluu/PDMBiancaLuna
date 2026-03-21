package com.example.labo01

import org.junit.Test

class Ejercicio3 {

    class Estudiante(val NombreStudent : String, val Carnet : String, val Asignatura : String)

    @Test
    fun listaEstudiantes(){
        val Ciclo03 = listOf(
            Estudiante("Daniel Alfaro"," 00001224", "Analisis Numerico" ),
            Estudiante("Alex Ramirez", "00009423" , "PDM") ,
            Estudiante("Andrea Ayala", "00052325", "PDM"),
            Estudiante("Juan Pablo Carpio", "00004424", "PDM"),
            Estudiante("Andrea Hernandez", "00024224", "Analisis Numerico"),
            Estudiante("Ana Ramirez", "00234524", "Analisis Numerico"),
            Estudiante("Allen Alvarado" , " 00024524", "Analisis Numerico"),
        )
        val filtroEstudiantes = Ciclo03.filter { it.Asignatura == "PDM" }
        println("Estudiantes en Programacion de Dispositivos Moviles:")

        filtroEstudiantes.forEach { println("${it.NombreStudent}-${it.Carnet}") }
    }

}