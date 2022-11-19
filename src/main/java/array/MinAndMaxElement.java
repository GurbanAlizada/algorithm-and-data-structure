package array;


import java.util.Arrays;

public class MinAndMaxElement {
    public static void main(String[] args) {
        int arr[] = {
                4,
                78,
                65,
                87,
                23,
                45,
                1   };

       int[] arr2 =  arr.clone();
       Arrays.stream(arr2).forEach(n-> System.out.print(n+" "));

        System.out.println(min(arr));
        System.out.println(max(arr));


    }

    public static int min(int [] arr){

        int min = arr[0];

        for(int i = 1 ; i  < arr.length ; i++){
            if(min > arr[i]){
                    min = arr[i];
            }
        }
        return min;
    }


    public static int max(int [] arr){

        int max = arr[0];

        for(int i = 1 ; i  < arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        return max;
    }



}
