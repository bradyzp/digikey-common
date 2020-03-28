package net.jastrab.model.partsearch

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.readValue
import net.jastrab.test.TestResource
import net.jastrab.test.loadString
import org.junit.jupiter.api.Test
import java.math.BigDecimal
import kotlin.test.assertEquals

internal class ProductDetailsTest : TestResource {
    private val mapper = ObjectMapper().registerModule(KotlinModule()).registerModule(JavaTimeModule())
    private val productDetailsJson: String = loadString("/productdetails.json")

    @Test
    fun testProductDetailsDeserialization() {

        val productDetails: ProductDetails = mapper.readValue(productDetailsJson)

        assertEquals("P5555-ND", productDetails.digiKeyPartNumber)
        assertEquals(1, productDetails.kits.size)
        assertEquals(BigDecimal.valueOf(0.86), productDetails.unitPrice)
        assertEquals("USD", productDetails.searchLocaleUsed?.currency)
    }


}
