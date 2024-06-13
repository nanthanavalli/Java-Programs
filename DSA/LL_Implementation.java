import java.util.Scanner;

class Node{
    int data;
    Node next;
}

class LinkedList{
    Node head;
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void insertAtFirst(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;
        Node temp = head;

        if(index<0){
            System.out.println("Index cannot be negative");
        }
        if(index == 0){
            insertAtFirst(data);
        }
        for(int i = 0;i<index-1;i++){
            if(temp != null){
                temp = temp.next;
            }else{
                System.out.println("Index out of bounds");
            }   
        }
        if(temp!= null){
            node.next = temp.next;
            temp.next = node;
        }else{
            System.out.println("Index out of bounds");
        }
        
    }

    public void print(){
        Node temp = head;
        System.out.println();
        System.out.println("Elements in linked list:");
        while(temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}


class LL_Implementation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        boolean exit = false;
        
        while(!exit){
            System.out.println("Enter 1 for Insertion\n2 for Insertion at first\n3 for Insertion at specific index\n4 to print the Linked List\n5 to exit ");
            System.out.println();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter number:");
                    list.insert(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Enter number:");
                    list.insertAtFirst(sc.nextInt());
                    break;           
                case 3:
                    System.out.println("Enter number:");
                    int data = sc.nextInt();
                    System.out.println("Enter index:");
                    int index = sc.nextInt();
                    list.insertAt(index,data);
                    break;
                case 4:
                    list.print();
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
