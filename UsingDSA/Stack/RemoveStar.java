import java.util.Scanner;
import java.util.Stack;

class RemoveStar{
    public static String removeStar(String str){
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch!= '*'){
                stack.push(ch);
            }else{
                stack.pop(); 
            }
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        

        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        System.out.println(removeStar(str));
    }
}