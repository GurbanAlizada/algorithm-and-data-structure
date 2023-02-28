package other;

public class IsPalindrome {

    public static boolean isPalindrome(int number){

        int reversedNumber = 0;
        int remainder = 0;
        int orginalNumber =number;


        // 121
        while (number != 0){

            remainder = number % 10;
            number = number / 10;
            reversedNumber = (reversedNumber*10) + remainder;

        }

        if (reversedNumber == orginalNumber){
            return true;
        }else{
            return false;
        }
    }



    public static void main(String[] args) {

        System.out.println(isPalindrome(121));


    }
}
