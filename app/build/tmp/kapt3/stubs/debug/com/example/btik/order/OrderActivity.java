package com.example.btik.order;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0012\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/btik/order/OrderActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/btik/databinding/ActivityOrderBinding;", "db", "Lcom/example/btik/db/DataBarangDao;", "getDb", "()Lcom/example/btik/db/DataBarangDao;", "db$delegate", "Lkotlin/Lazy;", "mAdapter", "Lcom/example/btik/dashboard/ProductAdapter;", "productList", "Ljava/util/ArrayList;", "Lcom/example/btik/dashboard/DataBarang;", "Lkotlin/collections/ArrayList;", "getProductData", "", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class OrderActivity extends androidx.appcompat.app.AppCompatActivity {
    private java.util.ArrayList<com.example.btik.dashboard.DataBarang> productList;
    private com.example.btik.dashboard.ProductAdapter mAdapter;
    private com.example.btik.databinding.ActivityOrderBinding binding;
    private final kotlin.Lazy db$delegate = null;
    
    public OrderActivity() {
        super();
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
}