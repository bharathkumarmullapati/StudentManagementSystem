Student Management System

Project Description

A console-based Student Management System developed using Java, JDBC and MySQL. It allows users to manage student records easily.

Technologies Used

* Java
* JDBC
* MySQL
* Eclipse IDE

Features

1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit

Database Setup

Create the database and table in MySQL:

CREATE DATABASE studentdb;
USE studentdb;
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    course VARCHAR(100)
);

How to Run

1. Install JDK and Eclipse IDE.
2. Install MySQL.
3. Add MySQL Connector/J to the Eclipse Build Path.
4. Configure the database username and password in DBConnection.java.
5. Run StudentMain.java as a Java Application.

Author

Bharath Kumar Mullapati
