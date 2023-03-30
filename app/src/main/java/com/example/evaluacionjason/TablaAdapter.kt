package com.example.evaluacionjason

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.evaluacionjason.databinding.ItemTablaBinding


    class TablaAdapter(private val coordinadores: List<Tabla>) :
        RecyclerView.Adapter<TablaAdapter.CoordinadorViewHolder>() {

        inner class CoordinadorViewHolder(private val binding: ItemTablaBinding) :
            RecyclerView.ViewHolder(binding.root) {

            fun bind(data: Tabla) {
                binding.textViewNombres.text = data.nombres
                binding.textViewApeliidos.text = data.apeliidos
                binding.textViewFechaNac.text = data.fechaNac
                binding.textViewTitulo.text = data.titulo
                binding.textViewEmail.text = data.email
                binding.textViewFacultad.text = data.facultad
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoordinadorViewHolder {
            val binding = ItemTablaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return CoordinadorViewHolder(binding)
        }

        override fun onBindViewHolder(holder: CoordinadorViewHolder, position: Int) {
            holder.bind(coordinadores[position])
        }

        override fun getItemCount(): Int {
            return coordinadores.size
        }
    }

