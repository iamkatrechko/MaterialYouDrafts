package com.iamkatrechko.md3drafts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn_change_theme_screen).setOnClickListener {
            startActivity(Intent(this, ChangeThemeActivity::class.java))
        }
    }
}