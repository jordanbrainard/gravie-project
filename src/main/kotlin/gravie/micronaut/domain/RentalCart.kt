package gravie.micronaut.domain

import java.util.UUID

data class RentalCart(
    val cartId: UUID,
    val customerId: UUID,
    val rentals: MutableList<Game>
)