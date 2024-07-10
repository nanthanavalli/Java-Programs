import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number = 1+(random.nextInt(3));
        String move = null;
        switch (number) {
            case 1:
                move = "Rock";
                break;
            case 2:
                move = "Paper";
                break;
            case 3:
                move = "Scissor";
                break;    
        }

        System.out.println("Enter your move ");
        String userMove = sc.nextLine();
        System.out.println(move);
        if(move.equals(userMove)){
            System.out.println("Match draw");
        }else if(move.equals("Rock")){
            if(userMove.equals("Paper")){
                System.out.println("You have won");
            }else{
                System.out.println("The computer have won");
            }
        }else if(move.equals("Paper")){
            if(userMove.equals("Scissor")){
                System.out.println("You have won");
            }else{
                System.out.println("The computer have won");
            }
        }else{
            if(userMove.equals("Rock")){
                System.out.println("You have won");
            }else{
                System.out.println("The computer have won");
            }
        }
    }
}
