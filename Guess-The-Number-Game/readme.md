# Guess The Number Game

## Overview
This is a simple Java console-based game where the player has to guess a randomly generated number between 0 and 9. The game provides hints if the guessed number is too high or too low and keeps track of the number of attempts.

## Features
- Random number generation using Java's `Random` class.
- User input handling through `Scanner`.
- Hints provided based on the guessed number.
- Tracks the number of attempts taken to guess correctly.

## How It Works
1. The program generates a random number between 0 and 9.
2. The player is prompted to enter a guess.
3. The program provides feedback:
   - "Too high..." if the guessed number is greater than the target.
   - "Too low..." if the guessed number is less than the target.
   - "Yes, you guessed it right!" if the number matches.
4. The game keeps track of the number of attempts and displays them once the player guesses correctly.
5. The game loops until the player correctly guesses the number.

## How to Run
1. Ensure you have Java installed.
2. Copy the code into a file named `practice_guessthenumber.java`.
3. Open a terminal or command prompt.
4. Navigate to the directory containing the Java file.
5. Compile the program:
   ```sh
   javac practice_guessthenumber.java
   ```
6. Run the program:
   ```sh
   java practice_guessthenumber
   ```
7. Follow the prompts to guess the number.

## Code Explanation
- The `game` class contains the game logic:
  - `number`: Stores the randomly generated number.
  - `userinput`: Stores the player's guess.
  - `Guessofnum`: Tracks the number of attempts.
  - `takeUserInput()`: Prompts the user to enter a guess.
  - `isCorrectNumber()`: Checks the guess and provides feedback.
- The `practice_guessthenumber` class contains the `main` method that runs the game loop.

## Example Output
```
Guess The Number
5
Too low...
Guess The Number
7
Too high...
Guess The Number
6
Yes you guessed it right, it was 6 in 3 attempts
```

## Author
Created as part of Java practice for learning object-oriented programming concepts.

