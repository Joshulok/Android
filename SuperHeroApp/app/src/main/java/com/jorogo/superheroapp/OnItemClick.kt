package com.jorogo.superheroapp

import com.jorogo.superheroapp.model.Superhero

interface OnItemClick {
    fun onItemClick( hero: Superhero)
}