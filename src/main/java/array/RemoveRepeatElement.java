package array;

import java.util.*;

public class RemoveRepeatElement {
    public static void main(String[] args) {

        int [] arr = new int[]{2,6,7,9,2,5,7,0,3};
        int[] result = remove(arr);
        Arrays.stream(result).forEach(n-> System.out.print(n+" "));

    }

    public static int[] remove(int[] arr){
        Map<Integer , Integer> map = new HashMap<>();
        int count = 0;
        int index =  0;

        for(int i = 0 ; i< arr.length ; i++){

            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1 );
            }else{
                count++;
                map.put(arr[i],1 );
            }

        }

        int [] result = new int[count];

        for (Map.Entry<Integer , Integer>  m : map.entrySet()){
            result[index] = m.getKey();
            index++;
        }
        return result;
    }







    public static int[] remove2(int[] arr){
        Set<Integer> set = new HashSet<>();
        int index = 0;

        for (int i=0; i< arr.length ; i++){
            set.add(arr[i]);
        }

        int result[] = new int[set.size()];

        for (Integer i : set){
            result[index] = i;
            index++;
        }

        return result;
    }



}
