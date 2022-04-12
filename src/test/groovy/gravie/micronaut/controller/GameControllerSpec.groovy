package gravie.micronaut.controller

import gravie.micronaut.client.GiantBombClient
import gravie.micronaut.domain.AddGameToCartRequest
import gravie.micronaut.domain.Game
import gravie.micronaut.service.GameService
import spock.lang.Specification

class GameControllerSpec extends Specification {

    def mockGameService = Mock(GameService)
    def mockGiantBombClient = Mock(GiantBombClient)
    def controller = new GameController(mockGameService)

    def 'search game method calls game service'() {
        setup:
        def gamesList = GroovyMock(Game)

        when:
        def result = controller.searchGame("name")

        then:
        1 * mockGameService.getGames("name") >> gamesList
        0 * _

        and:
        result == [gamesList]
    }

    def 'rent game method calls game service with post body'() {
        setup:
        def addGameToCartRequest = new AddGameToCartRequest("id", "name")

        when:
        def result = controller.rentGame(addGameToCartRequest)

        then:
        1 * mockGameService.rentGame(addGameToCartRequest) >> 1
        0 * _

        and:
        result == 1
    }

}