package com.nemeantalestudios.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.nemeantalestudios.swoosh.Model.Player
import com.nemeantalestudios.swoosh.R
import com.nemeantalestudios.swoosh.utilities.PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    var player = Player(league = "", skill = "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }


    fun onMensLeagueClicked(view: View) {
        womensLeagueBtn.isChecked = false
        mixedLeagueBtn.isChecked = false;
        player.league = "mens"
    }

    fun onWomensLeagueClicked(view: View) {
        mensLeagueBtn.isChecked = false
        mixedLeagueBtn.isChecked = false
        player.league  = "womens"

    }

    fun onMixedLeagueClicked(view: View) {
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false
        player.league  = "mixed"

    }

    fun leagueNextClicked(view: View) {
        if(player.league  !== "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(PLAYER, player )
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "You must select a league", Toast.LENGTH_SHORT).show()
        }

    }

}
