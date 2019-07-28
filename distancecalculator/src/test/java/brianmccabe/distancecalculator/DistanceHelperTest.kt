package brianmccabe.distancecalculator

import org.junit.Test

import org.junit.Assert.*

class DistanceHelperTest {

    @Test
    fun calculateDistance() {
        val distanceInKm = DistanceHelper().calculateDistance(53.4106, -6.4426)
        assertTrue(15 == distanceInKm)
    }

    @Test
    fun parse() {
        val strni = DistanceHelper().parse()
        assertTrue("f".equals(strni))
    }
}