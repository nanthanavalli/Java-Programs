// You are given two 32 bit numbers, N and M and two bit positions i and j.Write a method to insert M into N such that M starts at 
// bit j and ends at bit i. eg. input N = 10000000000, M = 10011, i = 2, j=6 output = 10001001100

import java.util.Scanner;

// public static int binaryToInt(String binary){
//     return Integer.parseInt(binary, 2);
// }

public class Insertion {
    public static void printBinary(int num){
        StringBuilder binary = new StringBuilder();
        for(int i=31;i>=0;i--){
            binary.append((num >> i) & 1);
        }
        System.out.println(binary.toString());
    }
    public static int updateBits(int N,int M,int i,int j) {
        int allOnes = ~0;
        int left = allOnes << (j+1);
        int right = ((1<<i) - 1);
        int mask = left | right;
        int nCleared = N & mask;
        int mShifted = M << i;

        return nCleared | mShifted;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int N = sc.nextInt();
        System.out.println("Enter M");
        int M = sc.nextInt();
        System.out.println("Enter i");
        int i = sc.nextInt();
        System.out.println("Enter j");
        int j = sc.nextInt();


        int result = updateBits(N,M,i,j);
        printBinary(result);

    }
}
