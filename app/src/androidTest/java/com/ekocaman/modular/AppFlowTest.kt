package com.ekocaman.modular

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

class AppFlowTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun test_criticalUserFlow_throughoutEntireApp() {
        onView(withId(com.ekocaman.modular.login.R.id.button_login_signin)).perform(click())
    }
}
