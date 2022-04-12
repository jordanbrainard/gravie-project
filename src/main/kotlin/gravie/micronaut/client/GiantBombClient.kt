package gravie.micronaut.client

import gravie.micronaut.domain.GiantBombSearchResponse
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@Client("giant-bomb")
interface GiantBombClient {

    @Get("\${backends.giant-bomb.path}")
    fun getGames(
        name: String
    ): GiantBombSearchResponse

}