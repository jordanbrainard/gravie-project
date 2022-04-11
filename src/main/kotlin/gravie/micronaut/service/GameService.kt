package gravie.micronaut.service

import gravie.micronaut.client.GiantBombClient
import gravie.micronaut.domain.Game
import gravie.micronaut.domain.AddGameToCartRequest
import jakarta.inject.Singleton

@Singleton
class GameService(
    private val giantBombClient: GiantBombClient
) {

    fun getGames(name: String): List<Game?> {
        return giantBombClient.getGames(name).results
    }

    fun rentGame(request: AddGameToCartRequest): Int {
        val game = Game(request.id, request.name, null, true)
        //insert into database and associate rented game with userID
        return 1
    }
}