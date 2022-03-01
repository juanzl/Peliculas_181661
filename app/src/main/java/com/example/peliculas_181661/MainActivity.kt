package com.example.peliculas_181661

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var peliculas: ArrayList<Pelicula> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llenar_peliculas()

        var adaptador = AdaptadorMovies(this, peliculas)

        var listview: ListView = findViewById(R.id.listvew)

        listview.adapter = adaptador
    }

    fun llenar_peliculas(){
        val pelicula1 = Pelicula(1, getString(R.string.peli1),getString(R.string.peli1_sinop), 120, R.drawable.strange)
        peliculas.add(pelicula1)

        val pelicula2 = Pelicula(2,getString(R.string.peli2),getString(R.string.peli2_sinop), 88, R.drawable.strange)
        peliculas.add(pelicula2)

        val pelicula3 = Pelicula(3,getString(R.string.peli3),getString(R.string.peli3_sinop), 108, R.drawable.strange)
        peliculas.add(pelicula3)

    }
}