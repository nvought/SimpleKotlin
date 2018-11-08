package com.something.simplekotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val defualt = "Press the Button"
    var why = "Why did you press the button?"
    var again = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text.setText(defualt)
        button.setText("Press")

        button.setOnClickListener {
            text.setText(why + again)
            button.setText("Why?")
            again = "again" + " " + again

        }

    }
}
