package app.morino.mikan.fashion

import android.graphics.Bitmap
import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass
import io.realm.annotations.Required
import java.nio.channels.Pipe
import java.util.*

@RealmClass
open class Fashion: RealmObject() {

    @PrimaryKey
    private var id: Long = 0
    private lateinit var picture: String
    private lateinit var name: String

    fun setId (id: Long) {
        this.id = id
    }

    fun getId (): Long {
        return id
    }

    fun setPicture (picture: String){
        this.picture = picture
    }

    fun getPicture (): String {
        return picture
    }

    fun setName (name: String){
        this.name = name
    }

    fun getName (): String {
        return name
    }
}
