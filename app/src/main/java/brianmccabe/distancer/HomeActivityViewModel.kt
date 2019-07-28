package brianmccabe.distancer

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import brianmccabe.distancer.data.FileHelper
import org.json.JSONArray

class HomeActivityViewModel : ViewModel() {

    init {
        Log.e("initViewmodel", "hello")
    }

    fun getUsers(context: Context) {
        val users = FileHelper().loadJSONFromAsset(context)
        val jsonArray = JSONArray(users)
    }
}