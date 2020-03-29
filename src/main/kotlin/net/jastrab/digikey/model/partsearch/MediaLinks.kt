/**
 * PartSearch Api
 * Search for products and retrieve details and pricing.
 *
 * The version of the OpenAPI document: v3
 * Contact: api.support@digikey.com
 *
 */
package net.jastrab.digikey.model.partsearch


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Media links for a product.
 * @param mediaType The type of media.
 * @param title The title of the media.
 * @param smallPhoto URL to a small photo.
 * @param thumbnail URL to the thumbnail image of the media.
 * @param url URL of the media.
 */

data class MediaLinks(
    /* The type of media. */
    @JsonProperty("MediaType")
    val mediaType: String? = null,
    /* The title of the media. */
    @JsonProperty("Title")
    val title: String? = null,
    /* URL to a small photo. */
    @JsonProperty("SmallPhoto")
    val smallPhoto: String? = null,
    /* URL to the thumbnail image of the media. */
    @JsonProperty("Thumbnail")
    val thumbnail: String? = null,
    /* URL of the media. */
    @JsonProperty("Url")
    val url: String? = null
)

