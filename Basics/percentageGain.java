package Basics;
import java.util.Scanner;

public class percentageGain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  costPrice, repairCost, sellingPrice ;
        System.out.print("Price of old scooter: ");
        costPrice = sc.nextInt();
        System.out.print("The amount for repair: ");
        repairCost = sc.nextInt();
        System.out.print("selling price: ");
        sellingPrice = sc.nextInt();
        float gain;

        if(costPrice <= 0 || sellingPrice <= 0 || repairCost <0){
            System.out.println("Incorrect Inputs");
        }else if(sellingPrice < costPrice+repairCost){
            System.out.println("unable to calculate gain percentage");
        }else{
            gain =(float) (sellingPrice-(costPrice + repairCost) )/(costPrice + repairCost) *100;
            System.out.printf("%.2f",gain);
        }
    }
}
