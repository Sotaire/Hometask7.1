package com.example.hometask71

import android.text.Editable
import android.text.TextWatcher

 abstract class SimpleTextWatcher : TextWatcher {
     override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
     }

     override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
     }

     override fun afterTextChanged(p0: Editable?) {
     }
 }