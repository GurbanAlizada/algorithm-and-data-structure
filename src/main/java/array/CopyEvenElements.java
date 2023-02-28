package array;

import java.util.Arrays;

public class CopyEvenElements {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8};
        int [] arr_even = new int[8];
        int j = 0;

        for (int i = 0 ; i < arr.length ; i++){


            if (arr[i]%2 == 0){
                arr_even[j] = arr[i];
                j++;
            }


        }


        Arrays.stream(arr_even).forEach(n-> System.out.println(n));

    }
}
