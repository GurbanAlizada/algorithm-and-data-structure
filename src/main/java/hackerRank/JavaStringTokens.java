package hackerRank;

import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String s1 = s.trim();

        if (s1.length()==0){
            System.out.println(0);
            return;
        }
        String[] output = s1.split("[\\s + !,?._'@]+");
        System.out.println(output.length);
        for (int i = 0 ; i < output.length ; i++){
            System.out.println(output[i]);
        }


        // Write your code here.
        scan.close();
        
    }

}
