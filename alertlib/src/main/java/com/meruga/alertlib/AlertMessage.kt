package com.meruga.alertlib

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface

class AlertMessage {

    companion object {
        fun message(context: Context, message: String, title: String, btnMessage: String) {
            var alertDialog: AlertDialog = AlertDialog.Builder(context).create()
            alertDialog.setTitle(title)
            alertDialog.setMessage(message)
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, btnMessage,
                DialogInterface.OnClickListener { dialogInterface, i ->  alertDialog.dismiss()})
            alertDialog.show()
        }
    }
}