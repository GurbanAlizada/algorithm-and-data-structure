package hackerRank;

public class StairCase {
    public static void main(String[] args) {

        /*

    0 1 2 3
    1 1 2 3
    2 1 2 3
    3 1 2 3

    n=4
    -  -  -  03
    -  -  12 13
    -  21 22 23
    30 31 32 33

     */

        int [][] arr = new int[][]{
                {1,3,4,6},
                {5,6,9,1},
                {3,8,9,1},
                {2,8,0,7}
        };

        //hackerRankSolution(4);
        //System.out.println(dioqanalElementleriniCemle(arr));
        //System.out.println(tersDioqanalElementleriniCemle(arr));
        //System.out.println(foo2(arr));
        //System.out.println(foo3(arr));
        System.out.println(foo4(arr));
        System.out.println(foo5(arr));
       // System.out.println(foo6(arr));

    }


    public static void hackerRankSolution(int n){
        int arr[][] = new int[n][n];
        for (int i = 0; i< arr.length ; i++){
            for (int j = 0; j < arr.length ; j++){
                if (i+j>=n-1){
                    System.out.print("#");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }


    // massivin duz dioqalin indexleri eyni olur
    public static int dioqanalElementleriniCemle(int arr[][]){

        int sum = 0;

        for (int i = 0; i< arr.length ; i++){
            for (int j = 0; j < arr.length ; j++){

                if (i==j){
                  sum +=arr[i][j];
                }

            }
        }

        return sum;
    }



    // massivin ters diqolaranin indexler cemi massivin olcusenden 1 vahid kicik olur
    public static int tersDioqanalElementleriniCemle(int arr[][]){

        int sum = 0;

        for (int i = 0; i< arr.length ; i++){
            for (int j = 0; j < arr.length ; j++){

                if (i+j== arr.length-1){
                    sum +=arr[i][j];
                }

            }
        }

        return sum;
    }




    // duz dioqanaldan asagidaki elementleri topla
    public static int foo2(int arr[][]){

        int sum = 0;

        for (int i = 0; i< arr.length ; i++){
            for (int j = 0; j < arr.length ; j++){

                if (i>=j){
                    sum +=arr[i][j];
                }

            }
        }

        return sum;
    }



    // duz dioqanaldan yuxarisindaki elementleri topla
    public static int foo3(int arr[][]){

        int sum = 0;

        for (int i = 0; i< arr.length ; i++){
            for (int j = 0; j < arr.length ; j++){

                if (i<=j){
                    sum +=arr[i][j];
                }

            }
        }

        return sum;
    }











    // ters dioqanaldan yuxarisindaki elementleri topla
    public static int foo4(int arr[][]){

        int sum = 0;

        for (int i = 0; i< arr.length ; i++){
            for (int j = 0; j < arr.length ; j++){

                if (i+j<arr.length-1){
                    sum +=arr[i][j];
                }

            }
        }

        return sum;
    }



    // ters dioqanaldan yuxarisindaki elementleri topla dioqanal daxil
    public static int foo5(int arr[][]){

        int sum = 0;

        for (int i = 0; i< arr.length ; i++){
            for (int j = 0; j < arr.length ; j++){

                if (i+j<=arr.length-1){
                    sum +=arr[i][j];
                }

            }
        }

        return sum;
    }


    // ters dioqanaldan asagidaki
    public static int foo6(int arr[][]){

        int sum = 0;

        for (int i = 0; i< arr.length ; i++){
            for (int j = 0; j < arr.length ; j++){

                if (i+j>=arr.length-1){
                    sum +=arr[i][j];
                }

            }
        }

        return sum;
    }



}
