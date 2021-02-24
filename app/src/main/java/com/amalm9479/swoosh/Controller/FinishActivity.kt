package com.amalm9479.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amalm9479.swoosh.EXTRA_LEAGUE
import com.amalm9479.swoosh.EXTRA_SKILL
import com.amalm9479.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)
        searchLeadgueText.text= "Looking for $league $skill league near you ..."
    }
}