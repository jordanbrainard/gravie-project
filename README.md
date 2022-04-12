## Gravie Developer Project

### Objective: 
Create app with two pages, search and rent, using GiantBomb's API

### Results:
I intended to build a Kotlin backend for a TS or JS frontend with HTML and CSS. However, 
given the timebox, I was not able to accomplish everything

### Accomplishments:
 - Spun up Kotlin/Micronaut project
 - Created two controllers with multiple endpoints to frame out my idea of functionality
 - Created one service with likely methods
 - Created multiple domain objects to shape data
 - Created a client to interface with GiantBomb's API
 - Created basic tests for some controller and service methods

### Shortcomings:
 - The framework I chose seems to interact poorly with the GiantBombAPI (see attached photo)
 - Even though I annotated the service class with @Singleton and am using Spock Mocks, the test framework doesn't instantiate the objects correctly (NPE)
 - No persistence/database

### Future Work:
 - Investigate framework-API interaction issue
 - Make services and controllers more robust for full-fledged service
 - Add database
