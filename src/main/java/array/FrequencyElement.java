package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyElement {
    public static void main(String[] args) {

        // Arrayde her elementden nece dene var
        // int [] arr = {1,2,4,2,4,6,8,9,5,3,2,4,6,8,0,4,2,2,1,9};
//        Map<Integer , Integer> map = new HashMap<>();
//
//        for (int i = 0 ; i<10 ; i++){
//            map.put(i , 0);
//        }
//
//        for (int i = 0 ; i < arr.length ; i++){
//            Integer integer = map.get(arr[i]);
//            map.put(arr[i], ++ integer );
//        }
//
//        System.out.println(map.toString());



        int [] arr = {1,2,4,2,4,6,8,9,5,3,2,4,6,8,0,4,2,2,1,9};

        Map<Integer , Integer> map = new HashMap<>();
        for (int i : arr){
            if (!map.containsKey(i)){
                map.put(i , 1);
            }else{
                map.put(i, map.get(i)+1 );
            }
        }

        System.out.println(map);








    }
}
