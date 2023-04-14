package hackerRank;

public class DayOfTheProgram {

    public static String foo(int year){

        String result = "";


        if (year < 1918){
            if (year % 400 == 0  || (year%4 == 0 && year%100 != 0)){
                result = "12.09."+String.valueOf(year);
            }else{
                result = "13.09."+String.valueOf(year);
            }
        }else if(year > 1918){
            if (year % 4 != 0){
                result = "13.09."+String.valueOf(year);
            }else{
                result = "12.09."+String.valueOf(year);
            }

        }else{
            result = "26.09."+String.valueOf(year);
        }


        return result;

    }




    public static void main(String[] args) {
        System.out.println(foo(1800));
    }
}
