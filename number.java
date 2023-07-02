import java.util.Random;
import java.util.Scanner;

class Number_guess {

    public static void main(String[] args) {
        Random random= new Random();
        int right_guess_number = random.nextInt(100);
        int turns=0;
        Scanner Scan=new Scanner(System.in);
        System.out.println("Guess the number between 1 to 100, You will have 10 turns!" +
                "that is selected randomly \n" );
        System.out.println("All the best..!! \n start guessing and Play the game\n enter your first guess: \n");


        int guess;
        int i=0;
        boolean win=false;
        while(win==false) {
            guess=Scan.nextInt();
            turns++;

            if(guess==right_guess_number) {
                win=true;
            }
            else if(i>9){
                System.out.println("You loose! the right answer was: "+right_guess_number);
                return;
            }
            else if(guess<right_guess_number){
                i++;
                System.out.println("Your Guess is lower than the right guess! Turns left: " +(10-i) +"\n");



            }
            else if(guess>right_guess_number) {
                i++;
                System.out.println("Your Guess Is Higher Than THe Right Guess! Turns left: " +(10-i) +"\n");

            }

        }
        System.out.println("You won!!! Congratulations...");
        System.out.println("Then number was "+right_guess_number);
        System.out.println("\n You used "+turns+" turns to guess the right number");
        System.out.println("Your score is "+((11-turns)*10)+" out of 100");


    }
}
