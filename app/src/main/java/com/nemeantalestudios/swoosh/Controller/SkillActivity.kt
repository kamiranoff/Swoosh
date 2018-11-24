package com.nemeantalestudios.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.nemeantalestudios.swoosh.Model.Player
import com.nemeantalestudios.swoosh.R
import com.nemeantalestudios.swoosh.utilities.PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {


    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(PLAYER)
    }


    fun onBallerLevelClicked(view: View) {
        beginnerLevelBtn.isChecked = false
        player.skill = "baller"
    }

    fun onBeginnerLevelClicked(view: View) {
        ballerLevelBtn.isChecked = false
        player.skill = "beginner"

    }

    fun onSkillGetStartedClicked(view: View) {
        if(player.skill !== "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "You must select a skill level", Toast.LENGTH_SHORT).show()
        }

    }



}
