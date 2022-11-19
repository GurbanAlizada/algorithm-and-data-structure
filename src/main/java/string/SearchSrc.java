package string;

public class SearchSrc {
    public static void main(String[] args) {

        System.out.println(search("aahdsacfgkerfdrabfnlk"));
        System.out.println(search("klsssssssssssssdlpsdkmdlfa"));


    }



    // s=  "aahdsacfgkerfdrabfnlk"
    public static String search(String s){

        String srcChecker = "hackerrank";

        int count =  0;


        for (int i = 0 ; i<s.length() ; i++){

            if(s.charAt(i) == srcChecker.charAt(count)){
                count++;
            }

            if(srcChecker.length()==count){
                return "YES";
            }

        }

        return "NO";
    }

}
