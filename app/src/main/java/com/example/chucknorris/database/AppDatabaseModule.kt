package com.example.chucknorris.database

import androidx.room.Room
import org.koin.dsl.module

val database = module {
    single {
        Room.databaseBuilder(get(), AppDatabase::class.java, "app").build()
    }
    single {
        get<AppDatabase>().jokeDAO()
    }
}