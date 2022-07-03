package es.ipow.shapes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.ipow.shapes.databinding.ActivitySelectorBinding

class SelectorActivity : AppCompatActivity() {
    private lateinit var b : ActivitySelectorBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivitySelectorBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.btnNotPressed.setOnClickListener {
            val myIntent = Intent(this, SeekBarActivity::class.java)
            startActivity(myIntent)
        }

        b.btnDisabled.setOnClickListener {
            b.btnTest.setEnabled(!b.btnTest.isEnabled)
            b.btnTest.background = if (!b.btnTest.isEnabled) {
                 getDrawable(R.drawable.button_state_disabled)
            } else {
                 getDrawable(R.drawable.button_state_not_pressed)
            }
        }
    }

}