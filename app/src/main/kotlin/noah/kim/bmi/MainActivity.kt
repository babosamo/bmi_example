package noah.kim.bmi

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import noah.kim.base.appContext

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        appContext = applicationContext
        clickButton.setOnClickListener{
            textView.text = "버튼을 눌렀습니다"
        }
    }
}
