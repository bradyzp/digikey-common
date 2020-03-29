/**
 * PartSearch Api
 * Search for products and retrieve details and pricing.
 *
 * The version of the OpenAPI document: v3
 * Contact: api.support@digikey.com
 *
 */
package net.jastrab.digikey.model.partsearch

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Keyword Search Request object
 * @param keywords Keywords to search on. Can be a description, partial part number, manufacturer part number, or a Digi-Key part number.
 * @param recordCount Number of products to return between 1 and 50.
 * @param recordStartPosition The starting index of the records returned. This is used to paginate beyond 50 results.
 * @param filters
 * @param sort
 * @param requestedQuantity The quantity of the product you are looking to purchase. This is used with the SortByUnitPrice SortOption as price varies at differing quantities.
 * @param searchOptions Filters the search results by the included SearchOption.
 */

data class KeywordSearchRequest(
    /* Keywords to search on. Can be a description, partial part number, manufacturer part number, or a Digi-Key part number. */
    @JsonProperty("Keywords")
    val keywords: kotlin.String,
    /* Number of products to return between 1 and 50. */
    @JsonProperty("RecordCount")
    val recordCount: kotlin.Int? = null,
    /* The starting index of the records returned. This is used to paginate beyond 50 results. */
    @JsonProperty("RecordStartPosition")
    val recordStartPosition: kotlin.Int? = null,
    @JsonProperty("Filters")
    val filters: Filters? = null,
    @JsonProperty("Sort")
    val sort: SortParameters? = null,
    /* The quantity of the product you are looking to purchase. This is used with the SortByUnitPrice SortOption as
    price varies at differing quantities. */
    @JsonProperty("RequestedQuantity")
    val requestedQuantity: kotlin.Int? = null,
    /* Filters the search results by the included SearchOption. */
    @JsonProperty("SearchOptions")
    val searchOptions: List<SearchOption> = ArrayList()
) {

    /**
     * Filters the search results by the included SearchOption.
     * Values: leadFree,collapsePackagingTypes,excludeNonStock,has3DModel,inStock,manufacturerPartSearch,newProductsOnly,roHSCompliant,hasMentorFootprint
     */

    enum class SearchOption(val value: String) {
        LEAD_FREE("LeadFree"),
        COLLAPSE_PACKAGING_TYPES("CollapsePackagingTypes"),
        EXCLUDE_NONSTOCK("ExcludeNonStock"),
        HAS_3DMODEL("Has3DModel"),
        IN_STOCK("InStock"),
        MANUFACTURER_PART_SEARCH("ManufacturerPartSearch"),
        NEW_PRODUCTS_ONLY("NewProductsOnly"),
        ROHS_COMPLIANT("RoHSCompliant"),
        HAS_MENTOR_FOOTPRINT("HasMentorFootprint");

        companion object {
            @JsonCreator
            @JvmStatic
            fun fromString(stringValue: String): SearchOption = values().first {
                it.value == stringValue
            }
        }

    }
}

