

import java.util.Scanner;
import java.util.Random;

public class practic_rock_paper_scissor {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        String[] rps = {"r", "p", "s"};
        String move;
        while (true) {

            String computer = rps[ran.nextInt(rps.length)];
            System.out.println("enter your move");
            move = sc.nextLine();
            if (move.equals("r") || move.equals("p") || move.equals("s")) {

            } else {
                System.out.println(move + "  game ended cause move is invalid");
                break;
            }

            System.out.println("computer played " + computer);
            if (move.equals(computer)) {
                System.out.println("tie");
            } else if (move.equals("r")) {
                if (computer.equals("p")) {
                    System.out.println("you Lost");
                } else if (computer.equals("s")) {
                    System.out.println("you Won ");
                }
            } else if (move.equals("p")) {
                if (computer.equals("r")) {
                    System.out.println("you Won");
                } else if (computer.equals("s")) {
                    System.out.println("you Lost");
                }
            } else if (move.equals("s")) {
                if (computer.equals("p")) {
                    System.out.println("you Won");
                } else if (computer.equals("r")) {
                    System.out.println("you Lost");
                }
            }

        }


    }
}







