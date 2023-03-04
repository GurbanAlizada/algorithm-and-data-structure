package other;

public class Main3 {
    public static void main(String [] args) {

        int x= 0;
        int y= 0;

        /*
        z=0   x=1    y=0
        z=1   x=2    y=0
        z=2   x=3    y=1
        z=3   x=4    y=2
        z=5   x=5+1  y=3


         */
        for (int z = 0; z < 5; z++)
        {
            if (( ++x > 2 ) && (++y > 2))
            {
                x++;
            }
        }
        System.out.println(x + " " + y);
    }
}
