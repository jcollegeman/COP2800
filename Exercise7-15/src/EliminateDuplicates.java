import java.util.Scanner;

public class EliminateDuplicates {

    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];
        int size = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < size; j++) {
                if (list[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[size] = list[i];
                size++;
            }
        }

        // Copy only the unique elements to the final array
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int[] unique = eliminateDuplicates(numbers);

        System.out.print("The distinct numbers are: ");
        for (int num : unique) {
            System.out.print(num + " ");
        }

        input.close();
    }
}