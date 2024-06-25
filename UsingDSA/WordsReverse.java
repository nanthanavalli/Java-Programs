import java.util.Scanner;

 class Stack{
   char[] arr;
   int top;
   Stack(){
    arr = new char[100];
    top = -1;
   }

   public void push(char a){
    top++;
    arr[top] = a;
   }

   public char pop(){
    return arr[top--];
   }
}

public class WordsReverse {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i == s.length()-1){
                s1.push(s.charAt(i));
                while(s1.top != -1){
                    sb.append(s1.pop());
                }
            }
            else if(s.charAt(i) != ' '){
                s1.push(s.charAt(i));
            }else{
                while(s1.top != -1){
                    sb.append(s1.pop());
                }
                sb.append(" ");
            }
        }
        System.out.println(sb);
        sc.close();
    }
}

