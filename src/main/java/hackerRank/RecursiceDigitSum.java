package hackerRank;

public class RecursiceDigitSum {
    public static void main(String[] args) {

        //System.out.println(foo("123", 3));
        System.out.println(superDigit("3546630947312051453014172159647935984478824945973141333062252613718025688716704470547449723886626736", 3));

    }

    // 148
    public static int superDigit(String n , int k){

        int temp = foo(n);

        return foo(String.valueOf(temp*k));
    }

    public static int foo(String number){

        if (number.length()==1 ){
            return Integer.valueOf(number);
        }

        int sum=0;
        for (int i = 0; i<number.length();i++){
            sum+=Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        return foo(String.valueOf(sum));
    }









    public static int foo33(String n , int k){
        Integer number = Integer.parseInt(n);

        int remainderNumber;
        int sum = 0;

        while(number != 0){
            remainderNumber=number%10;
            number = number / 10;
            sum += remainderNumber;

        }

        return sum*k;
    }
}
