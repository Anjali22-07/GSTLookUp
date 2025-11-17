## GST Lookup

GST Lookup is a Spring Boot backend application that allows users to verify GSTINs and fetch taxpayer information using an external GST API. It simplifies GST verification for businesses and developers by providing structured data and handling API integration.

## Features

- GSTIN Verification: Verify GST numbers for businesses.
- Fetch Taxpayer Details: Retrieve structured details like business name, GSTIN status.
- Spring Boot REST API: Provides easy-to-use POST endpoints for integration with frontends or other systems.
- Automated Error Handling: Handles API errors and returns informative responses.

## WorkFlow

- The client sends a GSTIN to the backend via the POST endpoint.
- The backend calls the external GST API  to fetch taxpayer information.
- The response is parsed and returned to the client in a structured JSON format.

## Technologies Used

- Spring Boot – Backend framework for REST APIs.
- RestTemplate – For calling external GST APIs.
- ObjectMapper – For parsing JSON responses.
- Maven – Build and dependency management.

 ## Installation
1. Clone the repository:
```
git clone https://github.com/yourusername/ai-helpdesk-agent.git
```
2. Navigate to the project directory:
```
cd ai-helpdesk-agent
```

3.Build the project with Maven or Gradle:
```
mvn clean install
```
4. Run the Spring Boot application:
```
# Maven
mvn spring-boot:run
```
5.Access the API endpoints at http://localhost:8080.

## API Usage
POST /api/gst/verify/{gstIn}

Description: Send a GSTIN to verify and fetch taxpayer information.

```
Request Body:

{
  "gstin": "27AAECS1234F1Z5"
}
```
```
Response (example):

{
  "gstin": "27AAECS1234F1Z5",
  "legalName": "ABC Enterprises",
  "tradeName": "ABC Traders",
  "status": "Active",
 }
```

## Contributing

- Contributions are welcome! If you want to improve the AI model, enhance ticketing features, or fix bugs:
- Fork the repository.
- Create a new branch: git checkout -b feature/your-feature-name.
- Commit your changes: git commit -m "Add feature".
- Push to the branch: git push origin feature/your-feature-name.
- Open a pull request.

## License
This project is licensed under the [MIT License](Licnese)

## Author
[Anjali SIngh](Anjali22-07)
