package com.hao.eggnotification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Fade
import android.widget.ImageView
import android.widget.TextView
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat
import org.w3c.dom.Text

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val imgEgg : ImageView = findViewById(R.id.imgEgg)

        imgEgg.setOnClickListener {
            val intent = Intent(this@Activity2,Activity3::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                this,
                imgEgg,
                ViewCompat.getTransitionName(imgEgg).toString()
            )
            startActivity(intent,options.toBundle())
        }
    }
}