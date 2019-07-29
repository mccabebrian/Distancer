package brianmccabe.distancecalculator

import org.junit.Test

import org.junit.Assert.*

class DistanceHelperTest {

    @Test
    fun calculateDistance() {
        val distanceInKm = DistanceHelper().calculateDistance(52.966, -6.463)
        assertTrue(15 == distanceInKm)
    }
}