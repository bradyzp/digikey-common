/**
* PartSearch Api
* Search for products and retrieve details and pricing.
*
* The version of the OpenAPI document: v3
* Contact: api.support@digikey.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package net.jastrab.model.partsearch

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Sort on the specified field in ascending or descending order.
 * @param sortOption Specifies the field to sort on.
 * @param direction The sort direction can be Ascending or Descending
 * @param sortParameterId The ParameterId of the parameter to sort on. The ParameterId can be found in the Search response. This is only used with SortByParameter.
 */

data class SortParameters (
    /* Specifies the field to sort on. */
    @JsonProperty("SortOption")
    val sortOption: SortOption,
    /* The sort direction can be Ascending or Descending */
    @JsonProperty("Direction")
    val direction: Direction,
    /* The ParameterId of the parameter to sort on. The ParameterId can be found in the Search response. This is only used with SortByParameter. */
    @JsonProperty("SortParameterId")
    val sortParameterId: Int? = null
) {

    /**
    * Specifies the field to sort on.
    * Values: sortByDigiKeyPartNumber,sortByManufacturerPartNumber,sortByDescription,sortByManufacturer,sortByMinimumOrderQuantity,sortByQuantityAvailable,sortByUnitPrice,sortByParameter
    */
    
    enum class SortOption(val value: kotlin.String){
        @JsonProperty("SortByDigiKeyPartNumber") sortByDigiKeyPartNumber("SortByDigiKeyPartNumber"),
        @JsonProperty("SortByManufacturerPartNumber") sortByManufacturerPartNumber("SortByManufacturerPartNumber"),
        @JsonProperty("SortByDescription") sortByDescription("SortByDescription"),
        @JsonProperty("SortByManufacturer") sortByManufacturer("SortByManufacturer"),
        @JsonProperty("SortByMinimumOrderQuantity") sortByMinimumOrderQuantity("SortByMinimumOrderQuantity"),
        @JsonProperty("SortByQuantityAvailable") sortByQuantityAvailable("SortByQuantityAvailable"),
        @JsonProperty("SortByUnitPrice") sortByUnitPrice("SortByUnitPrice"),
        @JsonProperty("SortByParameter") sortByParameter("SortByParameter");
    }
    /**
    * The sort direction can be Ascending or Descending
    * Values: ascending,descending
    */
    
    enum class Direction(val value: kotlin.String){
        @JsonProperty("Ascending") ascending("Ascending"),
        @JsonProperty("Descending") descending("Descending");
    }
}

