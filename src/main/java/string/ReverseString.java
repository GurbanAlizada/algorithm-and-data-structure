package string;

public class ReverseString {
    public static void main(String[] args) {

        String name = "Roberto Carlos";
        String reverse_name = "";
        char c ;

        for (int i = name.length() -1 ; i >=0 ; i--){
            c = name.charAt(i);
            reverse_name += c;
        }

        System.out.println(reverse_name);


        String s  = "abc";
        System.out.println(s.replace("a", "b"));


    }
}
