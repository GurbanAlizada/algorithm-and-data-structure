package array;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        int arr[][]  = new int[][]{
                {2, 3, 4, 4},
                {6 ,5, 7},
                {7, 9, 6, 2, 5 , 9},
                {}
        };


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
