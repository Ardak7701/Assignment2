This project is an Object-Oriented Programming (OOP) assignment 3 that demonstrates:
- OOP principles (inheritance, abstraction, polymorphism)
- Basic database integration using PostgreSQL
- JDBC connection from Java to PostgreSQL
- CRUD operations (Create, Read, Update, Delete)

Project Structure
The project includes the following classes:
- Animal — abstract base class  
- Lion — inherits from `Animal`  
- Elephant — inherits from `Animal`  
- Zoo — stores animals using ArrayList  
- Zookeeper — simple entity representing an employee  
- AnimalDAO — DAO class that performs CRUD operations via JDBC  
- DBConnection — manages connection to PostgreSQL  
- Main — runs and tests all functionality

  PostgreSQL Database Structure
Table: animals
CREATE TABLE IF NOT EXISTS animals (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    type VARCHAR(20) NOT NULL,
    mane_length DOUBLE PRECISION,
    trunk_length DOUBLE PRECISION
);
Table: zookeereps
CREATE TABLE IF NOT EXISTS zookeepers (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    experience INT NOT NULL
);

CRUD Operations
The following operations are implemented:
addAnimal() — Insert a new animal
getAllAnimals() — Retrieve all animals
updateAnimal() — Update age by ID
deleteAnimal() — Delete by ID

In conclusion, this project successfully demonstrates the application of Object-Oriented Programming principles combined with database integration. During the development process, core OOP concepts such as abstraction, inheritance, and polymorphism were implemented using Java classes.
A PostgreSQL database was created to store project data, and a JDBC connection was established to enable interaction between the Java application and the database. The project includes SQL queries for creating tables and performing data manipulation operations such as INSERT and SELECT. Additionally, full CRUD functionality (Create, Read, Update, Delete) was implemented using the DAO pattern.
As a result, the project provides a clear example of how Java applications can interact with relational databases while maintaining a clean and structured architecture. This work meets all the requirements of the assignment and serves as a solid foundation for further development and improvement.
