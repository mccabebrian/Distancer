package brianmccabe.distancer.list

import brianmccabe.distancer.data.model.User
import org.junit.Test

import org.junit.Assert.*

class ListUtilTest {

    @Test
    fun generateAndSortUserList() {
        val list: List<User>
        val testUser1 = User(53.2451022, 1, "Test user 1", -6.238335)
        val testUser2 = User(51.8856167, 2, "Test user 2", -10.4240951)
        val testUser3 = User(53.1229599, 1, "Test user 3", -6.2705202)
        list = listOf(testUser1, testUser2, testUser3)
        val sortedList = ListUtil().generateAndSortUserList(list)
        assertEquals(2, sortedList.size)
        assertEquals(sortedList[0].name, "Test user 1")
        assertEquals(sortedList[1].name, "Test user 3")
    }
}