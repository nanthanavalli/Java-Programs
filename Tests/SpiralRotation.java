public class SpiralRotation {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        spiralRotate(matrix);

        // Print the rotated matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void spiralRotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        
        while (top < bottom && left < right) {
            int prev = matrix[top][left];
            
            // Move elements of top row one step left
            for (int i = left + 1; i <= right; i++) {
                int curr = matrix[top][i];
                matrix[top][i] = prev;
                prev = curr;
            }
            top++;

            // Move elements of right column one step up
            for (int i = top; i <= bottom; i++) {
                int curr = matrix[i][right];
                matrix[i][right] = prev;
                prev = curr;
            }
            right--;

            // Move elements of bottom row one step right
            for (int i = right; i >= left; i--) {
                int curr = matrix[bottom][i];
                matrix[bottom][i] = prev;
                prev = curr;
            }
            bottom--;

            // Move elements of left column one step down
            for (int i = bottom; i >= top; i--) {
                int curr = matrix[i][left];
                matrix[i][left] = prev;
                prev = curr;
            }
            left++;
        }
    }
}
