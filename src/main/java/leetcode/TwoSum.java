package leetcode;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int [] result = new int[2];

        for (int i = 0 ; i  < nums.length ; i++){
            for (int j = i + 1 ; j < nums.length ; j++){
              if ((nums[i] + nums[j])== target){
                  result[0] = i;
                  result[1] = j;
              }
            }
        }


        return result;
    }


    public static void main(String[] args) {
        int [] arr= {2,3,6,7,8,9,3};
        Arrays.stream(twoSum(arr, 12)).forEach(n-> System.out.println(n));
    }


}
