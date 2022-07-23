package com.tarekrefaei.pokemonapp.di

import com.tarekrefaei.pokemonapp.api.PokeApi
import com.tarekrefaei.pokemonapp.repo.PokemonRepo
import com.tarekrefaei.pokemonapp.util.Const.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providePokeApi(): PokeApi {
        return Retrofit
            .Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(PokeApi::class.java)
    }

    @Singleton
    @Provides
    fun providePokemonRepo(
        api: PokeApi
    ) = PokemonRepo(api)
}