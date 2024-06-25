public class StackImplementation {
        static MyStack s = new MyStack();
        
        public static void add() {
            System.out.println("Return to line " + s.pop());
        }
        
        public static void printCurrentLocation() {
            s.push(getCurrentLineNumber());
            add();
            System.out.println("Return to line " + s.pop());
        }
    
        public static void main(String[] args) {
            s.push(getCurrentLineNumber());
            printCurrentLocation();
        }
        public static int getCurrentLineNumber() {
            return Thread.currentThread().getStackTrace()[2].getLineNumber();
        }
    }
    
    class MyStack {
        int[] arr;
        int top;
    
        MyStack() {
            arr = new int[100];
            top = -1;
        }
    
        void push(int n) {
            if (top >= 99) return; 
            System.out.println("Push current state: line " + n);
            arr[++top] = n;
        }
    
        int pop() {
            if (top < 0) return -1;
            return arr[top--];
        }
}
