package com.shubhamkumarwinner.composeanimation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.shubhamkumarwinner.composeanimation.ui.home.Home
import com.shubhamkumarwinner.composeanimation.ui.theme.AnimationCodelabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimationCodelabTheme {
                Home()
            }
        }
    }
}
