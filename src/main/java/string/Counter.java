package string;

public class Counter {
    public static void main(String[] args) {

        counter("Messi a.b bought car for 10.2 millions dollar in 2020");


    }

    public static  void counter(String sentence){


        int integerCount = 0, doubleCount = 0 , stringCount = 0 ;
        String[] words = sentence.split(" ");


        for (int i = 0 ; i  < words.length ; i++){

            if (words[i].matches("[0-9]+")){
                integerCount++;
            }else if (words[i].matches("[0-9]+.")){
                doubleCount++;
            }else {
                stringCount++;
            }

        }


        System.out.println("integer "+ integerCount);
        System.out.println("double " + doubleCount);
        System.out.println("string " + stringCount);



    }



}
