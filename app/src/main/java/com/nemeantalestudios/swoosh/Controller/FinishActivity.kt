package com.nemeantalestudios.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.nemeantalestudios.swoosh.Model.Player
import com.nemeantalestudios.swoosh.R
import com.nemeantalestudios.swoosh.utilities.PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(PLAYER)

        searchLeaguesLbl.text = "Looking for ${player.skill} ${player.league} near you";

    }
}
