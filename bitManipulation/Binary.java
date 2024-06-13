import java.util.ArrayList;
import java.util.Scanner;
class Binary{

    public static int findBitLength(int num){
        int bits = 0;
        while(num>0){
            bits++;
            num/=2;
        }
        return bits;
    }

    public static void decimalToBinary(int num){
        ArrayList<Integer> binary = new ArrayList<>();
        int absNum = Math.abs(num);

        while(absNum>0){
            binary.add(absNum%2);
            absNum /= 2;
        }

        int bitsRequired = findBitLength(Math.abs(num));

        if(num<0){
            bitsRequired++;
        }
        while(binary.size()<bitsRequired){
            binary.add(0);
        }

        if(num<0){

            for(int i=0;i<binary.size();i++){
                binary.set(i, binary.get(i)== 0?1:0);
            }

            int carry = 1;
            for(int i=0;i<binary.size();i++){
                int sum = binary.get(i) + carry;
                binary.set(i, sum%2);
                carry = sum/2;
            }
        }
        printBinary(binary);

    }
    public static void printBinary(ArrayList<Integer> binary){
        
        System.out.print("The binary value is ");
        for(int i= binary.size()-1;i>=0;i--){
            System.out.print(binary.get(i)+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal: ");
        int decimal = sc.nextInt();
        decimalToBinary(decimal);
        sc.close();
    }
}