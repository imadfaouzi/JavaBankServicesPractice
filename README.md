
# Web Services Practice with Spring Boot

This repository is a hands-on project aimed at mastering Java web services, focusing on JSON RESTful APIs and GraphQL, using the Spring Boot framework. By creating a simple banking application, we've explored various aspects of web service development, including entities, repositories, services, DTOs (Data Transfer Objects), and web controllers. This README.md will provide an overview of what has been accomplished in this project.

## Project Structure

The project is organized into several components, each serving a specific purpose:

1.  **BankAccount Entity**: We've defined the `BankAccount` entity to represent individual bank accounts, with properties such as account number, owner, balance, and more. This entity serves as the core data model for our application.

2.  **Repository with Spring Data**: To interact with the database, we've utilized Spring Data JPA and created a repository for the `BankAccount` entity. This allows us to perform CRUD (Create, Read, Update, Delete) operations on bank accounts with ease.

3.  **AccountService**: The `AccountService` class contains business logic for managing bank accounts, such as creating new accounts, depositing and withdrawing funds, and checking account balances.

4.  **DTO (Data Transfer Object)**: To safely exchange data between the client and server, we've designed a `BankAccountDTO`. This DTO class helps in decoupling the internal representation of data from what is exposed through the web service, enhancing security and flexibility.

5.  **REST Controller**: We've implemented a JSON-based RESTful API using Spring Boot. The REST Controller handles HTTP requests for creating, retrieving, updating, and deleting bank accounts. It returns JSON responses to clients, making it easy to consume data.

6.  **Swagger UI Documentation**: For documentation and testing purposes, we've integrated Swagger UI, a powerful tool for documenting and exploring the REST API. This makes it easy for developers to understand and test the available endpoints.

7.  **GraphQL Controller**: Alongside the REST API, we've set up a GraphQL controller using a `schema.graphqls` file. GraphQL allows clients to request only the data they need, providing a more flexible and efficient way to interact with the API.


## Getting Started

To run this project and explore its functionality, follow these steps:

1.  Clone this repository to your local machine.
2.  Configure the database connection in the application.properties (or application.yml) file.
3.  Build and run the Spring Boot application.
4.  Access the Swagger UI documentation to test the REST API.
5.  Interact with the GraphQL API using the provided schema and endpoint.

## Dependencies

The project relies on various dependencies managed by Maven. These dependencies include Spring Boot, Spring Data JPA, Spring Web, GraphQL, and Swagger for documentation. You can find the complete list of dependencies in the `pom.xml` file.

## Contributions

Feel free to contribute to this project by implementing new features, improving existing ones, or adding more documentation. Contributions are highly welcome.

## Conclusion

This project serves as an excellent foundation for learning and practicing Java web services development with Spring Boot, covering both JSON-based RESTful APIs and GraphQL. It's a valuable resource for developers looking to gain hands-on experience in creating web services and APIs using the Java programming language. Explore the code, try out the endpoints, and expand your knowledge in web service development.