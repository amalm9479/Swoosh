package com.amalm9479.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.amalm9479.swoosh.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getStartedBtn.setOnClickListener {
            val leagueIntent=Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)


        }

    }
}