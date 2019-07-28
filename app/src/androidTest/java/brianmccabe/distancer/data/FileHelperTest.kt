package brianmccabe.distancer.data

import org.junit.Test

import org.junit.Assert.*
import androidx.test.InstrumentationRegistry



class FileHelperTest {

    @Test
    fun loadJSONFromAsset() {
        val context = InstrumentationRegistry.getTargetContext()
        val test = FileHelper().loadJSONFromAsset(context)
        assertEquals("test", test)
    }

}