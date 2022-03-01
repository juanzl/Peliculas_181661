package com.example.peliculas_181661

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import java.security.AccessControlContext

class AdaptadorMovies: BaseAdapter {

    lateinit var context: Context
    var peliculas: ArrayList<Pelicula> = ArrayList()

    constructor(context: Context, pliculas: ArrayList<Pelicula>){
        this.context = context
        this.peliculas = peliculas

    }

    override fun getCount(): Int {
        //indica el numero de objetos en mi lista
        return peliculas.size
    }

    override fun getItem(p0: Int): Any {
        //indica el elemento individual con el cual puedo interactuar
        return peliculas[p0]
    }

    override fun getItemId(p0: Int): Long {
        //pide el id del elemento que estemos trabajando
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        //obtener un inflador
        val inflador = LayoutInflater.from(context)
        var vista = inflador.inflate(R.layout.peliculas_view, null)

        var iv_img: ImageView = vista.findViewById(R.id.img_view)
        var tv_nombre: TextView = vista.findViewById(R.id.tv_nombre)

        var pelicula: Pelicula = peliculas[p0]

        iv_img.setImageResource(pelicula.img)
        tv_nombre.setText(pelicula.nombre)

        return vista
    }
}