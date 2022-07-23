package com.tarekrefaei.pokemonapp.repo

import com.tarekrefaei.pokemonapp.api.PokeApi
import com.tarekrefaei.pokemonapp.data.remote.response.Pokemon
import com.tarekrefaei.pokemonapp.data.remote.response.PokemonList
import com.tarekrefaei.pokemonapp.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PokemonRepo @Inject constructor(
    private val api: PokeApi
) {

    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offset)
        } catch (e: Exception) {
            return Resource.Error(null, "Something Went Wrong")
        }
        return Resource.Success(response)
    }

    suspend fun getPokemonInfo(pokemonName:String): Resource<Pokemon> {
        val response = try {
            api.getPokemonInfo(pokemonName)
        } catch (e: Exception) {
            return Resource.Error(null, "Something Went Wrong")
        }
        return Resource.Success(response)
    }
}