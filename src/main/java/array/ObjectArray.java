package array;

import java.util.Arrays;

public class ObjectArray {
    public static void main(String[] args) {

        /*
        Icersisinde hem string hem int hemde basqa primitive type-larin oldugu
        array duzeltmel mumkundurmu ?
        Cavab : Beli mumkundur ancaq Object classini istifade ederekden .
        */


        Object [] arr = new Object[5];
        arr[0] = "Qurban";
        arr[1] = true;
        arr[2] = 5;
        arr[3] = 5.6;
        arr[4] = 'A';

        System.out.println(Arrays.toString(arr));


    }
}
