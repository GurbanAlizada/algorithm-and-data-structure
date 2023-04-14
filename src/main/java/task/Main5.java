package task;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
        }

        System.out.print("Elements in the indexes that can be divided by 3: ");
        for (int i = 0; i < 10; i += 3) {
            System.out.print(array[i] + " ");
        }
    }
}
