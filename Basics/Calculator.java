package Basics;
import java.util.Scanner;

public class Calculator{

    public static int add(int a, int b){
        return a+b;
    }

    public static int sub(int a, int b){
        return a-b;
    }

    public static int mul(int a, int b){
        return a*b;
    }

    public static int div(int a, int b){
        return a/b;
    }

    public static int mod(int a, int b){
        return a%b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a,b;
       boolean exit = false;
       while(!exit){
        System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulo\n6.Exit\nEnter choice:");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("Enter num1: ");
                a = sc.nextInt();
                System.out.println("Enter num2: ");
                b = sc.nextInt();
                System.out.println(add(a,b));
                break;
            case 2:
                System.out.println("Enter num1: ");
                a = sc.nextInt();
                System.out.println("Enter num2: ");
                b = sc.nextInt();
                System.out.println(sub(a,b));
                break;
            case 3:
                System.out.println("Enter num1: ");
                a = sc.nextInt();
                System.out.println("Enter num2: ");
                b = sc.nextInt();
                System.out.println(mul(a,b));
                break; 
            case 4:
                System.out.println("Enter num1: ");
                a = sc.nextInt();
                System.out.println("Enter num2: ");
                b = sc.nextInt();
                System.out.println(div(a,b));
                break; 
            case 5:
                System.out.println("Enter num1: ");
                a = sc.nextInt();
                System.out.println("Enter num2: ");
                b = sc.nextInt();
                System.out.println(mod(a,b));
                break; 
            case 6:
                exit = true;
                break;
            default:
                System.out.println("Enter valid input");         
        }
       }

    }
}
