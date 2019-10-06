package com.padcmyanmar.padc9plantassignment9.persistence

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.padcmyanmar.padc9plantassignment9.data.vos.PlantVO
import com.padcmyanmar.padc9plantassignment9.persistence.dao.PlantDao
import com.padcmyanmar.padc9plantassignment9.persistence.typeconverter.TipsConverter
import com.padcmyanmar.padc9plantassignment9.persistence.typeconverter.UploadUserConverter
import com.padcmyanmar.padc9plantassignment9.utils.PLANT_DB

@Database(entities = [PlantVO::class], version = 1, exportSchema = false)
@TypeConverters(TipsConverter::class,UploadUserConverter::class)
abstract class PlantDatabase : RoomDatabase() {

    abstract fun plantDao(): PlantDao

    companion object {
        private var instance: PlantDatabase? = null

        fun getInstance(context: Context): PlantDatabase{
            if (instance==null){
                instance=Room.databaseBuilder(context,PlantDatabase::class.java, PLANT_DB)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
            val db = instance!!

            return db
        }
    }
}