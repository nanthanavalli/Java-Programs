package Sorting;

import java.util.Scanner;

public class QuickSort {
    public static int findPartitionIndex(int[] arr,int low,int high){
        int i = low;
        int j = high;
        int pivot = arr[low];
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }

            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[low] = arr[j];
        arr[j] = pivot;
        return j;
    }
    public static void quickSort(int[] arr,int low,int high){
        if(low>high) return;
        int partitionIndex = findPartitionIndex(arr,low,high);
        quickSort(arr,low,partitionIndex-1);
        quickSort(arr,partitionIndex+1,high);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        quickSort(arr,0,size-1);

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
