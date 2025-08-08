# PHP Development Environment

This project sets up a PHP development environment in GitHub Codespaces using Docker. It includes a web server, MySQL database, and phpMyAdmin for database management, similar to XAMPP.

## Project Structure

```
php-dev-environment
├── .devcontainer
│   ├── devcontainer.json
│   └── docker-compose.yml
├── src
│   ├── index.php
│   └── config
│       └── db.php
├── README.md
```

## Setup Instructions

1. **Open the Project in GitHub Codespaces**: Click on the "Code" button and select "Open with Codespaces".

2. **Build the Development Container**: The development container will automatically build based on the configuration in `.devcontainer/devcontainer.json` and `.devcontainer/docker-compose.yml`.

3. **Access the Application**: Once the container is running, you can access the PHP application by navigating to `http://localhost` in your browser.

4. **Database Access**: You can access phpMyAdmin at `http://localhost:8080` to manage your MySQL database.

## Usage Guidelines

- Modify `src/index.php` to test PHP functionality.
- Update `src/config/db.php` with your database connection settings.
- Use phpMyAdmin for database management tasks.

## Additional Notes

- Ensure that you have the necessary permissions to run Docker containers.
- For any issues, refer to the GitHub Codespaces documentation or the Docker documentation.