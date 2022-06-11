package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val myName: MyName = MyName("Mehul Kunwar")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.myName = myName

        //val doneButton: Button = findViewById(R.id.doneButton)
        //doneButton.setOnClickListener{
        //    addName(it)
        //}

        binding.doneButton.setOnClickListener{
            addName(it)
        }
    }

    private fun addName(view: View) {

/*        binding.nickNameText.text = binding.nickNameEdit.text.toString()
        binding.nickNameEdit.visibility = View.GONE
        binding.nickNameText.visibility = View.VISIBLE*/

        // For more simplicity and Readability
        binding.apply {
            //nickNameText.text = nickNameEdit.text.toString()
            myName?.nickName = nickNameEdit.text.toString()
            invalidateAll() // Refresh the UI with new data we need to invalidate all binding expressions so they are recreated with binding data
            nickNameEdit.visibility = View.GONE
            doneButton.visibility = View.GONE
            nickNameText.visibility = View.VISIBLE
        }

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }


}