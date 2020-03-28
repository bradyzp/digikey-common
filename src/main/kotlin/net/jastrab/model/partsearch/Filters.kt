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
 * Filters to narrow down the search results based on parameters.
 * @param taxonomyIds A collection of Taxonomy Ids to filter on. Ids can be found in the initial search response.
 * @param manufacturerIds A collection of Manufacturer Ids to filter on. Ids can be found in the initial search response.
 * @param parametricFilters A collection of ParametricFilters. A ParametricFilter consists of a ParameterId and a ValueId. Those Ids can also be found in the Search response.
 */

data class Filters(
    /* A collection of Taxonomy Ids to filter on. Ids can be found in the initial search response. */
    @JsonProperty("TaxonomyIds")
    val taxonomyIds: List<Int> = ArrayList(),
    /* A collection of Manufacturer Ids to filter on. Ids can be found in the initial search response. */
    @JsonProperty("ManufacturerIds")
    val manufacturerIds: List<Int> = ArrayList(),
    /* A collection of ParametricFilters. A ParametricFilter consists of a ParameterId and a ValueId. Those Ids can also be found in the Search response. */
    @JsonProperty("ParametricFilters")
    val parametricFilters: List<ParametricFilter> = ArrayList()
)

