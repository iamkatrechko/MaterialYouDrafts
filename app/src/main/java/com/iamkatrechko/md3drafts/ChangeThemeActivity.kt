package com.iamkatrechko.md3drafts

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.color.DynamicColors

class ChangeThemeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (themeMode == 1) {
            DynamicColors.applyIfAvailable(this)
        } else if (themeMode == 2) {
            DynamicColors.applyIfAvailable(this, R.style.Theme_MaterialYouDrafts_AllDynamic)
        }
        setContentView(R.layout.activity_change_theme)
        findViewById<Button>(R.id.btn_change_theme_0).setOnClickListener {
            themeMode = 0
            recreate()
        }
        findViewById<Button>(R.id.btn_change_theme_1).setOnClickListener {
            themeMode = 1
            recreate()
        }
        findViewById<Button>(R.id.btn_change_theme_2).setOnClickListener {
            themeMode = 2
            recreate()
        }
    }

    companion object {

        /**
         * Режим темы
         * 0 - стандартная
         * 1 - стандартная полу-динамическая
         * 2 - Material You
         */
        private var themeMode = 0
    }
}