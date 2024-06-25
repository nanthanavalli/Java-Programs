package Basics;
import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter number: ");
        num = sc.nextInt();
        int a = num & 1;
        if(a == 1){
            System.out.println("it is a odd number.");
        }else{
            System.out.println("it is a even2 number.");
        }
    }
}
