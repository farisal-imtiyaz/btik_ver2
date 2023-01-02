package com.example.btik.util

import android.content.Context
import android.content.SharedPreferences
import kotlinx.coroutines.Job

open class PreferenceManager constructor(context: Context) : IPreferenceHelper {
    private val PREFS_NAME = "SharedPreferenceBtik"
    private var preferences: SharedPreferences
    init {
        preferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    override fun setStreetAddress(streetAddress: String) {
        preferences[STREET_ADDRESS] = streetAddress
    }

    override fun getStreetAddress(): String {
        return preferences[STREET_ADDRESS] ?: ""
    }

    override fun setCityAddress(cityAddress: String) {
        preferences[CITY_ADDRESS] = cityAddress
    }

    override fun getCityAddress(): String {
        return  preferences[CITY_ADDRESS] ?: ""
    }

    override fun setPhoneNumberAddress(phoneNumberAddress: String) {
        preferences[PHONE_NUMBER_ADDRESS] = phoneNumberAddress
    }

    override fun getPhoneNumberAddress(): String {
        return preferences[PHONE_NUMBER_ADDRESS] ?: ""
    }

    override fun setPostalCodeAddress(postalCodeAddress: String) {
        preferences[POSTAL_CODE_ADDRESS] = postalCodeAddress
    }

    override fun getPostalCodeAddress(): String {
        return preferences[POSTAL_CODE_ADDRESS] ?: ""
    }

    override fun setItemName(itemName: String) {
        preferences[ITEM_NAME_CHECKOUT] = itemName
    }

    override fun getItemName(): String {
        return preferences[ITEM_NAME_CHECKOUT] ?: ""
    }

    override fun clearPrefs() {
        preferences.edit().clear().apply()
    }

    override fun clearSpecificPrefs(key: String) {
        preferences.edit().remove(key).apply()
    }

    override fun setProfilePicture(key: String) {
        preferences[PROFILE_PICTURE] = key
    }

    override fun getProfilePicture(): String {
        return preferences[PROFILE_PICTURE] ?: ""
    }

    override fun setUsername(key: String) {
        preferences[USERNAME] = key
    }

    override fun getUsername(): String {
        return preferences[USERNAME] ?: ""
    }

    override fun setEmail(key: String) {
        preferences[EMAIL] = key
    }

    override fun getEmail(): String {
        return preferences[EMAIL] ?: ""
    }

    override fun setPhoneNumber(key: String) {
        preferences[PHONE_NUMBER] = key
    }

    override fun getPhoneNumber(): String {
        return preferences[PHONE_NUMBER] ?: ""
    }

    override fun getIsLogin(): Boolean {
        return preferences[IS_LOGIN] ?: false
    }

    override fun setIsLogin(key: Boolean) {
        preferences[IS_LOGIN] = key
    }

    companion object {
        const val STREET_ADDRESS = "street_address"
        const val CITY_ADDRESS = "city_address"
        const val PHONE_NUMBER_ADDRESS = "phone_number_address"
        const val POSTAL_CODE_ADDRESS = "postal_code_address"
        const val ITEM_NAME_CHECKOUT = "item_name_checkout"
        const val PROFILE_PICTURE = "profile_picture"
        const val USERNAME = "username"
        const val EMAIL = "email"
        const val PHONE_NUMBER = "phone_number"
        const val IS_LOGIN = "is_Login"
    }
}


private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
    val editor = this.edit()
    operation(editor)
    editor.apply()
}


private operator fun SharedPreferences.set(key: String, value: Any?) {
    when (value) {
        is String? -> edit { it.putString(key, value) }
        is Int -> edit { it.putInt(key, value) }
        is Boolean -> edit { it.putBoolean(key, value) }
        is Float -> edit { it.putFloat(key, value) }
        is Long -> edit { it.putLong(key, value) }
        else -> throw UnsupportedOperationException("Not yet implemented")
    }
}

private inline operator fun <reified T : Any> SharedPreferences.get(
    key: String,
    defaultValue: T? = null
): T? {
    return when (T::class) {
        String::class -> getString(key, defaultValue as? String) as T?
        Int::class -> getInt(key, defaultValue as? Int ?: -1) as T?
        Boolean::class -> getBoolean(key, defaultValue as? Boolean ?: false) as T?
        Float::class -> getFloat(key, defaultValue as? Float ?: -1f) as T?
        Long::class -> getLong(key, defaultValue as? Long ?: -1) as T?
        else -> throw UnsupportedOperationException("Not yet implemented")
    }
}