import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        while (true) {
            System.out.println("Let's play the Craps Game!");
            int dice1 = rand.nextInt(6) + 1;
            int dice2 = rand.nextInt(6) + 1;
            int sum = dice1 + dice2;
            System.out.println("You rolled a: " + dice1 + " and " + dice2 + "  (sum = " + sum + ")");
            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You lose.");}
            else if (sum == 7 || sum == 11) {
                System.out.println("You win.");}
            else
            {System.out.println("Your point is " + sum + ". Roll again!");
                boolean pointComplete = false;
                while (true) {
                    System.out.println("Press Enter to roll the dice...");
                    scanner.nextLine();
                    dice1 = rand.nextInt(6) + 1;
                    dice2 = rand.nextInt(6) + 1;
                    int rollSum = dice1 + dice2;
                    System.out.println("You rolled a: " + dice1 + " and " + dice2 + "  (sum = " + rollSum + ")");
                    if (rollSum == sum) {
                        System.out.println("You made your point! You win.");
                        pointComplete = true;
                        break;}
                    else if (rollSum == 7) {
                        System.out.println("You rolled a 7! You lose.");
                        break;}
                    else {System.out.println("Trying for point...");}}
                if (pointComplete || sum == 7 || sum == 11 || sum == 2 || sum == 3 || sum == 12)
                {System.out.println("Do you want to play again? (yes/no)");
                    String playAgain = scanner.nextLine().trim();
                    if (!playAgain.equalsIgnoreCase("yes")) {
                        System.out.println("Thank you for playing the game.");
                        break;
                    }
                }
            }
        }
    }
}
