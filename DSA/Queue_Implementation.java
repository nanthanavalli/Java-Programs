import java.util.Scanner;

class Queue_Implementation{

    public static int size;
    public static int[] queue; 
    public static int rear = -1;
    public static int front = -1;

    public static void enqueue(int data){
        if(rear == size-1){
            System.out.println("Overflow");
        }else if(front == -1 && rear == -1){
            front = rear = 0;
            queue[rear] = data;
        }else{
            rear++;
            queue[rear] = data;
        }
    }

    public static void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Underflow");
        } else {
            int data = queue[front];
            front++;
            if (front > rear) {
                front = rear = -1;  
            }
            System.out.println("Dequeued value is " + data);
        }
    }

    public static void show(){
        if (front == -1) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the queue :");
        size = sc.nextInt();
        queue = new int[size];
        boolean exit = false;

        while(!exit){
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Print\n4.Exit\nEnter your choice:");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                     System.out.println("Enter value to the queue:");
                     enqueue(sc.nextInt());
                     break;
                case 2:
                     dequeue(); 
                     break;
                case 3:
                     show();
                     break; 
                case 4:
                     exit = true;
                     break;         
                default:
                      System.out.println("Enter valid choice.");
            }
        }
        sc.close();
    }
}