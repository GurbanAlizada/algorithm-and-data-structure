package linkedList;

public class MyLinkedList<T>{

    private Node<T> head;
    private int size;

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    private static class Node<T>{
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    public void add(T data){
        Node<T> node = new Node<>(data);
        if (head == null){
            this.head = node;
        }else{
            Node<T> current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }

    public T get(int index){
        if (index<0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        if (index == 0){
            return head.data;
        }

        Node<T> current = head;

        for (int i= 0; i< index; i++){
            current = current.next;
        }
      return current.data;
    }



    public void remove(int index){
        if (index<0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        if (index == 0){
             head = head.next;
        }
        Node<T> current = head;

        for (int i = 0 ;  i < index-1 ; i++){
            current = current.next;
        }
        current.next = current.next.next;
        size--;
    }


    public static void main(String[] args) {

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(6);
        linkedList.add(1);
        linkedList.add(9);


        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(3));

        System.out.println(linkedList);

    }

}
