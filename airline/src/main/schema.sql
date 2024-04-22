-- Create tables for users, airports, aircrafts, flights, tickets, and their relationships.
CREATE TABLE Users (
    id INTEGER PRIMARY KEY,
    name TEXT NOT NULL,
    email TEXT UNIQUE NOT NULL,
    password TEXT NOT NULL
);

CREATE TABLE Airports (
    id INTEGER PRIMARY KEY,
    name TEXT NOT NULL,
    location TEXT NOT NULL
);

CREATE TABLE Aircrafts (
    id INTEGER PRIMARY KEY,
    model TEXT NOT NULL,
    manufacturer TEXT NOT NULL,
    capacity INTEGER NOT NULL,
    price REAL NOT NULL
);

CREATE TABLE Flights (
    id INTEGER PRIMARY KEY,
    departure_airport INTEGER NOT NULL,
    arrival_airport INTEGER NOT NULL,
    departure_time TIMESTAMP NOT NULL,
    arrival_time TIMESTAMP NOT NULL,
    flight_duration INTEGER NOT NULL,
    price REAL NOT NULL
);

CREATE TABLE Tickets (
    id INTEGER PRIMARY KEY,
    user_id INTEGER NOT NULL,
    flight_id INTEGER NOT NULL,
    seat_number INTEGER NOT NULL,
    is_refundable BOOLEAN NOT NULL,
    refund_policy TEXT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES Users(id),
    FOREIGN KEY (flight_id) REFERENCES Flights(id)
);
