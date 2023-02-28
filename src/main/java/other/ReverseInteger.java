package other;

public class ReverseInteger {

    public static int reverse(int number){

        int  reversedNumber = 0 , remainder = 0 ;


        while(number != 0){
            remainder = number % 10;
            reversedNumber = reversedNumber*10 + remainder;
            number = number / 10;
        }

        if (number>Integer.MAX_VALUE || number< Integer.MIN_VALUE){
            return 0;
        }


        return reversedNumber;
    }


    public static void main(String[] args) {

        System.out.println(reverse(532356));

    }
}
