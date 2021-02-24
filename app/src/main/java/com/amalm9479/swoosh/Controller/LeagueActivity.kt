package com.amalm9479.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.amalm9479.swoosh.EXTRA_LEAGUE
import com.amalm9479.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var selectedLeague =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
    fun onMensClicked(view: View){
        womensLeagueBtn.isChecked=false
        coedLeagueBtn.isChecked=false
        selectedLeague= "mens"
    }
    fun onWomensClicked(view: View){
        mensLeagueBtn.isChecked=false
        coedLeagueBtn.isChecked=false
        selectedLeague= "womens"

    }
    fun onCoedClicked(view: View){
        womensLeagueBtn.isChecked=false
        mensLeagueBtn.isChecked=false
        selectedLeague= "ed-ed"

    }

    fun leagueNextClick(view:View){
        if (selectedLeague !=""){
            val skillActivity= Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this, "please select league.",Toast.LENGTH_SHORT).show()
        }

    }


}