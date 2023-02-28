package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayListLogic {
    public static void main(String[] args) {

        /*
        Logic olaraq bir arraylist duzelt .
        Burada bir arraya yeni bir element elave etdikde onun olcusu artsin
         */


        Scanner scanner = new Scanner(System.in);

        int i = 1;
        int [] arr = new int[i];
        int [] value ;

        while(true){

            String input = scanner.nextLine();

            if(input.equals("q")){
                break;
            }

            arr[i-1] = Integer.parseInt(input);

            value = new int[i];

            for(int m = 0; m < arr.length ; m++){
                value[m] = arr[m];
            }

            arr = new int[++i];
            for(int n = 0 ; n < value.length ; n++){
                arr[n] = value[n];
            }



        }

        System.out.println(Arrays.toString(arr));
        for(int p = 0 ; p < arr.length-1 ; p++){
            System.out.println(arr[p]);
        }


    }
}
