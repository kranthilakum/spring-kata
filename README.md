## Spring Kata

### Package structure
- in.lakum.spring
  - basics
  - cities
  - quotes

### Persistence units
- City
- Quote

## API Endpoints

### Generic Endpoints
| Method | Endpoint         |
|---|------------------|
|GET| /api/v1/hello    |
|GET| /api/v1/greeting |

### Quotes Endpoints
| Method | Endpoint           |
|---|--------------------|
|GET| /api/v1/quotes     |
|GET| /api/v1/quote      |
|GET| /api/v1/quote/{id} |

### Cities Endpoints
| Method | Endpoint                   |
|---|----------------------------|
|GET| /api/v1/cities             |
|GET| /api/v1/cities/{id}        |
|POST| /api/v1/cities/{city}      |
|PATCH| /api/v1/cities/{id}/{city} |
|DELETE| /api/v1/cities/{id}        |

### Links
- [Create a simple Jakarta Persistence aoplication](https://blog.jetbrains.com/idea/2021/02/creating-a-simple-jakarta-persistence-application/), JetBrains.
- [Spring Boot quotation service to support REST-based guide](https://github.com/spring-guides/quoters)
- [Spring Boot CommandLineRunner](https://zetcode.com/springboot/commandlinerunner/)
- [Spring @GetMapping, @PostMapping, @PutMapping, @DeleteMapping and @PatchMapping](https://www.javaguides.net/2018/11/spring-getmapping-postmapping-putmapping-deletemapping-patchmapping.html)
- [JDBC Persistence Entities](https://docs.spring.io/spring-data/jdbc/docs/current/reference/html/#jdbc.entity-persistence)
