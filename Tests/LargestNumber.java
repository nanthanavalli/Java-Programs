
import java.util.Scanner;

public class LargestNumber {
    public static void findLargestNumber(String[] numbers){
        int digits = numbers[0].length();
        char[] largest = new char[digits];

        for(int i=0;i<digits;i++){
            char max = '0';
            for(String num : numbers){
                if(num.charAt(i)>max){
                    max = num.charAt(i);
                }
            }
            largest[i] = max;
        }

        System.out.println(largest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers = new String[3];
        System.out.println("Enter the numbers");
        for(int i=0;i<3;i++){
            numbers[i] = sc.nextLine();
        }

        findLargestNumber(numbers);
    }
}
