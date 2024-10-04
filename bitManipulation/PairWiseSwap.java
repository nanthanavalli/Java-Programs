//Write a program to swap odd and even bits in an integer
//input: 0101110010 output: 1010110001

import java.util.Scanner;
public class PairWiseSwap {
    static int stringLength = 0;
    public static int binaryToInteger(String binary){
        int num = Integer.parseInt(binary,2);
        return num;
    }

    public static String intToBinary(int swapped){
        StringBuilder sb = new StringBuilder();
        for(int i=stringLength-1;i>=0;i--){
            sb.append((swapped >> i)& 1);
        }
        return sb.toString();
    }
    public static String swapBitsPairWise(int num){
        int even = (num & 0xAAAAAAAA) >> 1;
        int odd = (num & 0x55555555) << 1;
        int swapped = even | odd;
        String bi = intToBinary(swapped);
        return bi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number in binary representation: ");
        String binary = sc.next();
        int x = binaryToInteger(binary);
        stringLength = binary.length();
        String result = swapBitsPairWise(x);
        System.out.println("Swapped :"+ result);
    }
}
