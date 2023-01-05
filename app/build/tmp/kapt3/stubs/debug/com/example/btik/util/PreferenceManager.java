package com.example.btik.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0016\u0018\u0000 \'2\u00020\u0001:\u0001\'B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0006H\u0016J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0010H\u0016J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0006H\u0016J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0006H\u0016J\u0010\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0006H\u0016J\u0010\u0010#\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0006H\u0016J\u0010\u0010&\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/example/btik/util/PreferenceManager;", "Lcom/example/btik/util/IPreferenceHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "PREFS_NAME", "", "preferences", "Landroid/content/SharedPreferences;", "clearPrefs", "", "clearSpecificPrefs", "key", "getCityAddress", "getEmail", "getIsLogin", "", "getItemName", "getPhoneNumber", "getPhoneNumberAddress", "getPostalCodeAddress", "getProfilePicture", "getStreetAddress", "getUsername", "setCityAddress", "cityAddress", "setEmail", "setIsLogin", "setItemName", "itemName", "setPhoneNumber", "setPhoneNumberAddress", "phoneNumberAddress", "setPostalCodeAddress", "postalCodeAddress", "setProfilePicture", "setStreetAddress", "streetAddress", "setUsername", "Companion", "app_debug"})
public class PreferenceManager implements com.example.btik.util.IPreferenceHelper {
    private final java.lang.String PREFS_NAME = "SharedPreferenceBtik";
    private android.content.SharedPreferences preferences;
    @org.jetbrains.annotations.NotNull
    public static final com.example.btik.util.PreferenceManager.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String STREET_ADDRESS = "street_address";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CITY_ADDRESS = "city_address";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PHONE_NUMBER_ADDRESS = "phone_number_address";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String POSTAL_CODE_ADDRESS = "postal_code_address";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ITEM_NAME_CHECKOUT = "item_name_checkout";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PROFILE_PICTURE = "profile_picture";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USERNAME = "username";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EMAIL = "email";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PHONE_NUMBER = "phone_number";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String IS_LOGIN = "is_Login";
    
    public PreferenceManager(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @java.lang.Override
    public void setStreetAddress(@org.jetbrains.annotations.NotNull
    java.lang.String streetAddress) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getStreetAddress() {
        return null;
    }
    
    @java.lang.Override
    public void setCityAddress(@org.jetbrains.annotations.NotNull
    java.lang.String cityAddress) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getCityAddress() {
        return null;
    }
    
    @java.lang.Override
    public void setPhoneNumberAddress(@org.jetbrains.annotations.NotNull
    java.lang.String phoneNumberAddress) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getPhoneNumberAddress() {
        return null;
    }
    
    @java.lang.Override
    public void setPostalCodeAddress(@org.jetbrains.annotations.NotNull
    java.lang.String postalCodeAddress) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getPostalCodeAddress() {
        return null;
    }
    
    @java.lang.Override
    public void setItemName(@org.jetbrains.annotations.NotNull
    java.lang.String itemName) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getItemName() {
        return null;
    }
    
    @java.lang.Override
    public void clearPrefs() {
    }
    
    @java.lang.Override
    public void clearSpecificPrefs(@org.jetbrains.annotations.NotNull
    java.lang.String key) {
    }
    
    @java.lang.Override
    public void setProfilePicture(@org.jetbrains.annotations.NotNull
    java.lang.String key) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getProfilePicture() {
        return null;
    }
    
    @java.lang.Override
    public void setUsername(@org.jetbrains.annotations.NotNull
    java.lang.String key) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getUsername() {
        return null;
    }
    
    @java.lang.Override
    public void setEmail(@org.jetbrains.annotations.NotNull
    java.lang.String key) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getEmail() {
        return null;
    }
    
    @java.lang.Override
    public void setPhoneNumber(@org.jetbrains.annotations.NotNull
    java.lang.String key) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getPhoneNumber() {
        return null;
    }
    
    @java.lang.Override
    public boolean getIsLogin() {
        return false;
    }
    
    @java.lang.Override
    public void setIsLogin(boolean key) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/btik/util/PreferenceManager$Companion;", "", "()V", "CITY_ADDRESS", "", "EMAIL", "IS_LOGIN", "ITEM_NAME_CHECKOUT", "PHONE_NUMBER", "PHONE_NUMBER_ADDRESS", "POSTAL_CODE_ADDRESS", "PROFILE_PICTURE", "STREET_ADDRESS", "USERNAME", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}