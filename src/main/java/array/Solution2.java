package array;

public class Solution2 {
    public static void main(String[] args) {


        int[] arr = {2,3,4,6,7,0,7,54,2,0,6,3,2,0,8,60,8,0,0,9};

        System.out.println(foo(arr , 0 , 2));


    }


    public static int foo(int [] arr , int number , int order){
        int count = 0;

        for (int i=0; i< arr.length ; i++){
            if (arr[i] == number){
                count++;
                if (count == order){
                    return i;
                }
            }
        }
        return -1;
    }


}
