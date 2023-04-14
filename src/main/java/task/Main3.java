package task;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maxOdd = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1 && numbers[i] > maxOdd) {
                maxOdd = numbers[i];
            }
        }

        if (maxOdd != Integer.MIN_VALUE) {
            System.out.println("Maximum odd number: " + maxOdd);
        } else {
            System.out.println("There is no odd number.");
        }
    }
}