import java.util.Scanner;

public class NextGreatest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number = scanner.nextLine();
        String nextGreatest = getNextGreatestNumber(number);

        if (nextGreatest.equals(number)) {
            System.out.println("No greater number can be formed with the same digits.");
        } else {
            System.out.println("Next greatest number: " + nextGreatest);
        }
    }

    private static String getNextGreatestNumber(String number) {
        char[] digits = number.toCharArray();
        int n = digits.length;

        int i;
        for (i = n - 2; i >= 0; i--) {
            if (digits[i] < digits[i + 1]) {
                break;
            }
        }
        if (i == -1) {
            return number;
        }

        int j;
        for (j = n - 1; j > i; j--) {
            if (digits[j] > digits[i]) {
                break;
            }
        }
        swap(digits, i, j);

        reverse(digits, i + 1, n - 1);

        return new String(digits);
    }

    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void reverse(char[] array, int start, int end) {
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}