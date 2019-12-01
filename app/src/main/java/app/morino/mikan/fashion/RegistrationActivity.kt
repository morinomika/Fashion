package app.morino.mikan.fashion

import android.content.Intent
import android.graphics.Camera
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import io.realm.Realm
import io.realm.exceptions.RealmException
import kotlinx.android.synthetic.main.activity_registration.*
import java.text.SimpleDateFormat
import java.util.*

class RegistrationActivity : AppCompatActivity() {

    lateinit var realm: Realm
    lateinit var etName: EditText
    var photoPath: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        photoPath = intent.getStringExtra("BitmapImage")


        etName = findViewById(R.id.nameEt) as EditText
        realm = Realm.getDefaultInstance()





    }

    fun save(v: View) {
        realm.beginTransaction()
        try {
            var nextId: Long = realm.where(Fashion::class.java).count() + 1
            var u = realm.createObject(Fashion::class.java, nextId)
            u.setName(etName.text.toString())
            u.setPicture(photoPath)
            realm.commitTransaction()

        } catch (e: RealmException) {
            Log.d("Tag", e.message)
        }

        Log.d("jjj", "path: " + realm.getPath());
        val intent = Intent(this, CameraActivity::class.java)
        startActivity(intent)
    }

}
