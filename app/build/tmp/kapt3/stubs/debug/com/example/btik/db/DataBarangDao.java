package com.example.btik.db;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0003H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH\'J\u0019\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/btik/db/DataBarangDao;", "", "addData", "", "dataBarang", "Lcom/example/btik/dashboard/DataBarang;", "(Lcom/example/btik/dashboard/DataBarang;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteData", "getAllData", "Lkotlinx/coroutines/flow/Flow;", "", "updateData", "app_debug"})
public abstract interface DataBarangDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object addData(@org.jetbrains.annotations.NotNull
    com.example.btik.dashboard.DataBarang dataBarang, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM dataBarang")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.btik.dashboard.DataBarang>> getAllData();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Update
    public abstract java.lang.Object updateData(@org.jetbrains.annotations.NotNull
    com.example.btik.dashboard.DataBarang dataBarang, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @androidx.room.Query(value = "DELETE FROM dataBarang")
    public abstract void deleteData();
}