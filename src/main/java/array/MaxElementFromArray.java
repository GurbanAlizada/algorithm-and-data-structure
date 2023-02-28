package array;

public class MaxElementFromArray {
    public static void main(String[] args) {

        int [] arr = {2,12,3,34,1,4,7};
        int max = arr[0];

        for (int i = 1 ; i < arr.length ; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println(max);


    }
}
