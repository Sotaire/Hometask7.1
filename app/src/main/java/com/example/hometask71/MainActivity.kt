package com.example.hometask71

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var first = 0
    private var second = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editWatch()
        btn_div.setOnClickListener { 
            if (first_number.text.isNotEmpty() && second_number.text.isNotEmpty()){
                if (second != 0){
                    result.text = (first/second).toString()
                }else{
                    showToast("на ноль делить нельзя")
                }
            }else{
                showToast("Заполните все поля")
            }
        }
        btn_minus.setOnClickListener {
            if (first_number.text.isNotEmpty() && second_number.text.isNotEmpty()){
                    result.text = (first-second).toString()
            }else{
                showToast("Заполните все поля")
            }
        }
        btn_multiple.setOnClickListener {
            if (first_number.text.isNotEmpty() && second_number.text.isNotEmpty()){
                    result.text = (first*second).toString()
            }else{
                showToast("Заполните все поля")
            }
        }
    }

    private fun editWatch() {
        first_number.addTextChangedListener {
            if(it!!.isNotEmpty() && it.toString() != ""){
            first = it.toString().toInt()
            }
        }
        second_number.addTextChangedListener {
            if (it!!.isNotEmpty() && it.toString() != "")
            second = it.toString().toInt()
        }
    }
}