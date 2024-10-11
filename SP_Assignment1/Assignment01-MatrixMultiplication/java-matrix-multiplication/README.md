# Matrix Multiplication in Java 

## Overview

This project implements a matrix multiplication application in Java. It allows users to input two matrices and computes their product, handling various cases such as valid multiplications, matrix with invalid dimensions, multiplication with zero matrices, and identity matrices.

## Table of Contents

- [Features](#features)
- [Technologies used](#technologies)
- [Usage](#usage)
- [Testing](#testing)
- [Project Structure](#project-structure)


## Features

- Validates matrix dimensions before multiplication.
- Handles cases for:
  - Standard matrix multiplication.
  - Multiplication with zero matrices.
  - Multiplication with identity matrices.
  - Exception handling for invalid matrix dimensions.

## Technologies used

- Java (version 1.8 or higher)
- Maven for dependency management
- JUnit for unit testing


## Usage

1. **Run the application:**

   To run the matrix multiplication application, execute the following command:
   ```bash
   mvn exec:java -Dexec.mainClass="matrix.assignment.Main"

2. **Input matrices:**
   Follow the prompts to enter the dimensions and values for the two matrices. The program will display the resulting product matrix or an error message if the matrices cannot be multiplied due to size incompatibility.

## Testing 
   Unit tests are included in the project to ensure the correctness of the matrix multiplication implementation.
   
   For running the test cases, you can use following command:
   ```bash
   mvn test

   The test cases take into consideration various scenarios such as valid multiplications and cases that throw exceptions.

## Project Structure
```bash  
Assignment01-MatrixMultiplication
│
├── src
│   ├── main
│   │   └── java
│   │       └── matrix
│   │           └── assignment
│   │               ├── Main.java
│   │               └── MatrixMultiplier.java
│   │
│   └── test
│       └── java
│           └── matrix
│               └── assignment
│                   └── MatrixMultiplicationTest.java
│
├── pom.xml
└── README.md



