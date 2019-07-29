package brianmccabe.distancecalculator

class DistanceHelper {
    companion object{
        const val EARTH_RADIUS = 6371
        const val INTERCOM_LATITUDE = 53.339428
        const val INTERCOM_LONGITUDE = -6.257664
    }

    fun calculateDistance(lat: Double?, lon: Double?): Int {
        val latDistance = toRad(lat!! - INTERCOM_LATITUDE)
        val lonDistance = toRad(lon!! - INTERCOM_LONGITUDE)
        val a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) + Math.cos(toRad(INTERCOM_LATITUDE)) * Math.cos(toRad(lat)) *
                Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2)
        val c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a))
        return Math.round(EARTH_RADIUS*c).toInt()
    }

    private fun toRad(value: Double?): Double {
        return value!! * Math.PI / 180
    }
}