package com.namimeow.roleworld.fragment

import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import com.namimeow.roleworld.R
import com.namimeow.roleworld.config.Config
import com.namimeow.roleworld.ui.GreetingTextView

class GreetingFragment : DefaultFragment(R.layout.greeting_layout) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        showGreetingText()
    }

    private fun showGreetingText() {
        val greetingText = findViewById<GreetingTextView>(R.id.greeting_text)
        greetingText.showText("Привет, ${Config.nickname}")
        findViewById<RelativeLayout>(R.id.greeting_text_layout).setOnClickListener {
            greetingText.newText("Давай настроим твой аккаунт")
        }
    }
}