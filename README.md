# CLI Calculator Application 💻

This project is a CLI-based calculator application built using Spring Boot. The application provides endpoints for performing basic arithmetic operations, including addition, subtraction, multiplication, division, power, and square root calculations. It is containerized using Docker for easy deployment and testing.

## Table of Contents 📔

- [CLI Calculator Application 💻](#cli-calculator-application-)
  - [Table of Contents 📔](#table-of-contents-)
  - [Features ⚙️](#features-️)
  - [Technologies Used 🧑🏾‍💻](#technologies-used-)
  - [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Building and Running Locally](#building-and-running-locally)
    - [Running with Docker](#running-with-docker)
    - [API Endpoints](#api-endpoints)
    - [Testing](#testing)
    - [Troubleshooting](#troubleshooting)
    - [License](#license)
    - [Contributing](#contributing)

## Features ⚙️

- **Addition**: Adds two numbers.
- **Subtraction**: Subtracts one number from another.
- **Multiplication**: Multiplies two numbers.
- **Division**: Divides one number by another (handles division by zero).
- **Power**: Raises a base number to a specified exponent.
- **Square Root**: Computes the square root of a number (handles negative inputs).

## Technologies Used 🧑🏾‍💻

- **Spring Boot**: Framework for building the REST API.
- **Docker**: Containerization for consistent deployment.
- **Java**: Used for application development.
- **Postman**: Used to test endpoints 

## Getting Started

### Prerequisites

- [Java 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Docker](https://www.docker.com/get-started)
- [Maven](https://maven.apache.org/download.cgi) (for building the application)

### Building and Running Locally

1. **Clone the Repository**

   ```bash
   git clone <repository-url>
   cd <repository-directory>
    ```

2. **Build the application**
    ```bash
    mvn clean package
    ```
   This will generate a JAR file in the **target** directory

3. **Run the Application Locally**
    You can run the app using the JAR file that we built:
    ```bash
    java -jar target/calculator-0.0.1-SNAPSHOT.jar
    ```
    The application will be available at `http://localhost:8080`

### Running with Docker

1. **Build the Docker Image**
    ```bash
    docker build -t calculator .
    ```
2. **Run the Docker Container **
    ```bash
    docker run -p 8080:8080 calculator
    ```
    The application will now be available at `https://localhost:8080` in the browser or via tools like Postman.

### API Endpoints
You can interact with the application via the following endpoints

- Addition: `GET http://localhost:8080/calculator/add?x={num1}&y={num2}`
- Subtraction: `GET http://localhost:8080/calculator/subtract?x={num1}&y={num2}`
- Multiplication: `GET http://localhost:8080/calculator/multiply?x={num1}&y={num2}`
- Division: `GET http://localhost:8080/calculator/multiply?x={num1}&y={num2}`
- Power: `GET http://localhost:8080/calculator/power?base={base}&exponent={exponent}`
- Square Root: `GET http://localhost:8080/calculator/sqrt?x={num}`
   
> ℹ️ NOTE
>
> Replace {num1}, {num2}, {base}, {exponent}, and {num} with appropriate values for testing.

### Testing
To test the endpoints:
1. Using Postman: Create **GET** requests to the URLs mentioned above with query parameters as required.
2. **Using cURL: Example commands:**
   ```bash
    curl "http://localhost:8080/calculator/add?x=10&y=5"
    curl "http://localhost:8080/calculator/subtract?x=10&y=5"
    ```

### Troubleshooting
- **Error**: Unable to access jarfile: Ensure that the JAR file name and path in the Dockerfile are correct and match the actual JAR file.
- **Network Issues**: Verify that Docker is correctly mapping ports and that the application is running on the expected port.

### License
This project is licensed under the MIT License. See the LICENSE file for details.

### Contributing
Feel free to fork the repo and submit pull requests. Make sure the changes include appropriate tests, and keep the project coding style in mind.