import java.util.Scanner;

public class nextSmallestNumber {
    public static int binaryToInt(String binary){
        return Integer.parseInt(binary,2);
    }

    public static void nextSmallest(int num){
        int temp = num;
        int c0 = 0;
        int c1 = 0;

        while((temp & 1)==1){
            c1++;
            temp >>=1;
        }

        if(temp==0){
            System.out.println("No smallest number");
        }else{
            while((temp & 1)==0 && temp !=0){
                c0++;
                temp >>=1;
            }

            int p = c0+c1;
            num &= ((~0)<<(p+1));
            int mask = ((1<<(c1+1)) -1);
            mask <<= (c0-1);
            num |= mask;

            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in binary ");
        String binary = sc.next();
        int num = binaryToInt(binary);
        nextSmallest(num);
    }
}
