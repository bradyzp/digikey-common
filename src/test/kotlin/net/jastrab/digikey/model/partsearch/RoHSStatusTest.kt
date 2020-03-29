package net.jastrab.digikey.model.partsearch

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.readValue
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class RoHSStatusTest {
    private val mapper = ObjectMapper().registerModule(KotlinModule())

    @Test
    fun testRohsStatusDeserialization() {
        val testValue = "\"RoHS Compliant\""

        val deserialized: RoHSStatus = mapper.readValue(testValue)

        assertEquals(RoHSStatus.COMPLIANT, deserialized)
    }

    @Test
    fun testRohsStatusDeserializationUnknownValue() {
        val testValue = "\"Invalid Value\""

        val deserialized: RoHSStatus = mapper.readValue(testValue)

        assertEquals(RoHSStatus.UNKNOWN, deserialized)
    }

}
