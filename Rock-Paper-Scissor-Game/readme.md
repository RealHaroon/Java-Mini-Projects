# Rock-Paper-Scissors Game

This is a simple Rock-Paper-Scissors game implemented in Java. The game allows the user to play against the computer in an infinite loop until an invalid move is entered.

## How It Works
- The user inputs their move (`r` for rock, `p` for paper, `s` for scissors).
- The computer randomly selects a move.
- The game compares the moves and determines the winner.
- If the user enters an invalid move, the game ends.

## Rules
- **Rock (r) beats Scissors (s)** → User Wins.
- **Scissors (s) beats Paper (p)** → User Wins.
- **Paper (p) beats Rock (r)** → User Wins.
- If both the user and the computer choose the same move, it is a tie.
- Any other input ends the game.

## How to Run
1. Copy the Java code into a file named `practic_rock_paper_scissor.java` inside a package named `Practice_java`.
2. Compile and run the program using a Java compiler.
3. Enter your move when prompted.

## Example Output
```
enter your move
r
computer played p
you L
enter your move
s
computer played p
you W
enter your move
x
x  game ended cause move is invalid
```

## Enhancements
- Add a scoring system.
- Allow users to play a fixed number of rounds.
- Provide a menu option to restart or exit the game.

## Author
Haroon Abbas Khan
https://github.com/RealHaroon