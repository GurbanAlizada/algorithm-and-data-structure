package hackerRank;

public class C {



    // 1  23 45 6                   6      5
    public static int pageCount(int n, int p) {
        int totalPageTurnCountFromFront = n / 2;
        int targetPageTurnCountFromFront = p / 2;
        int targetPageTurnCountFromBack = totalPageTurnCountFromFront - targetPageTurnCountFromFront;
        return Math.min(targetPageTurnCountFromFront, targetPageTurnCountFromBack);
    }


    public static void main(String[] args) {
        System.out.println(pageCount(6, 5));
        System.out.println("sddsd "+ (15>>3));
    }


}
