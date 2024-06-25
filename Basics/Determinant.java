package Basics;

// import java.util.Scanner;

// public class Determinant {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter rows: ");
//         int rows = sc.nextInt();
//         System.out.print("Enter columns: ");
//         int col = sc.nextInt();
//         int[][] matrix = new int[rows][col];

//     for(int i=0;i<rows;i++){
//         for(int j=0;j<col;j++){
//             matrix[i][j] = sc.nextInt(); 
//         }
//     }

    
//     }
// }
import java.util.Scanner;

public class Determinant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();
        System.out.print("Enter columns: ");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        int[][] det = new int[n][m];

        System.out.println("Enter numbers: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
            
        }

        System.out.println("Determinant: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int sum = 0;
                for(int k = 0; k < n; k++){
                    for(int l = 0; l < m; l++){
                        if(k == i || l == j) continue;
                        sum += matrix[k][l];
                    }
                }
                det[i][j] = sum;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(det[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();




        sc.close();
    }
}