package net.jastrab.digikey.model.partsearch

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class RoHSStatus(val value: String) {
    COMPLIANT("RoHS Compliant"),
    NON_COMPLIANT("RoHS non-compliant"),
    COMPLIANT_EXEMPT("RoHS Compliant By Exemption"),
    NOT_APPLICABLE("Not Applicable"),
    VENDOR_UNDEFINED("Vendor Undefined"),
    REQUEST_VERIFICATION("Request Inventory Verification"),
    ROHS3_COMPLIANT("ROHS3 Compliant"),
    UNKNOWN("Unknown Value");

    companion object {
        @JsonCreator
        @JvmStatic
        fun fromString(stringValue: String): RoHSStatus = values().firstOrNull { it.value == stringValue } ?: UNKNOWN
    }

    @JsonValue
    fun value(): String = this.value
}
