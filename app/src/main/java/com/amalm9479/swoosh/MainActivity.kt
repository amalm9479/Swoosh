package com.amalm9479.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BasedActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getStartedBtn.setOnClickListener {
            val leagueIntent=Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)


        }

    }
}