package com.example.btik.checkout;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0002J\u0012\u0010\'\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\f\u0010*\u001a\u00020+*\u00020+H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u001dj\b\u0012\u0004\u0012\u00020\u0006`\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u0006,"}, d2 = {"Lcom/example/btik/checkout/CheckoutActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/btik/databinding/ActivityCheckoutBinding;", "dataBarang", "Lcom/example/btik/dashboard/DataBarang;", "db", "Lcom/example/btik/db/DataBarangDao;", "getDb", "()Lcom/example/btik/db/DataBarangDao;", "db$delegate", "Lkotlin/Lazy;", "itemBarang", "", "mAdapter", "Lcom/example/btik/dashboard/ProductAdapter;", "mDataBase", "Lcom/google/firebase/database/DatabaseReference;", "getMDataBase", "()Lcom/google/firebase/database/DatabaseReference;", "setMDataBase", "(Lcom/google/firebase/database/DatabaseReference;)V", "preferenceHelper", "Lcom/example/btik/util/IPreferenceHelper;", "getPreferenceHelper", "()Lcom/example/btik/util/IPreferenceHelper;", "preferenceHelper$delegate", "productList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "shippingCost", "getShippingCost", "()I", "setShippingCost", "(I)V", "getProductData", "", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "toCurrencyFormat", "", "app_debug"})
public final class CheckoutActivity extends androidx.appcompat.app.AppCompatActivity {
    public com.google.firebase.database.DatabaseReference mDataBase;
    private java.util.ArrayList<com.example.btik.dashboard.DataBarang> productList;
    private com.example.btik.dashboard.ProductAdapter mAdapter;
    private com.example.btik.databinding.ActivityCheckoutBinding binding;
    private final kotlin.Lazy preferenceHelper$delegate = null;
    private com.example.btik.dashboard.DataBarang dataBarang;
    private int shippingCost = 20000;
    private int itemBarang = 0;
    private final kotlin.Lazy db$delegate = null;
    
    public CheckoutActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.database.DatabaseReference getMDataBase() {
        return null;
    }
    
    public final void setMDataBase(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DatabaseReference p0) {
    }
    
    private final com.example.btik.util.IPreferenceHelper getPreferenceHelper() {
        return null;
    }
    
    public final int getShippingCost() {
        return 0;
    }
    
    public final void setShippingCost(int p0) {
    }
    
    private final com.example.btik.db.DataBarangDao getDb() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final void getProductData() {
    }
    
    private final java.lang.String toCurrencyFormat(java.lang.String $this$toCurrencyFormat) {
        return null;
    }
}