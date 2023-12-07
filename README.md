## Sample project - Spring Boot Testing (spring-boot-starter-test)

#### Unit tests - tests business logic of particular unit (a class, a method or a set of classes)
-> Spring Boot provides SpringTest, JUnit5, Mockito, JsonPath, JsonAssert 

#### Slice tests - tests a slice of an application (web layer or persistence layer)
-> Spring Boot provides @WebMvcTest, @DataJpaTest, @DataMongoTest

#### Integration tests - loads the entire application then make an API call and test the result
-> Spring Boot provides @SpringBootTest
