package com.yavuzkabakci.a49mcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun mySum(view : View){

        val number1 = editText.text.toString().toIntOrNull()
        val number2 = editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 ==null){
            resultText.text = "Alanları boş bırakamazsınız!"
        } else {
            val result = number1 + number2
            resultText.text = "Result: $result"
        }
    }
    fun myMultiply(view : View) {
        val number1 = editText.text.toString().toIntOrNull()
        val number2 = editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 ==null){
            resultText.text = "Alanları boş bırakamazsınız!"
        } else {
            val result = number1 * number2
            resultText.text = "Result: $result"
        }
}
    fun mySub(view : View) {
        val number1 = editText.text.toString().toIntOrNull()
        val number2 = editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 ==null){
            resultText.text = "Alanları boş bırakamazsınız!"
        } else {
            val result = number1 - number2
            resultText.text = "Result: $result"
        }
    }
    fun myDiv(view : View) {
        val number1 = editText.text.toString().toIntOrNull()
        val number2 = editText2.text.toString().toIntOrNull()

        if (number1 == null || number2 ==null){
            resultText.text = "Alanları boş bırakamazsınız!"
        } else {
            val result = number1 / number2
            resultText.text = "Result: $result"
        }
    }
}