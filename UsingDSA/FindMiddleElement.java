import java.util.Scanner;

class Node{
     int data;
     Node next;
}


class LL{
    Node head;
    public void insert(int data){  
        Node node = new Node();
        node.next = null;
        node.data = data;

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

    public  int middleElement(){
        int count =0;
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
            count++;
        }
        temp = head;

        if(count%2==0){
            count /=2;
        }else{
            count = (count/2) +1;
        }
        while(count>0){
            temp = temp.next;
            --count;
        }
        return temp.data;
    } 
}
public class FindMiddleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL list = new LL();
        boolean exit = false;
        while(!exit){
            System.out.println("Enter choice:\n 1.Insert\n 2.Find middle element\n 3.Exit\n 4.show");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                System.out.println("Enter data to be inserted: ");
                list.insert(sc.nextInt());
                break;
                case 2:
                System.out.println("Middle element : "+list.middleElement());
                break;
                case 3:
                exit = true;
                break;
                default:
                System.out.print("Enter valid choice");
            }
        }
        sc.close();
    }
}

