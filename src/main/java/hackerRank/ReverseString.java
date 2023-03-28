package hackerRank;

public class ReverseString {
    public static void main(String[] args) {


        String a = "madam";
        String reversed = "";

        for (int i=a.length()-1 ; i>=0 ; i--){
            char c = a.charAt(i);
            reversed += c;
        }

        if (reversed.equals(a)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }
}
