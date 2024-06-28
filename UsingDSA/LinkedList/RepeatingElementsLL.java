// import java.util.Iterator;
// import java.util.LinkedList;
import java.util.Scanner;


// public class RepeatingElementsLL {
//     public static void main(String[] args){
//         LinkedList<Integer> list = new LinkedList<>();
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter no. of elements");
//         int elementCount = sc.nextInt();
//         for(int i=0;i<elementCount;i++){
//             list.add(sc.nextInt());
//         }

//         System.out.println("Enter element to count it's repetition");
//         int ele = sc.nextInt();

//         Iterator<Integer> it = list.iterator();
//         int count = 0;
//         while(it.hasNext()){
//             if(it.next()==ele) count++;
//         }
//         System.out.println(count);

//     }
// }

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class RepeatingElementsLL{
    static Node head;
    public static void insert(int data){
        Node node = new Node(data);
        Node temp = head;
        if(head == null){
            head = node;
        }else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next = node;
        }
    }

    public static int repetition(int ele){
        int count =0;
        Node temp = head;
        while(temp!=null){
            if(temp.data == ele) count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            System.out.println("Enter choice\n 1.Insert\n 2.Find repetition\n 3.exit");
            int ch = sc.nextInt(); 
            switch(ch){
                case 1:
                System.out.println("Enter element to be inserted ");
                insert(sc.nextInt());
                break;
                case 2:
                System.out.println("Enter element to count it's repetition");
                System.out.println("Repeating count :"+ repetition(sc.nextInt()));
                break;
                case 3:
                exit = true;
                break;
                default:
                System.out.println("Enter valid choice");
            }
        }

    }
}