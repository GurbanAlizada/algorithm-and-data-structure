package string;

import java.util.HashMap;
import java.util.Map;

public class FirstNotRepeatCharacter {

    public static void main(String[] args) {
        // plabcjdjackdkd
        // ilk tekrar etmeyen karakterin indexsi

        System.out.println(dontRepeatIndex("abcabcf"));
        System.out.println(tekrarlananIlkIndex("slamm"));
        System.out.println(tekrarlanmayanIlkIndex("azerbaycan"));

    }

    public static char dontRepeatIndex(String s){

        boolean flag = false;

        for (int i = 0 ; i < s.length() ; i++){

            for(int j = 0 ; j < s.length() ; j++){

                if (s.charAt(i) == s.charAt(j) &&   i != j  ){
                    flag = true ;
                    break;
                }
            }

            if(flag == false){
                return s.charAt(i);
            }
            flag = false;

        }

        return '0';
    }








    // salam
    public static String tekrarlananIlkIndex(String foo){

        for(int i = 1 ; i < foo.length() ; i++){
            for (int j = 0 ; j < foo.length() ; j++){

                if (foo.charAt(i) == foo.charAt(j) && i != j){
                    return " index = " + i ;
                }

            }
        }

        return "";
    }






    public static String tekrarlanmayanIlkIndex(String foo){

        // salams
        boolean tekrar = false;

        for(int i = 1 ; i < foo.length() ; i++){
            for (int j = 0 ; j < foo.length() ; j++){

                if (foo.charAt(i) == foo.charAt(j) && i != j){
                    tekrar = true;
                    break;
                }

            }

            if (tekrar == false){
                return ""+i;
            }

            tekrar = false;


        }


        return "";
    }




}
