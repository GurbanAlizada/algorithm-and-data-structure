package lambdaExpression;

public class Main {
    public static void main(String[] args) {

        Operationable  operationable = (x,y) -> x*y;
        System.out.println(operationable.hesabla(2, 3));



    }
}


interface Operationable{

   int hesabla(int x , int y);





}