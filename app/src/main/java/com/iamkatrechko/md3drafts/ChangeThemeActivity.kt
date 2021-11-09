package com.iamkatrechko.md3drafts

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.color.DynamicColors

class ChangeThemeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (isMdc3) {
            DynamicColors.applyIfAvailable(this)
        }
        setContentView(R.layout.activity_change_theme)
        findViewById<Button>(R.id.btn_change_theme).setOnClickListener {
            isMdc3 = !isMdc3
            recreate()
        }
    }

    companion object {

        private var isMdc3 = false
    }
}