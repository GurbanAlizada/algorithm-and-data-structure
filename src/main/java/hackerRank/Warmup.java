package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;

public class Warmup {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int size = scanner.nextInt();

        for (int i = 0; i<size; i++){
            Integer input = scanner.nextInt();
            list.add(input);
        }

        System.out.println(foo(list));


    }

    public static int foo(List<Integer> candles){

        int result = 0 ;
        int max = 0;
        for (int i = 0;  i <  candles.size() ; i++){
            if (max < candles.get(i)) {
                max = candles.get(i);
            }
        }

        for (Integer element: candles){
            if (element == max){
                result++;
            }
        }

        return result;

    }

}
/*

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int tallest = 0;
        int frequency = 0;


        for(int i=0; i < n; i++){
            int height = in.nextInt();

            if(height > tallest){
                tallest = height;
                frequency = 1;
            }
            else if(height == tallest) frequency++;
        }
        System.out.println(frequency);
    }
}



 */
