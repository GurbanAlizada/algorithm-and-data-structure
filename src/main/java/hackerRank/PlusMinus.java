package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {

        List<Integer> list  =  new ArrayList<>();
        list.add(3);     // 3/6          2/6         1/6
        list.add(4);
        list.add(0);
        list.add(-1);
        list.add(-11);
        list.add(23);

        foo(list);


    }


    public static void foo(List<Integer> list){

        double positiveCount =0  , negativeCount = 0, zeroCount = 0;
        double positiveRate , negativeRate , zeroRate;


        for (int i = 0; i<list.size() ; i++){
            if (list.get(i)>0){
                positiveCount++;
            }else if (list.get(i)<0){
                negativeCount++;
            }
            else{
                zeroCount++;
            }
        }

        positiveRate = positiveCount / list.size();
        System.out.println(positiveRate);

        negativeRate = negativeCount/list.size();
        System.out.println(negativeRate);

        zeroRate = zeroCount/ list.size();
        System.out.println(zeroRate);


    }

}
