package com.namimeow.roleworld

import android.content.Intent
import android.os.Bundle
import android.widget.ViewFlipper
import androidx.fragment.app.FragmentActivity
import com.namimeow.roleworld.config.Config
import com.namimeow.roleworld.fragment.AuthFragment
import com.namimeow.roleworld.service.NetworkService
import java.io.File

class AppActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startService(Intent(this, NetworkService::class.java))

        setContentView(R.layout.app)

        if (configIsExists()) {
            startApp()
        } else {
            initialStart()
        }
    }

    private fun initialStart() {
        AuthFragment.onAuthCallback = {
            /*Config.nickname = it.nickname
            Config.id = it.id
            Config.theme = it.theme
            Config.lang = it.lang

            Config.write(getConfigFile())

            if (it.mode == "sign_in") {
                startApp()
            } else {
                startGreeting()
            }*/

            startGreeting()
        }
    }

    private fun startGreeting() {
        findViewById<ViewFlipper>(R.id.app_initial_flipper).displayedChild = 1

        //Config.write(getConfigFile())
    }

    private fun startApp() {
        findViewById<ViewFlipper>(R.id.app_initial_flipper).displayedChild = 2
    }

    /**
     * check main_conf.json file and create if not exists
     * @return `true` - if config is exists
     * `false` - in any other case
     */
    private fun configIsExists(): Boolean {
        try {
            return getConfigFile().exists()
        } catch (e: Exception) {
            e.printStackTrace()

            return false
        }
    }

    private fun getConfigFile(): File {
        return File("${filesDir.path}/main_config.json")
    }
}