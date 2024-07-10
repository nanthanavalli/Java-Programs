package Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void sort(int[] arr,int n){
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
            // for(int k=0;k<n;k++){
            //     System.out.print(arr[k]+" ");
            // }
            // System.out.println();
        }
        System.out.println("Sorted Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        sort(arr,size);
    }
}
