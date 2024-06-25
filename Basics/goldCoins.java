package Basics;
import java.util.Scanner;

public class goldCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter the age: ");
        age = sc.nextInt();
        int coins;
        if(age<=0){
            System.out.println("Invalid Age");
        }else{
            coins = (int) Math.pow(age, 3);
            System.out.println("Meenu gets " + coins +" coins");
        }
    }
}
