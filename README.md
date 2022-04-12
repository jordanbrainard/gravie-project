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
 - Intuitive UI experience rather than just endpoints


### Result of running request with service making client call:
<img width="1667" alt="Screen Shot 2022-04-11 at 10 23 54 PM" src="https://user-images.githubusercontent.com/35605866/162873641-68841c10-4641-4c27-9b4d-021f0525d269.png">
 Looking through forums, I found this is an RSS issue, and oftentimes sites will block some features if they perceive content scraping. I imagine it may have to do with the framework I've chosen, as I can plainly hit the endpoint in Insomnia with the exact same setup as I have set up in my client:
 <img width="1193" alt="Screen Shot 2022-04-11 at 12 24 38 AM" src="https://user-images.githubusercontent.com/35605866/162874805-2f578ef7-891c-40b2-ab82-ca71ef9a0bbc.png">


### Result of hitting endpoint with service returning hardcoded data:
<img width="1318" alt="Screen Shot 2022-04-11 at 10 25 34 PM" src="https://user-images.githubusercontent.com/35605866/162873983-448be2bf-0afc-4eeb-b2c8-d7082aaa42de.png">
Just to show that the project runs and has functional endpoints when the data can be retrieved.
