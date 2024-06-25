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

    public void sortedInsert(int data){
        Node node = new Node();
        node.data = data;
        Node temp = head;
        while(temp.next.data<node.data){
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
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


public class CLLInsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CLL list = new CLL();
        boolean exit = false;
        while(!exit){
            System.out.println("Enter choice\n 1.insert\n 2.Sorted insert\n 3.print\n 4.exit");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                System.out.println("Enter data to be inserted;");
                list.insert(sc.nextInt());
                break;
                case 2:
                System.out.println("Enter element to be inserted:");
                list.sortedInsert(sc.nextInt());
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
