import java.util.Scanner;

public class incomeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of working hours: ");
        int workedHours = sc.nextInt();
        int pay = 100;
        System.out.println();

        if(workedHours > 24 || workedHours <0){
            System.out.println("Unable to calculate the earnings.");
        }else{
            System.out.print("Total income in a year :"+ workedHours*pay*365);
        }
    }
}
