package com.example.usrgam.aplicacion07

import java.util.*

/**
 * Created by USRGAM on 07/05/2018.
 */
class Factory {
    var usuarios:ArrayList<usuario> = ArrayList()

            init {
                usuarios.add(usuario("Danny", "Alvarez", "verde"))
            }
}