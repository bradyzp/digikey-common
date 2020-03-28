package net.jastrab.model

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import net.jastrab.model.ordersupport.Address
import org.junit.jupiter.api.Test

class AddressSerializationTest {

    private val mapper = ObjectMapper().registerModule(KotlinModule())

    @Test
    fun testAddressSerialization() {
        val address = Address(
            "Dynamic Gravity Systems",
            "John",
            "Johnson",
            "7120 W 117th Ave",
            "Suite B1",
            null,
            city = "Broomfield",
            postalCode = "80020",
            country = "USA"
        )

        println(mapper.writeValueAsString(address))

    }

    @Test
    fun testAddressDeSerialization() {



    }
}
