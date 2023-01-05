package com.example.btik.dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001dB\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\n2\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\f\u0010\u001b\u001a\u00020\u001c*\u00020\u001cH\u0002R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0007\u00a8\u0006\u001e"}, d2 = {"Lcom/example/btik/dashboard/ProductAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/btik/dashboard/ProductAdapter$ProductViewHolder;", "productList", "Ljava/util/ArrayList;", "Lcom/example/btik/dashboard/DataBarang;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "onItemClick", "Lkotlin/Function1;", "", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "getProductList", "()Ljava/util/ArrayList;", "setProductList", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "toCurrencyFormat", "", "ProductViewHolder", "app_debug"})
public final class ProductAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.btik.dashboard.ProductAdapter.ProductViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.example.btik.dashboard.DataBarang> productList;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super com.example.btik.dashboard.DataBarang, kotlin.Unit> onItemClick;
    
    public ProductAdapter(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.example.btik.dashboard.DataBarang> productList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.example.btik.dashboard.DataBarang> getProductList() {
        return null;
    }
    
    public final void setProductList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.example.btik.dashboard.DataBarang> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<com.example.btik.dashboard.DataBarang, kotlin.Unit> getOnItemClick() {
        return null;
    }
    
    public final void setOnItemClick(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super com.example.btik.dashboard.DataBarang, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.btik.dashboard.ProductAdapter.ProductViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.btik.dashboard.ProductAdapter.ProductViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    private final java.lang.String toCurrencyFormat(java.lang.String $this$toCurrencyFormat) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/btik/dashboard/ProductAdapter$ProductViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "v", "Lcom/example/btik/databinding/ItemListBarangBinding;", "(Lcom/example/btik/dashboard/ProductAdapter;Lcom/example/btik/databinding/ItemListBarangBinding;)V", "getV", "()Lcom/example/btik/databinding/ItemListBarangBinding;", "setV", "(Lcom/example/btik/databinding/ItemListBarangBinding;)V", "app_debug"})
    public final class ProductViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private com.example.btik.databinding.ItemListBarangBinding v;
        
        public ProductViewHolder(@org.jetbrains.annotations.NotNull
        com.example.btik.databinding.ItemListBarangBinding v) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.btik.databinding.ItemListBarangBinding getV() {
            return null;
        }
        
        public final void setV(@org.jetbrains.annotations.NotNull
        com.example.btik.databinding.ItemListBarangBinding p0) {
        }
    }
}