package gravie.micronaut.controller

import gravie.micronaut.domain.Game
import gravie.micronaut.domain.RentalRequest
import gravie.micronaut.service.GameService
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*

@Controller("/games")
class GameController(
    private val gameService: GameService
) {

    @Produces(MediaType.APPLICATION_JSON)
    @Get("/{name}")
    fun searchGame(name: String): List<Game?> {
        return gameService.getGames(name)
    }

    @Produces(MediaType.APPLICATION_JSON)
    @Post("/rent")
    fun rentGame(@Body rentalRequest: RentalRequest): Int {
        return gameService.rentGame(rentalRequest)
    }
}
