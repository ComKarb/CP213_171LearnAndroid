package com.example.a171lablearnandroid.utils

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Test

/**
 * ทดสอบการทำงานของ SharedPreferencesUtil เมื่อไม่มี Context
 * (ใช้ JUnit ธรรมดาโดยปราศจาก MockK)
 * เนื่องจาก .init() ยังไม่ถูกเรียกดังนั้นตัวแปร sharedPreferences จึงเป็น null
 * และตามโค้ดที่เราเขียนไว้ เมื่อเป็น null มันควรจะคืนค่า default กลับมาเสมอ
 */
class SharedPreferencesUtilTest {

    @Test
    fun testGetStringWithNullPrefsReturnsDefaultValue() {
        val expectedDefault = "Not Found"
        // ทดสอบการเรียกใช้งาน getString โดยไม่ได้ .init() (เพราะไม่มี Context ทำให้เป็น null)
        val result = SharedPreferencesUtil.getString("some_key", expectedDefault)

        assertEquals("ควรจะได้ค่า Default คืนมาหาก SharedPrefs ยังไม่ถูก Initialize", expectedDefault, result)
    }

    @Test
    fun testGetIntWithNullPrefsReturnsDefaultValue() {
        val expectedDefault = 99
        val result = SharedPreferencesUtil.getInt("my_int_key", expectedDefault)

        assertEquals("ควรจะได้ค่า 99 ตาม Default", expectedDefault, result)
    }

    @Test
    fun testGetBooleanWithNullPrefsReturnsDefaultValue() {
        val expectedDefault = false
        val result = SharedPreferencesUtil.getBoolean("my_boolean", expectedDefault)

        assertFalse("ควรจะได้ค่า boolean กลางที่พาสเข้าไป", result)
    }

    @Test
    fun testDefaultFallbackFunctions() {
        // ทดสอบเมื่อไม่ส่ง defaultValue เลย
        assertEquals("", SharedPreferencesUtil.getString("any_key"))
        assertEquals(0, SharedPreferencesUtil.getInt("any_key"))
        assertEquals(false, SharedPreferencesUtil.getBoolean("any_key"))
    }
}
