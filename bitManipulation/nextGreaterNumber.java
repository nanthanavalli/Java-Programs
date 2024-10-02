//Given a positive integer, print the next largest number that have the same number of 1 bits in their binary representation
import java.util.Scanner;
public class nextGreaterNumber {
    public static void intToBinary(int num){
        StringBuilder sb = new StringBuilder();
        for(int i=31;i>=0;i--){
            sb.append((num >> i)& 1);
        }
        System.out.println(sb.toString());
    }
    public static int binaryToInt(String binary){
        int n = Integer.parseInt(binary, 2);
        return n;
    }

    public static void nextGreatest(int num){
        int temp = num;
        int c0 = 0;
        int c1 = 0;
        while((temp & 1)==0 && temp!=0){
            c0++;
            temp >>=1;
        }
        while((temp & 1)==1){
            c1++;
            temp >>=1;
        }

        if(c0+c1 == 31 || c0+c1 ==0){
            System.out.println("No greater number");
        }else{
            int p = c0 + c1;
            num |= (1 << p);
            num &= ~((1 << p) - 1);
            num |= (1<< (c1 -1)) - 1;
            System.out.println(num);
            intToBinary(num);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number in binary");
        String binary = sc.next();
        int num = binaryToInt(binary);
        nextGreatest(num);
    }
}
