package Basics;
import java.util.Scanner;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        int range = sc.nextInt();
        int[] arr = new int[range];
        System.out.print("Enter no. of elements:");
        int n = sc.nextInt();
        System.out.print("Enter numbers: ");
        for(int i=0;i<n;i++){
            // int num = sc.nextInt();
            // arr[num-1] = num;
            arr[sc.nextInt() - 1] = 1;
        }
        System.out.print("Missing numbers: ");
        for(int i=0;i<range;i++){
            if(arr[i]==0){
                System.out.print(i+1 + " ");
            }
        }
        
    }
}
