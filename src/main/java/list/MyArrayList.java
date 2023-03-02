package list;


import java.util.ArrayList;

public class MyArrayList<T> {

    Object [] storage ;
    int size = 10;
    int index = 0;



    public MyArrayList() {
        storage = new Object[size];
    }


    public void add(T data){

        int arrLength = storage.length;

        if (arrLength == index){
            index = 0;
            Object [] temp = storage;
            size =size * 2;
            storage = new Object[size];
            for (int i = 0 ; i < temp.length ; i++){
                storage[i] = temp[i];
                index++;
            }
            storage[index++] = data;
        }else{
            storage[index] = data;
            index++;
        }

    }




    public T get(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        T result = (T) storage[index];
         return result;
    }


    public void remove(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        Object[] temp = new Object[size];
        int count = 0 ;

        for (int i=0 ; i < index ; i++){
            temp[i] = storage[i];
            count++;
        }

        for (int i = index + 1 ; i < temp.length ; i++){
            temp[count] = storage[i];
            count++;
        }

        storage = temp;
    }


    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(2);   // 0
        myArrayList.add(12);  // 1
        myArrayList.add(23);  // 2
        myArrayList.add(65);  // 3
        myArrayList.add(9);   // 4
        myArrayList.add(67);  // 5
        myArrayList.add(56);  // 6
        myArrayList.add(289);  //7
        myArrayList.add(243); // 8
        myArrayList.add(2242);// 9
        myArrayList.add(33); // 10
        myArrayList.add(6621);//11
        System.out.println(myArrayList.get(19));
        System.out.println(myArrayList.get(5));
        System.out.println(myArrayList.get(6));
        myArrayList.remove(6);
        System.out.println(myArrayList.get(6));


        System.out.println("************************************************");

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(3);
        System.out.println(arrayList.get(6));
        System.out.println(arrayList.size());


    }
}
