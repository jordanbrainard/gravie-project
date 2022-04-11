package gravie.micronaut.controller

import gravie.micronaut.domain.Game
import gravie.micronaut.domain.AddGameToCartRequest
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*

@Controller("/rental_carts")
class RentalCartController {

    @Produces(MediaType.APPLICATION_JSON)
    @Get("/{rentalCartId}")
    fun getRentalCart(rentalCartId: String): List<Int> {
        return listOf(0)
    }

    @Produces(MediaType.APPLICATION_JSON)
    @Post("/rent_cart")
    fun rentGamesInCart(): Int {
        return 0
    }

    @Produces(MediaType.APPLICATION_JSON)
    @Delete("/{rentalCartId}")
    fun deleteCart(rentalCartId: String): Int {
        return 0
    }
}