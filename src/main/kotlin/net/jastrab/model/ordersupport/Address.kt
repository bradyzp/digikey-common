/**
 * Order Details
 * Retrieve information about current and past orders.
 */
package net.jastrab.model.ordersupport

import com.fasterxml.jackson.annotation.JsonProperty


/**
 * Address information for billing or shipping contacts
 * @param company Company or Organization name
 * @param firstName First Name
 * @param lastName Last Name
 * @param addressLineOne First line of address
 * @param addressLineTwo Second line of address
 * @param addressLineThree Third line of address
 * @param city City
 * @param province Province or State
 * @param postalCode Postal Code or Zip Code
 * @param country Country 2 digit ISO code
 */

data class Address(
    /* Company or Organization name */
    @JsonProperty("Company")
    val company: String? = null,
    /* First Name */
    @JsonProperty("FirstName")
    val firstName: String? = null,
    /* Last Name */
    @JsonProperty("LastName")
    val lastName: String? = null,
    /* First line of address */
    @JsonProperty("AddressLineOne")
    val addressLineOne: String? = null,
    /* Second line of address */
    @JsonProperty("AddressLineTwo")
    val addressLineTwo: String? = null,
    /* Third line of address */
    @JsonProperty("AddressLineThree")
    val addressLineThree: String? = null,
    /* City */
    @JsonProperty("City")
    val city: String? = null,
    /* Province or State */
    @JsonProperty("Province")
    val province: String? = null,
    /* Postal Code or Zip Code */
    @JsonProperty("PostalCode")
    val postalCode: String? = null,
    /* Country 2 digit ISO code */
    @JsonProperty("Country")
    val country: String? = null
)

