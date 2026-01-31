# Student Management System (Full-Stack Java)

A simple full-stack Student Management application built using Spring Boot,
PostgreSQL, and Vanilla JavaScript.

This project demonstrates real-world REST API integration between a backend
and a frontend hosted on different platforms.

---

## Live Demo

Frontend (GitHub Pages):
https://vidiyalarasan.github.io/student-project/

Backend API (Railway):
https://student-api-production-da62.up.railway.app/api/students

---

## Tech Stack

Backend:
- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

Frontend:
- HTML
- CSS
- JavaScript (Fetch API)

Deployment:
- Backend: Railway
- Database: Railway PostgreSQL
- Frontend: GitHub Pages

---

## Features

- Add new students from the website
- View all students from the database
- REST API based architecture
- Backend and database deployed on cloud
- Frontend connected to live backend

---

## Project Structure

student-project
|
|-- backend
|-- docs
|   |-- index.html
|   |-- script.js
|   |-- style.css
|-- README.md

---

## API Endpoints

GET    /api/students        -> Get all students  
POST   /api/students        -> Add a new student  
DELETE /api/students/{id}   -> Delete a student  

---

## Sample JSON (POST)

{
  "name": "Vidiyalarasan",
  "email": "vidiya@gmail.com",
  "course": "Java"
}

---

## How to Run Locally

Backend:
cd backend
mvn spring-boot:run

Frontend:
Open docs/index.html in browser

---

## Future Improvements

- Update student details
- Better UI styling
- Table layout
- Swagger documentation
- Validation and error handling

---

## Author

Vidiyalarasan
Java Backend Developer
