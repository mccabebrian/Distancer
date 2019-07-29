package brianmccabe.distancer

import android.content.Context
import androidx.lifecycle.ViewModel
import brianmccabe.distancer.data.FileHelper
import brianmccabe.distancer.data.model.User
import brianmccabe.distancer.list.ListUtil
import com.google.gson.Gson
class HomeActivityViewModel : ViewModel() {

    fun getUsersWithin100km(context: Context) {
        val users = FileHelper().loadJSONFromAsset(context)
        val userList = Gson().fromJson(users, Array<User>::class.java).toList()
        val sortedList = ListUtil().generateAndSortUserList(userList)
        FileHelper().writeUsersToOutputFile(Gson().toJson(sortedList), context)
    }
}