package list;

public class MyArratList2 {

  private Object[] data;
  private int size ;

    public MyArratList2() {
        this.data = new Object[10];
        this.size = 0;
    }


    public void add(Object element) {
        if (size == data.length) {
            Object[] newData = new Object[data.length * 2];
//            for (int i =  0 ; i < data.length ; i++){
//                newData[i] = data[i];
//            }
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        data[size] = element;
        size++;
    }

    public int size() {
        return size;
    }



    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null; // son elemanı null yapar.
        size--;
    }

    public static void main(String[] args) {


    }

}
