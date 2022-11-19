package string;


public class CeasarCypherEncryption {
    public static void main(String[] args) {

        System.out.println(5/2);
        System.out.println(5%2);
        System.out.println((double) 5 / 2);



        System.out.println(cypher2("abcxyz", 28));

    }



    public static String cypher1(String text , int key){

        String code = "abcdefghijklmnopqrstuvwxyz";

        String output = "";

        for(int i = 0 ; i < text.length() ; i++){
            for(int j = 0 ; j < 26 ; j++){

                if(text.charAt(i) == code.charAt(j)){
                    output += code.charAt((j+key)%26);
                }

            }
        }


        return output;
    }






    public static String cypher2 (String text , int key){

        String code = "abcdefghijklmnopqrstuvwxyz";

        String encode = "";

        for (int i = 0 ; i < text.length() ; i++){

            int number = code.indexOf(text.charAt(i));
            int newNumber = (number + key )%26;
            char c = code.charAt(newNumber);
            encode += c;

        }

        return encode;
    }





}

