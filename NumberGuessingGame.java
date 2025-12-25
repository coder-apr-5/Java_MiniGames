



import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            Random rand = new Random();
            
            int numberToGuess = rand.nextInt(100) + 1; // 1 to 100
            int userGuess = 0;
            int attempts = 0;
            
            System.out.println("🎮 Welcome to the Number Guessing Game!");
            System.out.println("I have selected a number between 1 and 100.");
            System.out.println("Try to guess it!\n");
            
            while (userGuess != numberToGuess) {
                
                System.out.print("Enter your guess: ");
                userGuess = sc.nextInt();
                attempts++;
                
                if (userGuess > numberToGuess) {
                    System.out.println("Too High! Try again.\n");
                }
                else if (userGuess < numberToGuess) {
                    System.out.println("Too Low! Try again.\n");
                }
                else {
                    System.out.println("\n🎉 Congratulations!");
                    System.out.println("You guessed the number correctly.");
                    System.out.println("Number: " + numberToGuess);
                    System.out.println("Attempts: " + attempts);
                }
            }
        }
    }
}
