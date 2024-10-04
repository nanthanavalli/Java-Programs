//Write a program to determine the number of bits you would need to flip to convert integer A to integer B
//input: 29(11101), 15(01111) output: 2

import java.util.Scanner;
public class Conversion {
    public static int bitsToBeFlipped(int a, int b){
        int count =0;
        for(int c=a^b;c!=0;c >>=1){
            count += c & 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Etnter num1");
        int x =  sc.nextInt();
        System.out.print("Etnter num2");
        int y =  sc.nextInt();
        System.out.println("No. of bits need to be flipped is "+bitsToBeFlipped(x,y));
    }
}
