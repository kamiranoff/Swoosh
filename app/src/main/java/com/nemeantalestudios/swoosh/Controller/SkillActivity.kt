package com.nemeantalestudios.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.nemeantalestudios.swoosh.R
import com.nemeantalestudios.swoosh.utilities.SELECTED_LEAGUE
import com.nemeantalestudios.swoosh.utilities.SELECTED_SKILL_LEVEL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {


    var league = ""
    var skillLevel = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(SELECTED_LEAGUE)
    }


    fun onBallerLevelClicked(view: View) {
        beginnerLevelBtn.isChecked = false
        skillLevel = "baller"
    }

    fun onBeginnerLevelClicked(view: View) {
        ballerLevelBtn.isChecked = false
        skillLevel = "beginner"

    }

    fun onSkillGetStartedClicked(view: View) {
        if(this.league !== "" && this.skillLevel !== "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(SELECTED_LEAGUE, this.league)
            finishActivity.putExtra(SELECTED_SKILL_LEVEL, this.skillLevel)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "You must select a skill level", Toast.LENGTH_SHORT).show()
        }

    }



}
