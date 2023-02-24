package com.COMP583.Drinkly.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.COMP583.Drinkly.Drink


@Dao
interface CocktailsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(cocktail: Drink): Long

    @Query("SELECT * FROM cocktails")
    fun getAllArticles(): LiveData<List<Drink>>

    @Delete
    suspend fun deleteArticle(cocktail: Drink)
}