package gravie.micronaut.domain

data class GiantBombSearchResponse(
    val error: String,
    val limit: Int,
    val offset: Int,
    val numberOfPageResults: Int,
    val numberOfTotalResults: Int,
    val status: Int,
    val results: List<Game?>
)