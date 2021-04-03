package dev.dreamhopping.coordinate.mappings

/**
 * Includes all mappings for a certain version
 */
data class VersionMappings(
    val classes: List<MappedClass>,
    val methods: List<MappedMethod>,
    val fields: List<MappedField>
) {
    data class MappedClass(val obfuscatedName: String, val deobfuscatedName: String)

    data class MappedMethod(
        var obfuscatedName: String,
        var deobfuscatedName: String,
        val obfuscatedOwner: String,
        val deobfuscatedOwner: String,
        val obfuscatedDescriptor: String? = null,
        val deobfuscatedDescriptor: String
    )

    data class MappedField(
        val obfuscatedOwner: String,
        var obfuscatedName: String,
        val deobfuscatedOwner: String,
        var deobfuscatedName: String
    )
}