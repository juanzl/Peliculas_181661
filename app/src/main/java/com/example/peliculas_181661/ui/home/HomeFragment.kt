package com.example.peliculas_181661.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.peliculas_181661.AdaptadorMovies
import com.example.peliculas_181661.Pelicula
import com.example.peliculas_181661.R
import com.example.peliculas_181661.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    var peliculas: ArrayList<Pelicula> = ArrayList()
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        //val textView: TextView = binding.textHome
        //homeViewModel.text.observe(viewLifecycleOwner) {
          //  textView.text = it
        //}

        llenar_peliculas()

        val adaptadorPeliuculas = AdaptadorMovies(root.context, peliculas)

        val listview: ListView = binding.listvewPeliculas

        listview.adapter = adaptadorPeliuculas

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun llenar_peliculas(){
        val pelicula1 = Pelicula(1, getString(R.string.peli1),getString(R.string.peli1_sinop), 120, R.drawable.strange)
        peliculas.add(pelicula1)

        val pelicula2 = Pelicula(2,getString(R.string.peli2),getString(R.string.peli2_sinop), 88, R.drawable.buzz)
        peliculas.add(pelicula2)

        val pelicula3 = Pelicula(3,getString(R.string.peli3),getString(R.string.peli3_sinop), 108, R.drawable.back)
        peliculas.add(pelicula3)

    }
}