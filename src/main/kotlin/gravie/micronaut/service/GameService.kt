package gravie.micronaut.service

import gravie.micronaut.client.GiantBombClient
import gravie.micronaut.domain.Game
import gravie.micronaut.domain.RentalRequest
import jakarta.inject.Singleton

@Singleton
class GameService(
    private val giantBombClient: GiantBombClient
) {

    fun getGames(name: String): List<Game?> {
        return giantBombClient.getGames(name).results
    }

    fun rentGame(request: RentalRequest): Int {
        val game = Game(request.id, request.name, null, true)
        //insert into database and associate rented game with userID
        return 1
    }
}