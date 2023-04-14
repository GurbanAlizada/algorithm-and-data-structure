package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiogonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {

        int [][] array = new int[arr.size()][arr.size()];
        int i=0;
        int j=0;

                    for(List<Integer> list : arr) {
                        for (Integer element : list) {
                            array[i][j] = element;
                            j++;
                        }
                        j = 0;
                        i++;
                    }

                int sum1 = 0;
                int sum2 = 0;

                for (int m = 0; m < array.length ; m++){
                    for (int n = 0 ; n < array.length ; n++){
                        if (m==n) {
                            sum1 +=array[m][n];
                        }
                    }
                }

        //System.out.println(sum1);


        for (int m = 0; m < array.length ; m++){
            for (int n = 0 ; n < array.length ; n++){
                if (m+n== array.length-1) {
                    sum2 +=array[m][n];
                }
            }
        }

        //System.out.println(sum2);

        return Math.abs(sum1-sum2);
    }

    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(4);
        arr2.add(5);
        arr2.add(6);
        List<Integer> arr3 = new ArrayList<>();
        arr3.add(7);
        arr3.add(8);
        arr3.add(9);
        
        List<List<Integer>> param = new ArrayList<>();
        param.add(arr1);
        param.add(arr2);
        param.add(arr3);

        System.out.println(diagonalDifference(param));

    }
}
