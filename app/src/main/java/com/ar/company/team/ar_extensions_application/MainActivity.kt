package com.ar.company.team.ar_extensions_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ar.company.team.ar_extensions.l
import com.ar.company.team.ar_extensions.s
import com.ar.company.team.ar_extensions.t
import com.ar.company.team.ar_extensions_application.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Fields:
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    // Companion:
    companion object {
        // Tags:
        @Suppress("unused")
        const val TAG: String = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        // Super:
        super.onCreate(savedInstanceState)
        setContentView(binding.root) // Setting content to the root of binding.
        // Toasting:
        t(getString(R.string.initialized_successfully_msg))
        // Developing:
        binding.validateButton.setOnClickListener {
            // Initializing:
            val userName = binding.userNameEditText.text.toString()
            val password = binding.passwordEditText.text.toString()
            // Checking:
            if (userName.l(2, 6) && password.l(6, 8)) getString(R.string.validate_successfully_msg).s(binding.root)
        }
    }
}