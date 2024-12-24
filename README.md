
# **Java Practice Projects**

## **Projects Overview**

This repository contains:
1. **Rock-Paper-Scissors Game:** A simple CLI game where the user competes against the computer.
2. **Guess the Number Game:** A number-guessing game with randomized numbers and tracking of user attempts.
3. **Library Management System:** A system for managing a library, including adding, issuing, and returning books.
4. **ATM Simulator:** A simulation of basic ATM functionality with login, balance check, deposit, and withdrawal operations.

---

## **Project Details**

### **1. Rock-Paper-Scissors**
- **File:** `practic_rock_paper_scissor.java`
- **Description:**  
  A classic Rock-Paper-Scissors game where the user inputs their move (`r`, `p`, or `s`) and the computer randomly selects a move. The game checks for a win, loss, or tie and continues until the user enters an invalid move.
- **Features:**
  - Randomized computer moves.
  - User input validation.
  - Simple win/lose conditions.
- **How to Play:**
  - Run the program.
  - Enter `r` for Rock, `p` for Paper, or `s` for Scissors.
  - Exit by entering an invalid move.

---

### **2. Guess the Number**
- **File:** `practice_guessthenumber.java`
- **Description:**  
  A number-guessing game where the user attempts to guess a random number (0-9). The game provides hints like "too high" or "too low" and tracks the number of attempts.
- **Features:**
  - Random number generation.
  - Input validation.
  - Tracks the number of guesses.
- **Key Methods:**
  - `takeUserInput()`: Takes the user's guess.
  - `isCorrectNumber()`: Checks if the guess is correct and provides feedback.
- **How to Play:**
  - Run the program.
  - Enter a number between 0 and 9.
  - Keep guessing until you find the correct number.

---

### **3. Library Management System**
- **File:** `practice_LibraryManagement.java`
- **Description:**  
  A basic library management system that allows adding, issuing, returning, and displaying available books. Books are managed using an array.
- **Features:**
  - **Add Books:** Add new books to the library.
  - **Issue Books:** Issue a book, marking it as unavailable.
  - **Return Books:** Return a previously issued book.
  - **Show Available Books:** Display all available books.
- **Key Methods:**
  - `addBook(String book)`: Adds a new book to the library.
  - `issueBook(String book)`: Marks a book as issued.
  - `returnBook(String book)`: Returns a book to the library.
  - `showAvailableBooks()`: Displays all available books.
- **How to Use:**
  - Run the program.
  - Follow the predefined operations in the `main` method.

---

### **4. ATM Simulator**
- **File:** `Atm_Simulator.java`
- **Description:**  
  A simulation of an ATM system that supports user login, balance checking, money deposit, and withdrawal functionality.
- **Features:**
  - **User Login:** Prompts the user to enter a 4-digit PIN and validates it.
  - **Check Balance:** Displays the current account balance.
  - **Deposit Money:** Allows the user to add money to their account.
  - **Withdraw Money:** Allows the user to withdraw money, ensuring sufficient balance.
  - **Exit:** Allows the user to end the session.
- **Key Methods:**
  - `userLogin(int input_pin)`: Validates the user's PIN.
  - `getBalance()`: Returns the current balance.
  - `deposit(int depAmt)`: Adds the specified amount to the account balance.
  - `withdraw(int withdrawAmt)`: Deducts the specified amount from the balance, if sufficient.
- **How to Use:**
  - Run the program.
  - Enter your PIN when prompted.
  - Choose an action from the menu:
    - Check Balance
    - Deposit Money
    - Withdraw Money
    - Exit
  - Follow the prompts for each action.
- **Sample Output:**
  ```
  **ATM MACHINE**
  Enter Your 4-digit Pin: 2222

      Login Successful.
      Press 1 to Check Balance.
      Press 2 to Deposit Money.
      Press 3 to Withdraw Money.
      Press 4 to Exit.

  Enter your choice 1-4: 2
      Deposit Money: 500
      500 Added Successfully!
  ```
