package com.example.customlibrary

import android.content.Context
import android.widget.Toast

class BasicUtils {

    fun makeToast(context: Context){
        Toast.makeText(context, "Estas utilizando la biblioteca remota!!", Toast.LENGTH_LONG).show()
    }

}