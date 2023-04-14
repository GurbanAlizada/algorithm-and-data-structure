package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> list = foo(Arrays.asList(87, 98, 38, 3));
        for (Integer element : list){
            System.out.println(element);
        }

    }

    public static List<Integer> foo(List<Integer> grades){

        List<Integer> result = new ArrayList<>();

        for(int i = 0 ; i < grades.size() ; i++){

            int difference = grades.get(i) % 5;
            if (5-difference < 3 && grades.get(i)>=38){
                int temp = 5 - difference;
                result.add(grades.get(i) + temp);
            }else{
                result.add(grades.get(i));
            }

        }



        return result;

    }
}
