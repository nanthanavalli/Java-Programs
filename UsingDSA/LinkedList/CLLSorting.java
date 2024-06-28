import java.util.Scanner;

class Node{
    int data;
    Node next;
}

class CircularLL{
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

    public void sort(){

        Node p1 = head;
        Node p2 = head.next;
        int temp;
        while(p1.next!= head){
            while(p2!=head){
                if(p1.data>p2.data){
                    temp = p1.data;
                    p1.data = p2.data;
                    p2.data = temp;
                }
                p2= p2.next;
            }
            p1 = p1.next;
            p2 = p1.next;
        }
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
public class CLLSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLL list = new CircularLL();
        boolean exit = false;
        while(!exit){
            System.out.println("Enter choice\n 1.insert\n 2.sort\n 3.print\n 4.exit");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                System.out.println("Enter data to be inserted;");
                list.insert(sc.nextInt());
                break;
                case 2:
                list.sort();
                break;
                case 3:
                list.print();
                break;
                case 4:
                exit = true;
                default:
                System.out.println("Enter valid choice");
            }

        }
    }
}
