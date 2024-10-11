# Assignment01-MatrixMultiplication

This repository contains two implementations (in Java and Python) of matrix multiplication, along with automated test cases. Each implementation is organized into separate folders with clear directory structures, test cases, and expected outputs.

## Table of Contents

- [Java Project](#java-project)
  - [Running the Java Project](#running-the-java-project)
  - [Running Unit Tests for Java](#running-unit-tests-for-java)
- [Python Project](#python-project)
  - [Running the Python Project](#running-the-python-project)
  - [Running Unit Tests for Python](#running-unit-tests-for-python)
  - [Test Data](#test-data)
- [Analysis and comparison of Java and Pyhton implementatio n of matrix multiplication](#Analysis-and-comparison-of-Java-and-Pyhton-implementation-of-matrix-multiplication)

- [Project Structure](#project-structure)


## Java Project
   The Java implementation is contained in the "java-matrix-multiplication" folder. The project is structured using Maven and includes matrix multiplication logic and unit tests using JUnit.

  **1. Running the Java Project**
    - Go to the java-matrix-multiplication/ folder.
    - Compile and run the Java project using Maven:
    ```bash
      mvn compile
      mvn exec:java -Dexec.mainClass="matrix.assignment.Main"


## Running Unit Tests for Java
You can run the JUnit tests included in the project to verify the functionality:
    
    ```bash
       mvn test

## Python Project
   The Python implementation is inside the python-matrix-multiplication/ folder. This implementation uses automated test cases and save generated test data in JSON files and handles user input with navigation, matrix multiplication, and test execution.

   1. **Running the Python Project**
   - Navigate to the python-matrix-multiplication/ folder.
   - Run the Python script:
      ```bash
      python3 main_code/Main.py
   2. **Running Unit Tests for Python**
   Unit tests in Python are written to automatically verify matrix multiplication using test data stored in JSON files.
   
   - Navigate to the python-matrix-multiplication/ folder.
   - Run the Python tests:
       ```bash
        python3 -m unittest discover -s tests
3. **Test Data**
    - "test_cases.json": Contains the input matrices used for testing.
    - "expected_results.json": Contains the expected results for the matrix multiplication test cases.
    These files are used to automatically generate test data and verify that the matrix multiplication works correctly.

## Analysis and comparison of Java and Pyhton implementatio n of matrix multiplication
Python code is more concise and compact, requiring fewer lines to implement the same functionality. In contrast, Java code tends to be more verbose due to explicit type declarations, exception handling, and adherence to naming conventions. Java's need for explicit type handling, especially when initializing arrays and managing input/output operations, contributes to the larger code size compared to Python.

Since the implementations in both languages follow tghe same approach, the time complexity for multiplication is O(n x m x k), meaning that as the matrix sizes increase, the time required to run bith implementations will increase in similar ratio. However, due to different runtime environments and compliation processes, Python code migth take longer to execute than Java implementation.


## Project Structure
```bash
Assignment01-MatrixMultiplication/
├── java-matrix-multiplication/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── matrix/
│   │   │   │       └── assignment/
│   │   │   │           ├── Main.java
│   │   │   │           ├── MatrixMultiplier.java
│   │   └── test/
│   │       ├── java/
│   │       │   └── matrix/
│   │       │       └── assignment/
│   │       │           └── MatrixMultiplicationTest.java
│   └── pom.xml
├── python-matrix-multiplication/
│   ├── main_code/
│   │   ├── Main.py
│   │   ├── matrix_multiplication.py
│   ├── tests/
│   │   ├── test_matrix_multiplication_with_generated_data.py
│   ├── test_cases.json
│   ├── expected_results.json
│   └── README.md
└── README.md


