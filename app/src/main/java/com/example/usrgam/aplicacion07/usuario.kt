package com.example.usrgam.aplicacion07

/**
 * Created by USRGAM on 07/05/2018.
 */
class usuario (var nombre: String,
               var apellido: String,
               var colorFavorito: String){
    override fun toString():String{
        return "$nombre $apellido"
    }
}