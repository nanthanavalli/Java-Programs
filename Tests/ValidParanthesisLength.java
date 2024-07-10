package Tests;

import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesisLength {
    static Stack<Integer> stack = new Stack<>();
    public static int findLength(String s){
        int max =0;
        stack.push(-1);
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    max = Math.max(max,i-stack.peek());
                }
            }
        }
        return max;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println(findLength(str));
    }
}
