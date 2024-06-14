import java.util.Scanner;

public class Stack_Implementation {
    static int size;
    static  int[] stack = new int[size];
    static int top = -1;

    public static void push(int val){
        if(stack.length>top){
            System.out.println("Stack overflow");
        }else{
            top++;
            stack[top] = val;
        }
    }

    public static int pop(){
        if(top == -1){
            System.out.println("Stack underflow"); 
        }else{
            int data = stack[top];
            top--;
            return data;
        }
        return -1;
    }

    public static int peek(){
        int data = stack[top];
        return data;
    }

    public static void show(){
        for(int i=0;i<top;i++){
            System.out.print(stack[i] + "");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Stack :");
        int size = sc.nextInt();
        
        boolean exit = false;
        while(!exit){
            System.out.println("Enter choice: \n1.push \n2.pop \n3.peek \n4.show");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.print("Enter value to be pushed :");
                    push(sc.nextInt());
                    break;
                case 2:
                    System.out.print(pop());
                    break;
                case 3:
                    System.out.print(peek());
                    break;
                case 4:
                    show();
                    break;
                case 5:
                    exit = true;
                default:
                    System.out.println("Enter a valid option");
            }
        }
        sc.close();
    }
}
