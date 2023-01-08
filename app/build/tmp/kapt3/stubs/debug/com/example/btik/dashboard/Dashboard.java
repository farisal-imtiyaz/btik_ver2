package com.example.btik.dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/btik/dashboard/Dashboard;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/btik/databinding/ActivityDashboardBinding;", "mAdapter", "Lcom/example/btik/dashboard/ProductAdapter;", "mDataBase", "Lcom/google/firebase/database/DatabaseReference;", "getMDataBase", "()Lcom/google/firebase/database/DatabaseReference;", "setMDataBase", "(Lcom/google/firebase/database/DatabaseReference;)V", "productList", "Ljava/util/ArrayList;", "Lcom/example/btik/dashboard/DataBarang;", "Lkotlin/collections/ArrayList;", "getProductData", "", "goToProfileMenu", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "searchProduct", "key", "", "app_debug"})
public final class Dashboard extends androidx.appcompat.app.AppCompatActivity {
    public com.google.firebase.database.DatabaseReference mDataBase;
    private java.util.ArrayList<com.example.btik.dashboard.DataBarang> productList;
    private com.example.btik.dashboard.ProductAdapter mAdapter;
    private com.example.btik.databinding.ActivityDashboardBinding binding;
    
    public Dashboard() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.database.DatabaseReference getMDataBase() {
        return null;
    }
    
    public final void setMDataBase(@org.jetbrains.annotations.NotNull
    com.google.firebase.database.DatabaseReference p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getProductData() {
    }
    
    private final void goToProfileMenu() {
    }
    
    private final void initView() {
    }
    
    private final void searchProduct(java.lang.String key) {
    }
}