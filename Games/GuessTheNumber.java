
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number =1+( random.nextInt(100)); //1 + (int) (100 * Math.random() , we can also use this
        int guess;
        int trials = 5;
        int i;
        for (i = 0; i < trials; i++) {
            System.out.println("Guess the number you have "+(trials-i)+" trials");
            guess = sc.nextInt();
            if (guess == number) {
                System.out.println("you have guessed the number");
                break;
            } else if (guess > number) {
                System.out.println("The number is less than " + guess);
            } else {
                System.out.println("The number is greater than " + guess);
            }
            if(i==trials-1){
                System.out.println("your chances are over");
                System.out.println("The number is "+number);
            }
        }

    }
}
