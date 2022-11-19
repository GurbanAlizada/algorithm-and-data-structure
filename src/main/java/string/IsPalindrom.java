package string;

public class IsPalindrom {

    public static void main(String[] args) {

        System.out.println(isPalindrom3("abcdcba"));
        System.out.println(isPalindrom3("abcdcbaa"));


    }

    public static boolean isPalindrom(String s) {

        int size = s.length();

        String str = "";


        for (int i = size - 1; i >= 0; i--) {
            str += s.charAt(i);
        }

        if (str.equals(s)) {
            return true;
        }

        return false;
    }


    public static boolean isPalindrom2(String s) {

        int count = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(count)) {
                count--;
            }

            if (count == 0) {
                return true;
            }

        }
        return false;
    }


    public static boolean isPalindrom3(String s) {

        int count = s.length()-1;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != s.charAt(count - i)) {
                return false;
            }

        }

        return true;

    }


    // s.length() = 7
    // 0123456
    // abcdcba
    public static boolean isPalindrome4(String s){
        return true;
    }



}
