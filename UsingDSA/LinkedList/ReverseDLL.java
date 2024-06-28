import java.util.Scanner;
import java.util.Stack;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLL{
    Node head;
    public  void insert(int data){
        Node node = new Node(data);
        Node temp = head;
        if(head == null){
            head = node;
        }else{
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;
        }
    }

    public void print(){
        Node temp = head;
        System.out.println("Elements in the list:");
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void reverse(int pos){
        Stack<Integer> s = new Stack<>();
        Node temp = head;
        int count =0;
        System.out.println("Reversed list");
        while(temp!=null){
            s.push(temp.data);
            count++;
            if(count==pos || temp.next==null){
                while(!s.empty()){
                    System.out.println(s.pop());
                }
                count =0;
            } 
            temp = temp.next;
        }
    }

}
public class ReverseDLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLL list = new DoublyLL();
        boolean exit = false;
        while(!exit){
            System.out.println("Enter choice\n 1.insert\n 2.Reverse\n 3.print\n 4.exit");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                System.out.println("Enter data to be inserted");
                list.insert(sc.nextInt());
                break;
                case 2:
                System.out.println("Enter position");
                list.reverse(sc.nextInt());
                break;
                case 3:
                list.print();
                break;
                case 4:
                exit = true;
                break;
                default:
                System.out.println("Enter valid choice");
            }

        }
    }
}
