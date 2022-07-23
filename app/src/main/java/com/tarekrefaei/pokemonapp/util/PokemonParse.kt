package com.tarekrefaei.pokemonapp.util

import androidx.compose.ui.graphics.Color
import com.tarekrefaei.pokemonapp.data.remote.response.Stat
import com.tarekrefaei.pokemonapp.data.remote.response.Type
import com.tarekrefaei.pokemonapp.ui.theme.*
import java.util.*

fun parseTypeToColor(type: Type) : Color{
    return when (type.type.name.lowercase(Locale.ROOT)){
        "normal" -> TypeNormal
        "fire" -> TypeFire
        "water" -> TypeWater
        "electric" -> TypeElectric
        "grass" -> TypeGrass
        "ice" -> TypeIce
        "fighting" -> TypeFighting
        "poison" -> TypePoison
        "ground" -> TypeGround
        "flying" -> TypeFlying
        "psychic" -> TypePsychic
        "bug" -> TypeBug
        "rock" -> TypeRock
        "ghost" -> TypeGhost
        "dragon" -> TypeDragon
        "dark" -> TypeDark
        "fairy" -> TypeFairy
        else -> Color.Black
    }
}

fun parseStateToColor(stat: Stat):Color{
    return when(stat.stat.name.lowercase()){
        "hp" -> HPColor
        "attack" -> AtkColor
        "defense" -> DefColor
        "special-attack" -> SpAtkColor
        "special-defense" -> SpDefColor
        "speed" -> SpdColor
        else -> Color.White
    }
}

fun parseStateToAbbr(stat: Stat):String{
    return when(stat.stat.name.lowercase()){
        "hp" -> "HP"
        "attack" -> "Atk"
        "defense" -> "Def"
        "special-attack" -> "SpAtk"
        "special-defense" -> "SpDef"
        "speed" -> "Spd"
        else -> ""
    }
}