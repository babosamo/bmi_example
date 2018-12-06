package noah.kim.bmi

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import noah.kim.base.appContext
import noah.kim.bmi.extension.goResultActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        appContext = applicationContext

        resultButton.setOnClickListener {
            val weight = weightEditText.text.toString().takeIf { it.isNotBlank() }?.toInt() ?: 0
            val height = heightEditText.text.toString().takeIf { it.isNotBlank() }?.toInt() ?: 0

            goResultActivity(weight, height)
        }
    }
}
