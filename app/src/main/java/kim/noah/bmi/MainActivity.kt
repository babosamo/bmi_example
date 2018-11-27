package kim.noah.bmi

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import noah.kim.base.appContext

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        appContext = applicationContext
    }
}
