package es.ipow.shapes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import es.ipow.shapes.databinding.ActivitySeekBarBinding

class SeekBarActivity : AppCompatActivity() {
    private lateinit var b : ActivitySeekBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivitySeekBarBinding.inflate(layoutInflater)
        setContentView(b.root)
        b.seekBar.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
                b.tvSeekBar.text = seek.progress.toString().plus("/100")
            }

            override fun onStartTrackingTouch(seek: SeekBar) {
                //write custom code for progress is starting
            }

            override fun onStopTrackingTouch(seek: SeekBar) {
                // write custom code for progress is stopped
            }
        })
    }
}




