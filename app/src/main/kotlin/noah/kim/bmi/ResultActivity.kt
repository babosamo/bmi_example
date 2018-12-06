package noah.kim.bmi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    companion object {
        const val PARAM_WEIGHT = "PARAM_WEIGHT"
        const val PARAM_HEIGHT = "PARAM_HEIGHT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val weight = intent.getIntExtra(PARAM_WEIGHT, 0)
        val height = intent.getIntExtra(PARAM_HEIGHT, 0)

        val bmi = weight / Math.pow(height / 100.0, 2.0)

        when {
            bmi >= 35 -> resultTextView.text = "고도 비만"
            bmi >= 30 -> resultTextView.text = "2단계 비만"
            bmi >= 25 -> resultTextView.text = "1단계 비만"
            bmi >= 23 -> resultTextView.text = "과 체중"
            bmi >= 18.5 -> resultTextView.text = "정상"
            else -> resultTextView.text = "저 쳬중"
        }

        when {
            bmi >= 23 -> imageView.setImageResource(R.drawable.ic_sentiment_very_dissatisfied_black_24dp)
            bmi >= 18.5 -> imageView.setImageResource(R.drawable.ic_sentiment_satisfied_black_24dp)
            else -> imageView.setImageResource(R.drawable.ic_sentiment_dissatisfied_black_24dp)
        }

        Toast.makeText(this, "weight: $weight, height: $height bmi: $bmi", Toast.LENGTH_LONG).show()
    }
}
