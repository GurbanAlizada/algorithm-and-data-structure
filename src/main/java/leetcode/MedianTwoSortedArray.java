package leetcode;

public class MedianTwoSortedArray {
    public static void main(String[] args) {

        int [] arr1 = {1,3};
        int [] arr2 = {2,8};
        System.out.println("Median : " + median(arr1, arr2));


    }

    public static double median(int[] arr1 , int[] arr2){

        int[] arr = new int[arr1.length + arr2.length];
        int index = 0;
        double median ;

       for (int i = 0; i < arr1.length ; i++){
           arr[i] = arr1[i];
       }

       for (int i = arr1.length ; i < arr.length ; i++){
           arr[i] = arr2[index];
           index++;
       }

       for (int i = 0; i<arr.length ; i++){
           for (int j = i + 1 ; j < arr.length ; j++){
               if (arr[i]>arr[j]){
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
       }


       if (arr.length % 2 == 0){
           median =  ( arr[(arr.length/2)-1] + arr[(arr.length/2)] ) / 2.0;
           return median;
       }else{
           median = arr[(arr.length/2)];
           return median;
       }

    }

}
