package hackerRank;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {


        foo2(Arrays.asList(396285104 , 573261094 ,759641832 ,819230764, 364801279));

    }

    // 2 4 6 1 4

    public static void foo(List<Integer> list){

        Integer arr[] = new Integer[list.size()];

        int i=0;
        for (Integer element  :list){
            arr[i] = element;
            i++;
        }

        for (int m = 0 ; m < arr.length ; m++){
            for (int n = m+1 ; n  < arr.length ; n++){
                if (arr[m] > arr[n]){
                    Integer temp = arr[n];
                    arr[n] = arr[m];
                    arr[m] = temp;
                }

            }
        }


        Long min = 0L , max = 0L;

        for (int x=1; x<arr.length ; x++){
            max += arr[x];
        }



        for (int y = 0 ; y< arr.length -1 ; y++){
            min += arr[y];
        }

        System.out.println(min+" "+max);
    }

    public static void foo2(List<Integer> arr){
        long max=0,min=0;

        int array[] = new int[arr.size()];
        for (int i = 0 ; i < arr.size() ; i++){
            array[i] = arr.get(i);
        }
        Arrays.sort(array);

        for (int i = 0; i < array.length-1 ; i++){
            min += array[i];
        }
        for (int j = 1; j < array.length ; j++){
            max += array[j];
        }

        System.out.println(min + " "+ max);

    }


}
