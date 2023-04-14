package hackerRank;

public class A {

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        int i = 1;
        while(x1+(v1*i) <= x2+(v2*i)){

            if(x1+(v1*i) == x2+(v2*i)){
                return "YES";
            }

            i++;
        }
        return "NO";

    }



    public static void main(String[] args) {

        System.out.println(kangaroo(2, 2, 2, 2));

    }

}
