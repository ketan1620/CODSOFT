import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minRange = 1;
        int maxRange = 100;
        int targetNumber = getRandomNumber(minRange, maxRange);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've picked a number between " + minRange + " and " + maxRange + ". Can you guess it?");

        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
                break;
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Too high! Try a lower number.");
            }
        }

        scanner.close();
    }

    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
