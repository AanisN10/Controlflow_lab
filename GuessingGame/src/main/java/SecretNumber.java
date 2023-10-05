import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args) {
// Prompt the user to input their number
        System.out.println("Welcome to the Guessing Game, can you guess my secret number!");


        Scanner reader = new Scanner(System.in);
        int lowerBound =0;
        int upperBound = 10;

        System.out.println(" Hint " +"the number is between " +lowerBound +" and " + upperBound);
        int secretNumber = reader.nextInt();

        if (secretNumber<=5){
            System.out.println("too low try again");
        } else if (secretNumber>=7){
            System.out.println("too high try again");
        }else {
            System.out.println("Well done you have guessed it!!");
        }

        

    }
}
