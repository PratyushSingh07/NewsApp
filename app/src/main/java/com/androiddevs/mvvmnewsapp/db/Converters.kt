package com.androiddevs.mvvmnewsapp.db

import androidx.room.TypeConverter
import com.androiddevs.mvvmnewsapp.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source):String{ //converts custom class Source to String
        return source.name
    }

    @TypeConverter
    fun toSource(name:String): Source { //converts String to Source
        return Source(name,name)
    }
}