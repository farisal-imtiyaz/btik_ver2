package com.example.btik.util

interface IPreferenceHelper {
    fun setStreetAddress(streetAddress: String)
    fun getStreetAddress(): String
    fun setCityAddress(cityAddress: String)
    fun getCityAddress(): String
    fun setPhoneNumberAddress(phoneNumberAddress: String)
    fun getPhoneNumberAddress(): String
    fun setPostalCodeAddress(postalCodeAddress: String)
    fun getPostalCodeAddress(): String
    fun setItemName(itemName: String)
    fun getItemName(): String
    fun clearPrefs()
    fun clearSpecificPrefs(key : String)
    fun setProfilePicture(key: String)
    fun getProfilePicture(): String
    fun setUsername(key: String)
    fun getUsername(): String
    fun setEmail(key: String)
    fun getEmail(): String
    fun setPhoneNumber(key: String)
    fun getPhoneNumber(): String
    fun getIsLogin() : Boolean
    fun setIsLogin(key: Boolean)
}