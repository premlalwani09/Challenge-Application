# Challenge Application

The Challenge Application is a robust web application designed to facilitate the management of challenges on a monthly basis. Built using Hibernate and Spring technologies, this application offers essential CRUD functionalities, allowing users to seamlessly add, delete, and update challenges.

## Features

- Create: Add new challenges to the system with ease.
- Read: View existing challenges stored in the database.
- Update: Modify challenge details as needed.
- Delete: Remove challenges from the system when they are no longer needed.

## Technologies Used

- Java
- Spring Framework
- Hibernate
- H2 Database
- Postman (for testing)

## Installation

1. Clone the repository: `git clone [repository-url]`
2. Navigate to the project directory: `cd challenge-application`
3. Build the project: `mvn clean install`

## Usage

1. Start the application by running the main class `ChallengeApplication.java`.
2. Access the application through your web browser or API testing tool like Postman.
3. Use the provided API endpoints to perform CRUD operations on challenges.

## API Endpoints

- `GET /challenges`: Retrieve all challenges.
- `GET /challenges/{id}`: Retrieve a specific challenge by its ID.
- `POST /challenges`: Create a new challenge.
- `PUT /challenges/{id}`: Update an existing challenge by its ID.
- `DELETE /challenges/{id}`: Delete a specific challenge by its ID.

## Contributing

Contributions are welcome! Please feel free to submit pull requests or open issues if you encounter any bugs or have suggestions for improvements.

## License

This project is licensed under the [MIT License](LICENSE).
