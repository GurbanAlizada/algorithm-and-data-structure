package hackerRank;

import java.io.*;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

public class Result {

    public static void main(String[] args) {

        System.out.println(findDay(3, 27, 2023));

    }


    public static String findDay(int month, int day, int year) {

        String dayOfWeeks[] = { "SUNDAY" , "MONDAY" , "TUESDAY" , "WEDNESDAY" , "THURSDAY" , "FRIDAY" , "SATURDAY" };
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1 , day);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        String result = dayOfWeeks[dayOfWeek - 1];
        return  result;
        //return cal.getDisplayName(Calendar.DAY_OF_WEEK ,Calendar.LONG , Locale.US).toUpperCase();
    }

}

// class Solution2 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int month = Integer.parseInt(firstMultipleInput[0]);
//
//        int day = Integer.parseInt(firstMultipleInput[1]);
//
//        int year = Integer.parseInt(firstMultipleInput[2]);
//
//        String res = Result.findDay(month, day, year);
//
//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
