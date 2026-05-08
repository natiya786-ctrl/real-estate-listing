# Real Estate Listing

A Spring Boot backend project for managing real estate property listings.

## Features
- Add property listings
- View all properties
- Filter by location
- Filter by BHK type
- Filter by price range
- MySQL database integration

## Technologies Used
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman

## API Endpoints

### Get all properties
GET /properties

### Add property
POST /properties

### Filter by location
GET /properties/location/{location}

### Filter by BHK
GET /properties/bhk/{bhk}

### Filter by price range
GET /properties/price?min=value&max=value
