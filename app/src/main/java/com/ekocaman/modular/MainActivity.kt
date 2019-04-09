package com.ekocaman.modular

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ekocaman.modular.libraries.actions.Actions

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(Actions.openLoginIntent(this))
    }
}
