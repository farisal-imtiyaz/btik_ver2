package com.example.btik.dashboard;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@androidx.room.Entity(tableName = "dataBarang")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005H\u00c6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u00d6\u0003J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006-"}, d2 = {"Lcom/example/btik/dashboard/DataBarang;", "Landroid/os/Parcelable;", "uid", "", "namaBarang", "", "hargaBarang", "", "imgBarang", "info", "(ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getHargaBarang", "()J", "setHargaBarang", "(J)V", "getImgBarang", "()Ljava/lang/String;", "setImgBarang", "(Ljava/lang/String;)V", "getInfo", "setInfo", "getNamaBarang", "setNamaBarang", "getUid", "()I", "setUid", "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class DataBarang implements android.os.Parcelable {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int uid;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "namaBarang")
    private java.lang.String namaBarang;
    @androidx.room.ColumnInfo(name = "hargaBarang")
    private long hargaBarang;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "imgBarang")
    private java.lang.String imgBarang;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "info")
    private java.lang.String info;
    public static final android.os.Parcelable.Creator<com.example.btik.dashboard.DataBarang> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.btik.dashboard.DataBarang copy(int uid, @org.jetbrains.annotations.NotNull()
    java.lang.String namaBarang, long hargaBarang, @org.jetbrains.annotations.NotNull()
    java.lang.String imgBarang, @org.jetbrains.annotations.NotNull()
    java.lang.String info) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public DataBarang() {
        super();
    }
    
    public DataBarang(int uid, @org.jetbrains.annotations.NotNull()
    java.lang.String namaBarang, long hargaBarang, @org.jetbrains.annotations.NotNull()
    java.lang.String imgBarang, @org.jetbrains.annotations.NotNull()
    java.lang.String info) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getUid() {
        return 0;
    }
    
    public final void setUid(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNamaBarang() {
        return null;
    }
    
    public final void setNamaBarang(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long getHargaBarang() {
        return 0L;
    }
    
    public final void setHargaBarang(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImgBarang() {
        return null;
    }
    
    public final void setImgBarang(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getInfo() {
        return null;
    }
    
    public final void setInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.example.btik.dashboard.DataBarang> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.btik.dashboard.DataBarang createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.btik.dashboard.DataBarang[] newArray(int size) {
            return null;
        }
    }
}