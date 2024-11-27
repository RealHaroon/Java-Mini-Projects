package Practice_java;

import java.util.Random;
import java.util.Scanner;
class game{
    public int number;
    public int  Guessofnum=0;
public int userinput;
    public int getGuessofnum() {
        return Guessofnum;
    }

    public void setGuessofnum(int Guessofnum) {
        this.Guessofnum= Guessofnum;
    }

    public game (){
        Random ran=new Random();
        this.number= ran.nextInt(10);

    }
    void takeUserInput(){
        System.out.println("Guess The Number");
Scanner scr=new Scanner(System.in);
this.userinput= scr.nextInt();

    }
boolean isCorrectNumber(){
       // Guessofnum++; --> also applicable
        if (userinput==number){
            System.out.format("Yes you guessed it right, it was %d in %d attempts ",number,Guessofnum);
            return true;
        } else if (userinput<number) {
            System.out.println("too low...");
        }else if (userinput>number) {
            System.out.println("too high...");
        }
    return false;
}

}
public class practice_guessthenumber {
    public static void main(String[] args) {
        game g = new game();
        boolean b=false;
     while (!b) {

         g.takeUserInput();
        b  = g.isCorrectNumber();
      g.Guessofnum++;

     }
    }
}
 /*
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         */
