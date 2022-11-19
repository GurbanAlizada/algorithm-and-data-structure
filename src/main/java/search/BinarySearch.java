package search;

import java.util.Arrays;

class BinarySearch{

    //  0 4
    public static void binarySearch(int arr[], int first, int last, int key){


        int mid = (first + last)/2;


        while( first <= last ){

            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }

            mid = (first + last)/2;
        }


        if ( first > last ){
            System.out.println("Element is not found!");
        }


    }






    public static void findIndexOfElementGivenSortedArr(int [] arr , int firstIndex , int lastIndex , int key){



        int mid = (firstIndex + lastIndex) / 2 ;


        while (firstIndex <= lastIndex) {

            if (arr[mid] == key) {
                System.out.println("Element is found at index : " + mid);
                break;
            } else if (arr[mid] < key) {
                firstIndex = mid + 1;
            } else {
                lastIndex = mid - 1;
            }

            mid = (firstIndex + lastIndex)/2;



        }

        if (firstIndex > lastIndex){
            System.out.println("Element is not found");
        }




    }



    public static int[] sort(  int [] arr  ){

        int [] numbers  = arr;


        for (int i = 1 ; i < arr.length ; i++){

            for (int j = 0 ; j<i ; j++){

                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }


        return numbers;

    }









    // O(logn)
    public static void main(String args[]){

        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        Arrays.sort(arr);
        int key = 23;
        int last=arr.length-1;
        // arraydaki sonuncu elementin indexsi
       // binarySearch(arr,0,last,key);

        int array [] = {2, 3, 1, 4};
        Arrays.stream(sort(array)).forEach(n-> System.out.print(n+" "));
        //findIndexOfElementGivenSortedArr(arr , 0 , last , 60);

    }


}