package Basics;
import java.util.Scanner;

public class RightRotate {
    public static int[] swap(int[] arr,int arrStart,int arrEnd){
        while(arrStart<arrEnd){
            int temp = arr[arrStart];
            arr[arrStart] = arr[arrEnd];
            arr[arrEnd] = temp;
            arrStart++;
            arrEnd--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter numbers: ");
        for (int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("The position to be rotated: ");
        int rotate = sc.nextInt();
        arr = swap(arr,0,size-rotate-1);
        arr = swap(arr,size-rotate,size-1);
        arr = swap(arr,0,size-1);
        System.out.println("Rotated array: ");
        for(int i = 0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
