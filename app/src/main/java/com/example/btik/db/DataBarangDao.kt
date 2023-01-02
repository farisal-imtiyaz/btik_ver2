package com.example.btik.db

import androidx.room.*
import com.example.btik.dashboard.DataBarang
import kotlinx.coroutines.flow.Flow

@Dao
interface DataBarangDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addData(dataBarang: DataBarang)

    @Query("SELECT * FROM dataBarang")
    fun getAllData(): Flow<List<DataBarang>>

    @Update
    suspend fun updateData(dataBarang: DataBarang)

    @Query("DELETE FROM dataBarang")
    fun deleteData()
}