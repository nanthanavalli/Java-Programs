import java.util.Scanner;

class Node{
    int data;
    Node next;
}

class CLL{
    Node head;
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        if(head == null){
            head = node;
            node.next = head;
        }else{
            Node temp = head;
            while(temp.next!=head){
                temp = temp.next;
            }
            temp.next = node;
            node.next = head;
        }
    }

    public void delete(){
        Node temp = head;
        while(temp.next!=head){
            temp = temp.next;
        }
        temp.next = head;
    }

    public void print(){
        Node temp = head;
        while(temp.next!=head){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}

public class CircularLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CLL list = new CLL();
        boolean exit = false;
        while(!exit){
            System.out.println("Enter choice:\n 1.insert\n 2.delete\n 3.print\n 4.exit");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                System.out.println("Enter data to be inserted");
                list.insert(sc.nextInt());
                break;
                case 2:
                list.delete();
                break;
                case 3:
                System.out.println("Elements in circular linked");
                list.print();
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
