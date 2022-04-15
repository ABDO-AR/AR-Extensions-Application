@file:Suppress("unused")

package com.ar.company.team.ar_extensions

import android.content.Context
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar

// TAGS:
const val TAG: String = "AR-Extensions"

// Showing toast from AppCompatActivity without context:
fun AppCompatActivity.t(message: String = "", duration: Int = Toast.LENGTH_LONG) {
    // Showing:
    Toast.makeText(this, message.trim(), duration).show()
}

// Showing toast from Fragment without context:
fun Fragment.t(message: String = "", duration: Int = Toast.LENGTH_LONG) {
    // Showing:
    Toast.makeText(requireContext(), message.trim(), duration).show()
}

// Showing toast from any type:
fun Any.t(context: Context, prefix: String = "", duration: Int = Toast.LENGTH_LONG) {
    // Showing:
    Toast.makeText(context, "$prefix $this".trim(), duration).show()
}

// Showing snack bar from any type:
fun Any.s(view: View, prefix: String = "", duration: Int = Snackbar.LENGTH_LONG) {
    // Showing:
    Snackbar.make(view, "$prefix $this".trim(), duration).show()
}

// Checking for minimumLength && maximumLength:
fun String.l(minimumLength: Int, maximumLength: Int): Boolean {
    // Returning:
    return (this.length in minimumLength..maximumLength).also { Log.d(TAG, "l: The state is $it and the actual length is ${this.length}") }
}