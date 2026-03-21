package com.example.labo01

import org.junit.Test

class Ejercicio1 {
    class Computadora(
        val Marca: String,
        var RAM: Int,
        var SpaceMemory: Int,
        var OperatingSystem: String
    ) {

        var estadoEncendida: Boolean = false
        var programasInstalados: MutableList<String> = mutableListOf()

        fun encendida() {
            estadoEncendida = true
            println("La computadora marca $Marca esta encendida")
        }

        fun apagada() {
            estadoEncendida = false
            println("La computadora marca $Marca se va a apagar")
        }

        fun programasActuales() {
            val ActualYear: String = "2026"
            val programs26 = programasInstalados.filter { it.contains(ActualYear) }

            if (programs26.isEmpty()) {
                println("No hay programas instalados que sean del actual year")
            } else {
                println("Los programas instalados en el actual year: $programs26")
            }
        }
    }

    @Test
    fun main() {

        val miCompu = Computadora("HP", 8, 250, "Linux")
        miCompu.RAM = 16
        miCompu.SpaceMemory = 500
        miCompu.OperatingSystem =   "Windows"

        miCompu.programasInstalados.add("Notion 2026")
        miCompu.programasInstalados.add("Facebook 2024")
        miCompu.programasInstalados.add("Android Studio 2026")
        miCompu.programasInstalados.add("Spotify 2022")

        miCompu.encendida()
        println("Mi compu tiene estas cualidades: RAM de ${miCompu.RAM} , Memoria de ${miCompu.SpaceMemory} y una sistema operativo ${miCompu.OperatingSystem}")
    }
}
