package array;

public class MinElementFromArray {
    public static void main(String[] args) {

        int [] arr = {5,5,3,5,7,9,11,9,6,5,3,12,2,4,6,8};
        int min = arr[0];

        for (int i = 1 ; i < arr.length ; i++){
            if (min>arr[i]){
                min = arr[i];
            }
        }


        System.out.println(min);

    }
}
