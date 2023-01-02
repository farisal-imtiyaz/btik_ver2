package com.example.btik.dashboard

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "dataBarang")
@Parcelize
data class DataBarang (
    @PrimaryKey(autoGenerate = true)
    var uid : Int = 0,
    @ColumnInfo(name = "namaBarang")
    var namaBarang : String = "",
    @ColumnInfo(name = "hargaBarang")
    var hargaBarang : Long = 0L,
    @ColumnInfo(name = "imgBarang")
    var imgBarang : String = "",
    @ColumnInfo(name = "info")
    var info : String = ""
):Parcelable