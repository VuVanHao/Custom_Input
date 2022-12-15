package com.hao.eggnotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText

class ActivityEdt : AppCompatActivity() {

    private var edtEmail : EditText ?= null
    private var edtPass : EditText ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edt)

        edtEmail = findViewById(R.id.email_id)
        edtPass = findViewById(R.id.password)

        var sizeBeforeEmail = 0
        var countRotateEmail = 0

        edtEmail!!.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) { }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val size = s!!.length
                if (size > sizeBeforeEmail)
                {
                    edtEmail?.rotation = countRotateEmail.toFloat() + 5
                    countRotateEmail += 5
                    sizeBeforeEmail = size
                }
                else
                {
                    edtEmail?.rotation = countRotateEmail.toFloat() - 5
                    countRotateEmail -= 5
                    sizeBeforeEmail = size
                }

                if(size == 0)
                {
                    edtEmail?.rotation = 0f
                    countRotateEmail = 0
                }
            }
        })


        var sizeBeforePass = 0
        var countRotatePass = 0

        edtPass!!.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) { }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val size = s!!.length
                if (size > sizeBeforePass)
                {
                    edtPass?.rotation = countRotatePass.toFloat() - 5
                    countRotatePass -= 5
                    sizeBeforePass = size
                }
                else
                {
                    edtPass?.rotation = countRotatePass.toFloat() + 5
                    countRotatePass += 5
                    sizeBeforePass = size
                }

                if(size == 0)
                {
                    edtPass?.rotation = 0f
                    countRotatePass = 0
                }
            }
        })
    }
}