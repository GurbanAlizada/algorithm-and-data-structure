package sort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {

        Random random = new Random();
        int [] arr2 = new int[20];

        for (int i = 0 ; i < arr2.length ; i++){
            arr2[i] = 1+ random.nextInt(100);
        }

        selectionSort(arr2);


    }

    public static void sort(int [] arr){


        int counter = 0 ;

        for(int i = 0 ; i < arr.length ; i++){

            int min_inx = i;

            for (int j = i + 1 ; j < arr.length ; j++){
                if(arr[min_inx] > arr[j]){
                    min_inx = j;
                }

                counter++;
            }

            // swapping
            int temp  =  arr[min_inx];
            arr[min_inx] = arr[i];
            arr[i] = temp;

        }

        Arrays.stream(arr).forEach(n-> System.out.print(n + " "));
        System.out.println("\n" + counter);


    }



    public static void selectionSort(int [] arr){



        for(int  i = 0 ; i < arr.length ; i++){

            int min_inx = i;


            for(int j = i +1 ; j < arr.length ; j++){

                if(arr[min_inx] > arr[j]){
                    min_inx = j;
                }

            }

            int temp = arr[min_inx];
            arr[min_inx] = arr[i];
            arr[i] = temp;

        }


        Arrays.stream(arr).forEach(System.out::println);

    }

}
