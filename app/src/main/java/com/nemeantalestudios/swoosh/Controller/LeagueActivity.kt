package com.nemeantalestudios.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.nemeantalestudios.swoosh.R
import com.nemeantalestudios.swoosh.utilities.SELECTED_LEAGUE
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }


    fun onMensLeagueClicked(view: View) {
        womensLeagueBtn.isChecked = false
        mixedLeagueBtn.isChecked = false;
        this.selectedLeague = "mens"
    }

    fun onWomensLeagueClicked(view: View) {
        mensLeagueBtn.isChecked = false
        mixedLeagueBtn.isChecked = false
        this.selectedLeague = "womens"

    }

    fun onMixedLeagueClicked(view: View) {
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false
        this.selectedLeague = "mixed"

    }

    fun leagueNextClicked(view: View) {
        if(this.selectedLeague !== "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(SELECTED_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "You must select a league", Toast.LENGTH_SHORT).show()
        }

    }

}
