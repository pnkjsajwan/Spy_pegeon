package com.example.spy_pegeon.db

import androidx.room.TypeConverter
import com.example.spy_pegeon.models.Source

class Converters {
    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}