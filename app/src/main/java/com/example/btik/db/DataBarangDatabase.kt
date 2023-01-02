package com.example.btik.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.btik.dashboard.DataBarang

@Database(
    entities = [DataBarang::class],
    version = 1,
    exportSchema = true
)
abstract class DataBarangDatabase : RoomDatabase() {

    abstract fun dataBarangDao(): DataBarangDao

    companion object {
        @Volatile
        private var INSTANCE: DataBarangDatabase? = null

        fun getDatabase(context: Context): DataBarangDatabase {
            if (INSTANCE == null) {
                synchronized(this) {
                    INSTANCE = buildDatabase(context)
                }
            }
            return INSTANCE!!
        }

        private fun buildDatabase(context: Context): DataBarangDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                DataBarangDatabase::class.java,
                "btik_database"
            )
                .build()
        }
    }
}