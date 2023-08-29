package kr.hs.emirim.kye.direct_7_1

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var angle: EditText
    lateinit var imgV : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        angle = findViewById(R.id.angle)
        imgV = findViewById(R.id.imageV)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        var mInflater = menuInflater
        mInflater.inflate(R.menu.menu1, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.rotate -> {
                imgV.rotation = angle.text.toString().toFloat()
                return true
            }
            R.id.cat -> {
                imgV.setImageResource(R.drawable.cat)
                item.setChecked(true)
                return true
            }
            R.id.dog -> {
                imgV.setImageResource(R.drawable.dog)
                item.setChecked(true)
                return true
            }
            R.id.eunsung -> {
                imgV.setImageResource(R.drawable.eunsungko)
                item.setChecked(true)
                return true
            }
        }
        return false
    }
}