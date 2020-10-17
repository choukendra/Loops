import java.util.Scanner;

class GuessingGame {

    public static void main (String[] args) {
        //1. declare variables
        Scanner sc = new Scanner(System.in);
        int number = (int) (Math.random()*100) + 1;
        int guess = 0;
        int tries = 0;

        System.out.println("What number did I pick? It's between 1 and 100. ");        

        while(guess != number){
            System.out.print("What is your guess? ");
            guess = sc.nextInt();
            tries++;


            if (guess < number){
                System.out.println("Too low ");
            }else if (guess > number){
                System.out.println("Too high ");
            }
        }
        System.out.println("You guessed it. It took " + tries + " tries.");

    }
}