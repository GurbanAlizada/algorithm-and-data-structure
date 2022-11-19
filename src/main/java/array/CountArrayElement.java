package array;

public class CountArrayElement {

    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
        countArrayElement(arr);
    }



    public static void countArrayElement(int arr[]){

        int visited = -1;

        int [] arr2 = new int[arr.length];

        for (int i = 0 ; i < arr.length ; i++){

            int count = 1;

            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i]==arr[j]){
                    arr2[j]=visited;
                    count++;
                }
            }

            if(arr2[i] != visited){
                arr2[i] = count;
            }

        }

        for(int i = 0 ; i< arr2.length ; i++){
            if(arr2[i] != visited){
                System.out.println(arr[i] + "    ¦     " + arr2[i]);
            }
        }



    }
}
