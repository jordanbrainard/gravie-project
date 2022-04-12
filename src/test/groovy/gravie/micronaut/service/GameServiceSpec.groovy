package gravie.micronaut.service

import gravie.micronaut.client.GiantBombClient
import gravie.micronaut.domain.GiantBombSearchResponse
import spock.lang.Specification

class GameServiceSpec extends Specification {

    def mockGiantBombClient = Mock(GiantBombClient)
    def service = new GameService(mockGiantBombClient)

    def 'get games calls client to initiate search'() {
        setup:
        def searchResult = GroovyMock(GiantBombSearchResponse)
        when:
        def result = service.getGames("name")

        then:
        1 * mockGiantBombClient.getGames("name") >> searchResult
        0 * _

        and:
        result == searchResult.results
    }
}