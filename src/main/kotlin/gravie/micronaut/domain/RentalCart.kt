package gravie.micronaut.domain

import java.util.UUID

data class RentalCart(
    val cartId: UUID, // todo: transform UUID to string
    val customerId: UUID, // todo: transform UUID to string
    val rentals: MutableList<Game>
)