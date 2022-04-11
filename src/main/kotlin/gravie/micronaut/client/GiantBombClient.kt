package gravie.micronaut.client

import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import java.util.concurrent.CompletableFuture

@Client("giant-bomb")
interface GiantBombClient {

    @Get("\${backends.giant-bomb.path}")
    fun getGames(
        name: String
    ): Map<String, String>

}