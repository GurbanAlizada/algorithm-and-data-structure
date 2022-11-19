package array;

import java.util.Scanner;

public class ReplaceMatrisDioganalElements {

        /*
        Matrisin dioqanallarinin yerini deyis
         */


    private static  Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        System.out.print("m = ");
        int m = scanner.nextInt();
        System.out.print("n = ");
        int n = scanner.nextInt();

        int [][] arr = new int[m][n];

        inputArr(m,n,arr);


        int temp = 0 ;

        for(int j = 0; j < n; j++) {
            temp = arr[j][j];
            arr[j][j] = arr[j][n-1-j];
            arr[j][n-1-j] = temp;
        }



        printArr(arr , m ,n );

    }

    public static void printArr(int [][] arr ,int m ,int n ){
        for(int i = 0 ; i< m ; i++){
            for(int j = 0 ; j < n ; j++){

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

    }


    public static void inputArr(int m , int n , int [][] arr){

        for (int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print("arr["+ (i+1)+ "][" + (j+1)+"] = ");
                arr[i][j] = scanner.nextInt();
            }
        }

    }







}
