package com.nemeantalestudios.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.nemeantalestudios.swoosh.R
import com.nemeantalestudios.swoosh.utilities.SELECTED_LEAGUE
import com.nemeantalestudios.swoosh.utilities.SELECTED_SKILL_LEVEL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val league = intent.getStringExtra(SELECTED_LEAGUE)
        val skill = intent.getStringExtra(SELECTED_SKILL_LEVEL)

        searchLeaguesLbl.text = "Looking for $skill $league near you";

    }
}
