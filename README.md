# HR Management System (Java OOP)

## Introduction

The **HR Management System** is a Java-based application designed using core Object-Oriented Programming (OOP) principles. The system models a real-world Human Resource workflow and demonstrates the practical implementation of:

* Encapsulation
* Inheritance
* Polymorphism
* Abstraction

The project focuses on building a structured and extensible HR architecture where employees can be managed, promoted, evaluated for bonuses, and tracked using realistic business logic.

---

## Project Architecture

The system is divided into **Models** and **Services** to maintain separation of concerns and clean code organization.

---

## Models

### Employee (Abstract Class)

The `Employee` class serves as the base abstract class for all employee types. It defines common attributes and abstract methods that must be implemented by child classes.

**Responsibilities:**

* Define common employee properties
* Enforce implementation of abstract methods
* Provide base structure for inheritance

---

### Developer (Class)

The `Developer` class extends the `Employee` class and implements multiple interfaces such as `Promotion` and `Bonus`. This class represents developer employees with specific behaviors and logic.

**Features:**

* Inherits properties from Employee
* Implements Promotion eligibility
* Implements Bonus eligibility
* Supports multi-level inheritance structure

---

### Programmer (Class)

The `Programmer` class is similar to the Developer class but contains distinct attributes and logic specific to programmers.

**Features:**

* Inherits Employee properties
* Contains unique programmer-specific attributes
* Implements promotion and bonus logic

---

### Promotion (Interface)

The `Promotion` interface defines promotion-related behavior.

**Method:**

* `promote()` — Promotes eligible employees to higher roles

This ensures all employee types implement a consistent promotion mechanism.

---

### Bonus (Interface)

The `Bonus` interface defines bonus eligibility logic.

**Method:**

* `bonusEligible()` — Determines whether an employee qualifies for a bonus

This allows flexible bonus implementation based on employee performance.

---

## Services

### HRService (Class)

The `HRService` class provides core HR operations similar to a real-world HR department.

**Services Provided:**

* Add new employee
* Remove employee
* Promote employees
* Display all employees
* Display bonus eligible employees
* Manage employee records

---

## Key Features

### Real-World Attributes

The system includes practical HR-related data such as:

* Employee joining date
* Contract duration
* Work experience
* Achievements
* Salary structure

---

### UUID Generation

Each employee is assigned a **unique identifier** using a UUID generation mechanism, ensuring proper tracking and management.

---

### Salary Management

The system supports realistic salary calculations including:

* Base salary tracking
* Increment based on achievements
* Increment based on work experience
* Promotion-based salary increase

---

## OOP Concepts Implemented

### Encapsulation

Employee data is secured using private attributes and public getter/setter methods.

### Inheritance

Developer and Programmer classes inherit from Employee.

### Abstraction

Employee class is abstract and defines required behavior.

### Polymorphism

Promotion and Bonus interfaces allow flexible implementation across employee types.

---

## Project Structure (Example)

```
HR-Management-System
│
├── model
│   ├── Employee.java
│   ├── Developer.java
│   ├── Programmer.java
│   ├── Promotion.java
│   └── Bonus.java
│
├── service
│   └── HRService.java
│
└── Main.java
```

---

## Learning Objectives

This project demonstrates:

* Real-world OOP design
* Interface-based architecture
* Multi-level inheritance
* Clean service layer implementation
* Practical Java application structure

---

## Future Improvements

Possible enhancements include:

* Database integration (JDBC / MySQL)
* REST API using Spring Boot
* GUI implementation
* Role-based access control
* Performance evaluation system

---

## Author

Raghav Chaturvedi

---

## License

This project is for educational and learning purposes.
