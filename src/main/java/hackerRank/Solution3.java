package hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.US);
        String us = numberFormat1.format(payment);

        NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = numberFormat2.format(payment);


        NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = numberFormat3.format(payment);


        NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(new Locale("en" , "in"));
        String india = numberFormat4.format(payment);


        // Write your code here.

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}