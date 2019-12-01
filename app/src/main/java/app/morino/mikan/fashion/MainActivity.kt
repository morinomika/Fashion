package app.morino.mikan.fashion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var searchButton: Button
    lateinit var writeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        searchButton = findViewById(R.id.searchButton)
        writeButton = findViewById(R.id.writeButton)

        writeButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)

        })

        searchButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)

        })


    }


}
