# Library Management System

## Overview
This Java program implements a simple Library Management System that allows users to add books, issue books, return books, and view available books.

## Features
- **Add Books:** Allows adding new books to the library.
- **Issue Books:** Allows issuing books to users, removing them from the available list.
- **Return Books:** Allows returning issued books to the library.
- **Show Available Books:** Displays all books currently available in the library.

## How It Works
1. A `Library` class is created with an array to store available books.
2. Methods are implemented to manage book transactions.
3. The `caller_library` class initializes the library and demonstrates its functionality.

## How to Run
1. Ensure you have Java installed.
2. Copy the code into a file named `caller_library.java`.
3. Open a terminal or command prompt.
4. Navigate to the directory containing the Java file.
5. Compile the program:
   ```sh
   javac caller_library.java
   ```
6. Run the program:
   ```sh
   java caller_library
   ```
7. Follow the output to interact with the library system.

## Code Explanation
- **Library Class:**
  - `avbooks`: Stores available books.
  - `no_of_books`: Tracks the number of books.
  - `addBook(String book)`: Adds a book to the library.
  - `issueBook(String isbook)`: Issues a book if available.
  - `returnBook(String rbook)`: Returns a book to the library.
  - `showAvailableBooks()`: Displays available books.
- **caller_library Class:**
  - Contains the `main` method that initializes the library and calls its methods.

## Example Output
```
Atomic habits, has been added.
Java, has been added.
Human Psychology, has been added.
Python, has been added.
Java  has been issued!
Available books are:
* Atomic habits
* Human Psychology
* Python
java, has been added.
Available books are:
* Atomic habits
* Human Psychology
* Python
* java
```

## Author
Created as a Java practice project to understand object-oriented programming concepts in library management.

