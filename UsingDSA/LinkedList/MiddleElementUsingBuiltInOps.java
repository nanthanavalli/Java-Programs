import java.util.LinkedList;
import java.util.Scanner;

public class MiddleElementUsingBuiltInOps {
    static LinkedList<Integer> list = new LinkedList<>();
    public static  int middleElement(int size){
        if(size%2==0){
            size /=2;
        }else{
            size = (size/2)+1;
        }

        return list.get(size-1);
    }

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    boolean exit = false;
    while(!exit){
        System.out.println("Enter choice:\n 1.Insert\n 2.Find middle element\n 3.Exit");
        int ch = sc.nextInt();
        switch(ch){
                case 1:
                System.out.println("Enter data to be inserted: ");
                list.add(sc.nextInt());
                break;
                case 2:
                int size = list.size();
                System.out.println("Middle element : "+middleElement(size));
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
