import java.util.Scanner;


public class PrintDiagonals {
    public static void print(int[][] mat,int size){
        for(int i=0;i<2*size-1;i++){
            int row = i<size?0 : i-size+1;
            int col = i<size?i : size - 1;

            while(row<size && col>=0){
                System.out.print(mat[row][col]+ " ");
                row++;
                col--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the square matrix: ");
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        print(matrix,size);

    }
}
