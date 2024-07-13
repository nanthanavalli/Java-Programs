package Sorting;

import java.util.Scanner;

public class MergeSort {
    public static void merge(int[] arr,int low,int mid,int high){
        int[] temp = new int[high-low+1];
        int left = low;
        int right = mid+1;
        int i =0 ;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[i++] = arr[left++];
            }else{
                temp[i++] = arr[right++];
            }
        }

        while(left<=mid){
            temp[i++] = arr[left++];
        }

        while(right<=high){
            temp[i++] = arr[right++];
        }

        for(int j=0;j<temp.length;j++){
            arr[low+j] = temp[j];
        }

    }
    public static void mergeSort(int[] arr,int low,int high){
        if(low>=high) return;
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr,0,size-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
