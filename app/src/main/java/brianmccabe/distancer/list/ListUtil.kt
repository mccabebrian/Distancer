package brianmccabe.distancer.list

import brianmccabe.distancecalculator.DistanceHelper
import brianmccabe.distancer.data.model.User

class ListUtil {
    fun generateAndSortUserList(users: List<User>) : List<User> {
        val userList: MutableList<User> = mutableListOf()
        for (user in users) {
            if (DistanceHelper().calculateDistance(user.latitude, user.longitude) <= 100) {
                userList.add(user)
            }
        }
        return userList.toList().sortedWith(compareBy {it.user_id})
    }
}