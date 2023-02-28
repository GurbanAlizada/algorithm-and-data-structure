package array;

public class PrintDublicateElement {
    public static void main(String[] args) {

        // Verilmis array-de tekrarlanan elementleri cap et
        int [] arr = {1,2,3,5,2,5,6,8,9,8,7,3};


        for (int i = 0; i < arr.length ; i++){

            for (int j = i+1 ; j < arr.length ; j++){

                if (arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }


            }

        }


    }
}
