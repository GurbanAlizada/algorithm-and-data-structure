package leetcode;

import java.util.Arrays;

class MissingNumber {


    // 1 2 3 4 5

    // (n*(n+1))/2

    public static void main(String[] args) {
        var arr= new int[]{
                1,2,4,5

        };
        System.out.println(missingNumber(arr));;
    }


    public static int missingNumber(int []arr ){

        int sum = 0;
        int sumWithMissingNumber = ((arr.length+1)*(arr.length + 2))/2;


       for (int i  = 0 ;i< arr.length ; i++){
           sum += arr[i];
       }

        return sumWithMissingNumber - sum;


    }


}
