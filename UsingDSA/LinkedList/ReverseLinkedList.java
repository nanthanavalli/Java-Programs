import java.util.Scanner;

class Node{
    int data;
    Node next;
}

class Linkedlistt{
    Node head;
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null){
            head = node;
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        
        Node temp = head;
        System.out.println("Elements reversed");
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        Linkedlistt ll = new Linkedlistt();
        Scanner sc = new Scanner(System.in);
        int size = 5;
        System.out.println("Enter elements:");
        for(int i=0;i<size;i++){
            ll.insert(sc.nextInt());
        }
        ll.reverse();
    }
}
