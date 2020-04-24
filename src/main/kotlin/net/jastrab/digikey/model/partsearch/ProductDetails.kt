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
import java.math.BigDecimal

/**
 * All information about a product.
 * @param digiKeyPartNumber The Digi-Key part number.
 * @param quantityAvailable Quantity of the product available for immediate sale.
 * @param manufacturerPartNumber The manufacturer part number. Note that some manufacturer part numbers may be used by multiple manufacturers for different parts.
 * @param manufacturer
 * @param productDescription Catalog description of the product.
 * @param detailedDescription Extended catalog description of the product.
 * @param packaging
 * @param minimumOrderQuantity The minimum quantity to order from Digi-Key.
 * @param nonStock Indicates this product is a non stock product.
 * @param quantityOnOrder Quantity of this product ordered but not immediately available.
 * @param manufacturerPublicQuantity Quantity of this product available to order from manufacturer.
 * @param unitPrice The price for a single unit of this product.
 * @param standardPricing Standard pricing for the validated locale.
 * @param myPricing Your pricing for the account with which you authenticated. Also dependent on locale information.
 * @param additionalValueFee Any additional value fee. Most commonly the Digi-Reel fee. May be used for programmable parts as well.
 * @param tariffDescription Description of the tariff status. Only applies if purchasing in USD and shipping to the US. Valid options are No  Tariff and Tariff Applied.
 * @param productUrl Full URL of the Digi-Key catalog page to purchase the product. This is based on your provided Locale values.
 * @param dateLastBuyChance Last date that the product will be available for purchase. Date is in ISO 8601.
 * @param series
 * @param manufacturerPageUrl The URL to Digi-Key's page on the manufacturer.
 * @param obsolete Indicates whether this Part is obsolete.
 * @param manufacturerLeadWeeks The number of weeks expected to receive stock from manufacturer.
 * @param productStatus Status of the product. Options include: Active, Obsolete, Discontinued at Digi-Key, Last Time Buy, Not For New  Designs, Preliminary. For obsolete parts the part will become a non-stocking item when stock is depleted; minimums  will apply. Order the quantity available or the quantity available plus a multiple of the minimum order quantity.
 * @param standardPackage The number of products in the manufacturer's standard package.
 * @param mediaLinks Collection of MediaLinks objects. These can contain links to datasheets, photos or manuals.
 * @param primaryDatasheet The URL to the product's datasheet.
 * @param primaryPhoto The URL to the product's image.
 * @param primaryVideo The URL to the product's video.
 * @param roHSStatus RoHS status. Can be: RoHS Compliant, RoHS non-compliant, RoHS Compliant By Exemption, Not Applicable, Vendor  undefined, Request Inventory Verification, ROHS3 Compliant.
 * @param leadStatus Lead status. Can be: Lead Free, Contains lead, Lead Free By Exemption, Not Applicable, Vendor undefined, unknown,  or Request Inventory Verification.
 * @param parameters Parameters for the part. Can be used for filtering keyword searches.
 * @param kits Kits that this product is contained in.
 * @param kitContents Products contained within this product. Only applicable if this product is a kit.
 * @param matingProducts An association of same manufacturer products that mate with each other.
 * @param associatedProducts Products that are directly correlated to complete the intended function of the product. These products may be either same manufacturer or differ.
 * @param forUseWithProducts Products that are directly correlated to complete the intended function of the product. These products may be either same manufacturer or differ.
 * @param rohsSubs Rohs substitutions
 * @param suggestedSubs Suggested substitutions for when the product is obsolete.
 * @param alternatePackaging Other packaging types available for this product.
 * @param footprint Indicates if the product has a Mentor footprint.
 * @param reachStatus REACH is a regulation of the European Union. See documentation from the European Chemicals Agency.
 * @param exportControlClassNumber Export control class number. See documentation from the U.S. Department of Commerce.
 * @param htSUSCode Harmonized Tariff Schedule of the United States. See documentation from the U.S. International Trade Commission.
 * @param limitedTaxonomy
 * @param searchLocaleUsed
 */

data class ProductDetails(
    /* The Digi-Key part number. */
    @JsonProperty("DigiKeyPartNumber")
    val digiKeyPartNumber: String,
    /* Quantity of the product available for immediate sale. */
    @JsonProperty("QuantityAvailable")
    val quantityAvailable: Int,
    /* The manufacturer part number. Note that some manufacturer part numbers may be used by multiple manufacturers for different parts. */
    @JsonProperty("ManufacturerPartNumber")
    val manufacturerPartNumber: String,
    @JsonProperty("Manufacturer")
    val manufacturer: PidVid? = null,
    /* Catalog description of the product. */
    @JsonProperty("ProductDescription")
    val productDescription: String,
    /* Extended catalog description of the product. */
    @JsonProperty("DetailedDescription")
    val detailedDescription: String,
    @JsonProperty("Packaging")
    val packaging: PidVid? = null,
    /* The minimum quantity to order from Digi-Key. */
    @JsonProperty("MinimumOrderQuantity")
    val minimumOrderQuantity: Int? = null,
    /* Indicates this product is a non stock product. */
    @JsonProperty("NonStock")
    val nonStock: Boolean? = null,
    /* Quantity of this product ordered but not immediately available. */
    @JsonProperty("QuantityOnOrder")
    val quantityOnOrder: Int? = null,
    /* Quantity of this product available to order from manufacturer. */
    @JsonProperty("ManufacturerPublicQuantity")
    val manufacturerPublicQuantity: Int? = null,
    /* The price for a single unit of this product. */
    @JsonProperty("UnitPrice")
    val unitPrice: BigDecimal,
    /* Standard pricing for the validated locale. */
    @JsonProperty("StandardPricing")
    val standardPricing: List<PriceBreak> = ArrayList(),
    /* Your pricing for the account with which you authenticated. Also dependent on locale information. */
    @JsonProperty("MyPricing")
    val myPricing: List<PriceBreak> = ArrayList(),
    /* Any additional value fee. Most commonly the Digi-Reel fee. May be used for programmable parts as well. */
    @JsonProperty("AdditionalValueFee")
    val additionalValueFee: BigDecimal?,
    /* Description of the tariff status. Only applies if purchasing in USD and shipping to the US. Valid options are No  Tariff and Tariff Applied. */
    @JsonProperty("TariffDescription")
    val tariffDescription: String?,
    /* Full URL of the Digi-Key catalog page to purchase the product. This is based on your provided Locale values. */
    @JsonProperty("ProductUrl")
    val productUrl: String,
    /* Last date that the product will be available for purchase. Date is in ISO 8601. */
    @JsonProperty("DateLastBuyChance")
    val dateLastBuyChance: java.time.OffsetDateTime?,
    @JsonProperty("Series")
    val series: PidVid?,
    /* The URL to Digi-Key's page on the manufacturer. */
    @JsonProperty("ManufacturerPageUrl")
    val manufacturerPageUrl: String?,
    /* Indicates whether this Part is obsolete. */
    @JsonProperty("Obsolete")
    val obsolete: Boolean,
    /* The number of weeks expected to receive stock from manufacturer. */
    @JsonProperty("ManufacturerLeadWeeks")
    val manufacturerLeadWeeks: String?,
    /* Status of the product. Options include: Active, Obsolete, Discontinued at Digi-Key, Last Time Buy, Not For New  Designs, Preliminary. For obsolete parts the part will become a non-stocking item when stock is depleted; minimums  will apply. Order the quantity available or the quantity available plus a multiple of the minimum order quantity. */
    @JsonProperty("ProductStatus")
    val productStatus: String?,
    /* The number of products in the manufacturer's standard package. */
    @JsonProperty("StandardPackage")
    val standardPackage: Int?,
    /* Collection of MediaLinks objects. These can contain links to datasheets, photos or manuals. */
    @JsonProperty("MediaLinks")
    val mediaLinks: List<MediaLinks> = ArrayList(),
    /* The URL to the product's datasheet. */
    @JsonProperty("PrimaryDatasheet")
    val primaryDatasheet: String?,
    /* The URL to the product's image. */
    @JsonProperty("PrimaryPhoto")
    val primaryPhoto: String?,
    /* The URL to the product's video. */
    @JsonProperty("PrimaryVideo")
    val primaryVideo: String?,
    /* RoHS status. Can be: RoHS Compliant, RoHS non-compliant, RoHS Compliant By Exemption, Not Applicable, Vendor
    undefined, Request Inventory Verification, ROHS3 Compliant. */
    @JsonProperty("RoHSStatus")
    val roHSStatus: RoHSStatus?,
    /* Lead status. Can be: Lead Free, Contains lead, Lead Free By Exemption, Not Applicable, Vendor undefined, unknown,
    or Request Inventory Verification. */
    @JsonProperty("LeadStatus")
    val leadStatus: String?,
    /* Parameters for the part. Can be used for filtering keyword searches. */
    @JsonProperty("Parameters")
    val parameters: List<PidVid> = ArrayList(),
    /* Kits that this product is contained in. */
    @JsonProperty("Kits")
    val kits: List<AssociatedProduct> = ArrayList(),
    /* Products contained within this product. Only applicable if this product is a kit. */
    @JsonProperty("KitContents")
    val kitContents: List<KitPart> = ArrayList(),
    /* An association of same manufacturer products that mate with each other. */
    @JsonProperty("MatingProducts")
    val matingProducts: List<AssociatedProduct> = ArrayList(),
    /* Products that are directly correlated to complete the intended function of the product. These products may be
    either same manufacturer or differ. */
    @JsonProperty("AssociatedProducts")
    val associatedProducts: List<AssociatedProduct> = ArrayList(),
    /* Products that are directly correlated to complete the intended function of the product. These products may be
    either same manufacturer or differ. */
    @JsonProperty("ForUseWithProducts")
    val forUseWithProducts: List<AssociatedProduct> = ArrayList(),
    /* Rohs substitutions */
    @JsonProperty("RohsSubs")
    val rohsSubs: List<AssociatedProduct> = ArrayList(),
    /* Suggested substitutions for when the product is obsolete. */
    @JsonProperty("SuggestedSubs")
    val suggestedSubs: List<AssociatedProduct> = ArrayList(),
    /* Other packaging types available for this product. */
    @JsonProperty("AlternatePackaging")
    val alternatePackaging: List<BasicProduct> = ArrayList(),
    /* Indicates if the product has a Mentor footprint. */
    @JsonProperty("Footprint")
    val footprint: Boolean?,
    /* REACH is a regulation of the European Union. See documentation from the European Chemicals Agency. */
    @JsonProperty("ReachStatus")
    val reachStatus: String?,
    /* Export control class number. See documentation from the U.S. Department of Commerce. */
    @JsonProperty("ExportControlClassNumber")
    val exportControlClassNumber: String?,
    /* Harmonized Tariff Schedule of the United States. See documentation from the U.S. International Trade Commission.*/
    @JsonProperty("HTSUSCode")
    val htSUSCode: String?,
    @JsonProperty("LimitedTaxonomy")
    val limitedTaxonomy: LimitedTaxonomy?,
    @JsonProperty("SearchLocaleUsed")
    val searchLocaleUsed: IsoSearchLocale?
)

