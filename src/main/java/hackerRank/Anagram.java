package hackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    // margana    and     anagram
    static boolean isAnagram(String a, String b) {
        char[] charArray1 = a.toLowerCase(Locale.ROOT).toCharArray();
        char[] charArray2 = b.toLowerCase(Locale.ROOT).toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

}
