package hackerRank;

import java.util.Date;

public class TimeConversion {
    public static void main(String[] args) {


        System.out.println(foo("07:40:03AM"));

    }



    // 07:05:45PM
    // 19:05:45
    public static String foo(String time){

        String clock = time.substring(0, 8);
        String format = time.substring(8,10);
        String[] split = clock.split( ":");


        if (format.equals("AM")){
            String hourInString = split[0];
            if (hourInString.equals("12")){
                hourInString ="00";
            }
            return hourInString+":"+split[1]+":"+split[2];
        }else if (format.equals("PM")){
            String hourInString = split[0];
            int hourInInteger = Integer.parseInt(hourInString);
            if (hourInInteger==12){
                hourInString="12";
            }else if (hourInInteger<12){
                hourInString = String.valueOf(hourInInteger+12);
            }
            return hourInString+":"+split[1]+":"+split[2];
        }
        return null;
    }

}
