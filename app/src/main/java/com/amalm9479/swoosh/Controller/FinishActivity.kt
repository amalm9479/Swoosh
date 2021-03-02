package com.amalm9479.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amalm9479.swoosh.EXTRA_PLAYER
import com.amalm9479.swoosh.Model.Player
import com.amalm9479.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchLeadgueText.text= "Looking for ${player?.league} ${player?.skill}  league near you ..."
    }
}