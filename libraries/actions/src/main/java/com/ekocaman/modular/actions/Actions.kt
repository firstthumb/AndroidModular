package com.ekocaman.modular.libraries.actions

import android.content.Context
import android.content.Intent

object Actions {

    fun openLoginIntent(context: Context) = internalIntent(context, "com.ekocaman.modular.login.open")

    private fun internalIntent(context: Context, action: String) = Intent(action).setPackage(context.packageName)
}