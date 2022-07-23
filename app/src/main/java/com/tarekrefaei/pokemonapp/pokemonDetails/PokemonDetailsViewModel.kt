package com.tarekrefaei.pokemonapp.pokemonDetails

import androidx.lifecycle.ViewModel
import com.tarekrefaei.pokemonapp.data.remote.response.Pokemon
import com.tarekrefaei.pokemonapp.repo.PokemonRepo
import com.tarekrefaei.pokemonapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailsViewModel @Inject constructor(

    private val repo: PokemonRepo

) : ViewModel() {

    suspend fun getPokemonInfo (pokemonName : String) : Resource<Pokemon>{
       return repo.getPokemonInfo(pokemonName)
    }

}