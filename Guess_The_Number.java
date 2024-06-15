/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guess_the_number;
import java.util.Random;
import java.util.Scanner;
public class Guess_The_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        int rounds = 3;
        
        System.out.println("Welcome to Guess the Number Game!");

        for (int round = 1; round <= rounds; round++) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 10;
            boolean hasGuessed = false;

            System.out.println("\nRound " + round + " - Guess a number between 1 and 100:");
            
            while (attempts < maxAttempts && !hasGuessed) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You've guessed the number.");
                    int points = maxAttempts - attempts + 1;
                    totalScore += points;
                    System.out.println("You scored " + points + " points this round.");
                    hasGuessed = true;
                } else if (userGuess < numberToGuess) {
                    System.out.println("The number is Higher. Try again.");
                } else {
                    System.out.println("The number is Lower. Try again.");
                }
            }

            if (!hasGuessed) {
                System.out.println("Sorry, you've used all your attempts. The number was " + numberToGuess + ".");
            }
        }

        System.out.println("\nGame Over! Your total score is: " + totalScore);
        scanner.close();
    }
}
