package array;

public class ThirdLargestInArray {

    public static void main(String[] args) {

        int [] arr = new int[]{3,1,3,5,7,84,3,7,7,9,7,3,2,6,8,0,2};

        for (int i = 0 ; i < arr.length ; i++){

            for (int j = i +1 ; j < arr.length ; j++){

                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }


        System.out.println("3rd Largest : " + arr[arr.length - 3]);



    }
}
