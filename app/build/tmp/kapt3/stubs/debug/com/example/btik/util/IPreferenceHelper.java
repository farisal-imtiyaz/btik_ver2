package com.example.btik.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0006H&J\b\u0010\f\u001a\u00020\u0006H&J\b\u0010\r\u001a\u00020\u0006H&J\b\u0010\u000e\u001a\u00020\u0006H&J\b\u0010\u000f\u001a\u00020\u0006H&J\b\u0010\u0010\u001a\u00020\u0006H&J\b\u0010\u0011\u001a\u00020\u0006H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0006H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0006H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0006H&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0006H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0006H&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006!"}, d2 = {"Lcom/example/btik/util/IPreferenceHelper;", "", "clearPrefs", "", "clearSpecificPrefs", "key", "", "getCityAddress", "getEmail", "getIsLogin", "", "getItemName", "getPhoneNumber", "getPhoneNumberAddress", "getPostalCodeAddress", "getProfilePicture", "getStreetAddress", "getUsername", "setCityAddress", "cityAddress", "setEmail", "setIsLogin", "setItemName", "itemName", "setPhoneNumber", "setPhoneNumberAddress", "phoneNumberAddress", "setPostalCodeAddress", "postalCodeAddress", "setProfilePicture", "setStreetAddress", "streetAddress", "setUsername", "app_debug"})
public abstract interface IPreferenceHelper {
    
    public abstract void setStreetAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String streetAddress);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getStreetAddress();
    
    public abstract void setCityAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String cityAddress);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCityAddress();
    
    public abstract void setPhoneNumberAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumberAddress);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getPhoneNumberAddress();
    
    public abstract void setPostalCodeAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String postalCodeAddress);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getPostalCodeAddress();
    
    public abstract void setItemName(@org.jetbrains.annotations.NotNull()
    java.lang.String itemName);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getItemName();
    
    public abstract void clearPrefs();
    
    public abstract void clearSpecificPrefs(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    public abstract void setProfilePicture(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getProfilePicture();
    
    public abstract void setUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getUsername();
    
    public abstract void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getEmail();
    
    public abstract void setPhoneNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getPhoneNumber();
    
    public abstract boolean getIsLogin();
    
    public abstract void setIsLogin(boolean key);
}