package brianmccabe.distancer.data

import android.content.Context
import android.util.Log
import java.io.IOException
import java.io.OutputStreamWriter
import java.nio.charset.Charset

class FileHelper {
    fun loadJSONFromAsset(context: Context): String? {
        var json: String?
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

    fun writeUsersToOutputFile(data: String, context: Context) {
        try {
            val outputStreamWriter = OutputStreamWriter(context.openFileOutput("useroutput.txt", Context.MODE_PRIVATE))
            outputStreamWriter.write(data)
            outputStreamWriter.close()
        } catch (e: IOException) {
            Log.e("Exception", "File write failed: " + e.toString())
        }

    }
}

