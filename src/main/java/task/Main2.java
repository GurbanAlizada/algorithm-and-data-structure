package task;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Numbers higher than 50:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 50) {
                System.out.println(numbers[i]);
            }
        }
    }
}