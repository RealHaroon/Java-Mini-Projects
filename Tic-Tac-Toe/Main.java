import java.util.Scanner;

public class Main {
    static char arr[][]=new char[3][3];

    public static void displayGrid(){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"  |");
            }
            System.out.println("");
    
           }
    }
    public static void makeMove(int row,int col,char symbol){
        arr[row][col]=symbol;

    }
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        
        
        // System.out.println("Enter Row");
        // int row=sc.nextInt();
        // System.out.println("Enter Column");
        // int col=sc.nextInt();
        // System.out.println("Enter input");
        // char inp=sc.next().charAt(0);
        // makeMove(row, col, inp);
        // displayGrid();
        
        
    }
}

//!                                        3x3 Array Grid
//!                                      |0,0||0,1||0,2|
//!                                      |1,0||1,1||1,2|
//!                                      |2,0||2,1||2,2|