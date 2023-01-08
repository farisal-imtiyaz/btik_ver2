package com.example.btik.dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u0012\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\f\u0010 \u001a\u00020\u0004*\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006!"}, d2 = {"Lcom/example/btik/dashboard/ProductViewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "ITEM_NAME_CHECKOUT", "", "binding", "Lcom/example/btik/databinding/ProductViewBinding;", "data", "Lcom/example/btik/dashboard/DataBarang;", "preferenceHelper", "Lcom/example/btik/util/IPreferenceHelper;", "getPreferenceHelper", "()Lcom/example/btik/util/IPreferenceHelper;", "preferenceHelper$delegate", "Lkotlin/Lazy;", "selectedSize", "getSelectedSize", "()Ljava/lang/String;", "setSelectedSize", "(Ljava/lang/String;)V", "totalItem", "", "getTotalItem", "()I", "setTotalItem", "(I)V", "initButtonSize", "", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "toCurrencyFormat", "app_debug"})
public final class ProductViewActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.btik.databinding.ProductViewBinding binding;
    private com.example.btik.dashboard.DataBarang data;
    private int totalItem = 1;
    @org.jetbrains.annotations.NotNull
    private java.lang.String selectedSize = "";
    private final kotlin.Lazy preferenceHelper$delegate = null;
    private final java.lang.String ITEM_NAME_CHECKOUT = "item_name_checkout";
    
    public ProductViewActivity() {
        super();
    }
    
    public final int getTotalItem() {
        return 0;
    }
    
    public final void setTotalItem(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSelectedSize() {
        return null;
    }
    
    public final void setSelectedSize(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    private final com.example.btik.util.IPreferenceHelper getPreferenceHelper() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final java.lang.String toCurrencyFormat(java.lang.String $this$toCurrencyFormat) {
        return null;
    }
    
    private final void initButtonSize() {
    }
}