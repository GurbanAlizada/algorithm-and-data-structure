package string;

public class EncodeString {
    public static void main(String[] args) {

        String code = "AAAAAAAAAAAAABBBBCCCDD";  // 9A4A4B3C2D
        System.out.println(encoding(code));

    }

    public static String encoding(String s){

        int count = 0 ;
        String returnString = "";

        for (int i = 0 ; i < s.length() ; i++){

            for(int j = i+1 ; j < s.length() ; j++){

                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }
                else{
                    break;
                }
            }

            returnString += count + (char)s.charAt(i);
            count=0;
        }

        return returnString;
    }

}
