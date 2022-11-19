package sort;

import java.util.Arrays;
import java.util.Random;

public class InsertingSort {
    public static void main(String[] args) {

        Random random = new Random();
        int [] arr2 = new int[20];

        for (int i = 0 ; i < arr2.length ; i++){
            arr2[i] = 1+ random.nextInt(100);
        }

        sort(new int[]{34,12,42,56,1,532});

    }

    public static void sort(int [] arr){


        for(int i = 1 ; i < arr.length ; i++){

            int key = arr[i];

            int j = i - 1;

            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }

            arr[j+1] = key;

        }

        Arrays.stream(arr).forEach(n-> System.out.print(n+" "));

    }


}
