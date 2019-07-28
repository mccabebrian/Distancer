package brianmccabe.distancer.data

import android.content.Context
import java.io.IOException
import java.nio.charset.Charset

class FileHelper {
    fun loadJSONFromAsset(context: Context): String? {
        var json: String? = null
        try {
            val `is` = context.getAssets().open("users.json")

            val size = `is`.available()

            val buffer = ByteArray(size)

            `is`.read(buffer)

            `is`.close()

            json = String(buffer, Charset.defaultCharset())


        } catch (ex: IOException) {
            ex.printStackTrace()
            return null
        }

        return json
    }
}