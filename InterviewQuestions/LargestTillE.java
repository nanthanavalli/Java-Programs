

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LargestTillE {

    public static String findLargestNumber(String[] str){
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>();
        for (String str1 : str) {
            if (str1.equals("E")) {
                sb.append(Collections.min(arr));
                arr.clear();
            } else {
                int val = Integer.parseInt(str1);
                arr.add(val);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array");
        int len = sc.nextInt();
        String[] str = new String[len];
        System.out.println("Enter array elements");
        for(int i=0;i<len;i++){
            str[i] = sc.next();
        }
        System.out.println(findLargestNumber(str)); 
        sc.close();       
    }
}
