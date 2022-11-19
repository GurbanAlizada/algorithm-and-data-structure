package string;

import java.util.Scanner;


// 0-1000 intervalinda isleyir
public class InputNumberOutputWord {

    public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);

            int input = scan.nextInt();

            String output = "";

            String reqemler[] = {
                    "",
                    " Bir",
                    " Iki",
                    " Uc",
                    " Dort",
                    " Bes",
                    " Alti",
                    " Yeddi",
                    " Sekkiz",
                    " Doqquz"
            };

            String onluqlar[] = {
                    "",
                    " On",
                    " Iyirmi",
                    " Otuz",
                    " Qirx",
                    " Elli",
                    " Altmis",
                    " Yetmis",
                    " Seksen",
                    " Doxsan"
            };


            if (input > 99   &&  input < 1000) {

                int a = input % 10;
                output = reqemler[a];

                int b = input % 100;
                int d = b / 10;
                output = onluqlar[d] + output;

                int c = input / 100;

                if (c == 1) {
                    output = "Yuz" + output;
                } else {
                    output = reqemler[c] + " Yuz" + output;
                }



            } else if (  input > 9 && input < 100) {

                int a = input % 10;
                output = reqemler[a];

                int b = input / 10;
                output = onluqlar[b] + output;

            } else if (  input > 0 && input < 10) {
                int qaliq = input % 10;
                output = reqemler[qaliq];
            } else {
                System.out.println("Proqram yalniz 0-1000 intervalinda isdiyir");
            }

            System.out.println(output);





    }
}
