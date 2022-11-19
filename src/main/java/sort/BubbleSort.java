package sort;

import java.util.Arrays;
import java.util.Random;


// n kvadrat / 2
public class BubbleSort {
    public static void main(String[] args) {

        Random random = new Random();
        int [] arr = new int[]{2,3,1,4};
        int [] arr2 = new int[20];

        for (int i = 0 ; i < arr2.length ; i++){
            arr2[i] = 1+ random.nextInt(100);
        }

        bubleSort(arr);

    }



    public static void sort(int [] arr){

        int count=0;
        int temp = 0 ;


        // 2  3  1  4

        for (int i = 0 ; i < arr.length -1 ; i++){
            for (int j = 0 ; j < arr.length -1 - i; j++){

                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }

                count++;

            }
        }

        Arrays.stream(arr).forEach(n-> System.out.print(n + " "));
        System.out.println("\n"+count);

    }


    //  2  3  1  4
    public static void  bubleSort(int [] arr){

        for (int i = 0 ; i < arr.length - 1 ; i++){
            for (int j = 0 ; j < arr.length - 1 - i ; j++){

                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }

        Arrays.stream(arr).forEach(n-> System.out.println(n));

    }








}
