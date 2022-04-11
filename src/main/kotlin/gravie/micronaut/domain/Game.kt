package gravie.micronaut.domain

@kotlinx.serialization.Serializable
data class Game(
    val name: String?,
    val imgSrc: String?,
    val rented: Boolean = false
)