package oop;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1,"Hakan");
        User user2 = new User(1,"Hakan");

        System.out.println(user1==user2);
        System.out.println(user1.equals(user2));
        System.out.println(user1.toString()==user2.toString());
        System.out.println(user1.toString().equals(user2.toString()));


    }
}
