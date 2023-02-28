package array;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {

        // array-in elementlerini n vahid sola surusdur.
        int [] arr = {1,2,3,4,5,6,7};
        int [] new_arr = new int[7];
        int n = 3;
        int m= 0 ;

        for (int i = 0 ; i < arr.length ; i++){
            m = i+n;
            new_arr[i] = arr[m % arr.length];
        }

        Arrays.stream(new_arr).forEach(k-> System.out.println(k));

    }
}
