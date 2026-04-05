package com.flipperdevices.faphub.utils

object FapHubConstants {
    const val FLIPPER_APPS_FOLDER = "/ext/apps"
    const val FLIPPER_TMP_FOLDER_PATH = "/ext/.tmp/android"

    /**
     * Maps category aliases returned by the Catalog API to the actual folder names
     * used on the Flipper SD card under /ext/apps/.
     */
    private val CATEGORY_ALIAS_REMAPPING = mapOf(
        "subghz" to "shz"
    )

    fun mapCategoryAlias(categoryAlias: String): String {
        return CATEGORY_ALIAS_REMAPPING[categoryAlias] ?: categoryAlias
    }
}
