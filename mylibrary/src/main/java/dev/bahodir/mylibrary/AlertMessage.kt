package dev.bahodir.mylibrary

import android.content.Context
import androidx.appcompat.app.AlertDialog

object AlertMessage {
    fun showToast(context: Context, title: String, message: String, onPositiveButton: () -> Unit) {

        AlertDialog.Builder(context)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton("Close") { dialog, which ->
                onPositiveButton.invoke()
            }
            .show()
    }
}