package com.padcmyanmar.padc9plantassignment9.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.padcmyanmar.padc9plantassignment9.data.vos.PlantVO

@Dao
abstract class PlantDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertPlants(plants: List<PlantVO>): LongArray

    @Query("SELECT * FROM plants")
    abstract fun getAllPlants(): List<PlantVO>

    @Query("SELECT * FROM plants WHERE plant_id=:id")
    abstract fun getPlantById(id: String): PlantVO
}