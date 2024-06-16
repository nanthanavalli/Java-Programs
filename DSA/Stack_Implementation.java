import java.util.Scanner;

public class Stack_Implementation {
    static int size;
    static  int[] stack;
    static int top = -1;
    
    public static void push(int val){
        if(top == size-1){
            System.out.println("Stack overflow");
        }else{
            top++;
            stack[top] = val;
        }
    }

    public static int pop(){
        if(top == -1){
            System.out.println("Stack underflow"); 
            return -1;
        }else{
            int data = stack[top];
            top--;
            return data;
        }  
    }

    public static int peek(){
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }else{
            return stack[top];
        }
        
    }

    public static void show(){
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Stack :");
        size = sc.nextInt();
        stack = new int[size];
        
        boolean exit = false;
        while(!exit){
            System.out.println("1.push \n2.pop \n3.peek \n4.show \n5.exit\nEnter choice: ");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.print("Enter value to be pushed :");
                    push(sc.nextInt());
                    break;
                case 2:
                    int poppedvalue= pop();
                    if(poppedvalue != 0){
                        System.out.println("Popped value: " + poppedvalue);
                    }
                    break;
                case 3:
                int peekedValue = peek();
                if (peekedValue != -1) {
                    System.out.println("Top value: " + peekedValue);
                }
                break;
                case 4:
                    show();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Enter a valid option");
            }
        }
        sc.close();
    }
}
