package noah.kim.bmi.extension

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import noah.kim.bmi.ResultActivity

fun AppCompatActivity.goResultActivity(weight: Int, height: Int) {
    startActivity(Intent(this, ResultActivity::class.java).apply {
        putExtra(ResultActivity.PARAM_WEIGHT, weight)
        putExtra(ResultActivity.PARAM_HEIGHT, height)
    })
}