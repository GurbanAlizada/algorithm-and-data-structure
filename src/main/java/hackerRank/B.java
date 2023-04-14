package hackerRank;

import java.util.*;

public class B {


    public static int migratoryBirds(List<Integer> arr) {


        /*
        1.Her elementden nece dene var deye tapmaliyam
        2.En cox tekrarlan elementleri tapmaliyam
        3.En cox tekrarlananlar arasinda en kiciyini tapmaliyam
         */

//        Map<Integer , Integer> map = new HashMap<>();
//        for(int i = 1 ; i <= 5; i++){
//            map.put(i, 0);
//        }
//
//
//        for(int i = 0; i< arr.size() ; i++){
//            if(map.containsKey(arr.get(i))){
//                int m = map.get(arr.get(i));
//                map.put(arr.get(i) , ++m);
//            }
//        }
//
//
//
//        int max = 0;
//        for (Map.Entry<Integer,Integer> m : map.entrySet()){
//
//            if (m.getValue() > max){
//                max = m.getValue();
//            }
//        }
//
//
//
//        List<Integer> list = new ArrayList<>();
//        for (Map.Entry<Integer,Integer> m : map.entrySet()){
//
//            if (m.getValue() == max){
//                list.add(m.getKey());
//            }
//        }
//
//
//        int min = list.get(0);
//        for (int i = 1 ; i < list.size() ; i++){
//            if (min > list.get(i)) {
//                min = list.get(i);
//            }
//        }
//
//
//
//
//        return min;


        int [] frequencies = new int[6];

        for (int i = 0 ; i < arr.size() ; i++){
            frequencies[arr.get(i)] +=1;
        }


        int max = 0 ;
        for (int i = 0 ; i < frequencies.length; i++){
            if (frequencies[i] > max){
                max = frequencies[i];
            }
        }

        for (int i = 0; i < frequencies.length ; i++){
            if (frequencies[i] == max){
                return i;
            }
        }

        return 0;

    }


    // 1 ve 100
    public static int counter(List<Integer> list , int a){

        int[] frequencies = new int[100];

        for (int i = 0; i < list.size() ; i++){
            frequencies[list.get(i)] +=1;
        }


        return frequencies[a];
    }

    public static int foo(int n , List<Integer> arr){

        int frequencies[] = new int[101];
        int count =  0;

        for (int i = 0 ; i< arr.size() ; i++){
            frequencies[arr.get(i)] +=1;
        }


        for (int i = 0 ; i < frequencies.length ; i++){
            if( frequencies[i] > 0){
                count += frequencies[i]/2;
            }
        }

        return count;
    }




    public static void main(String[] args) {


        System.out.println(foo(9,Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20)));
        //System.out.println(migratoryBirds(Arrays.asList(4 ,1,2,3,5,3,2,1)));
        //System.out.println(counter(Arrays.asList(2, 88, 2, 25, 17, 98, 54, 99, 56, 99, 12, 11, 54), 12));

    }
    
}
