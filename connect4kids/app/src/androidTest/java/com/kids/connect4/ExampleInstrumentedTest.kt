package com.kids.connect4

import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * 插桩测试占位。后续在此测试 Compose UI、Room、网络等设备相关行为。
 */
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.kids.connect4", appContext.packageName)
    }
}
