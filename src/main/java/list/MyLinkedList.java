package list;

public class MyLinkedList<T>{

    private Node<T> head;
    private int size;


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


    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", size=" + size +
                '}';
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
        }else{
            Node current = head;
            for (int i = 0 ;  i < index-1 ; i++){
                current = current.next;
            }
            current.next = current.next.next;
        }

        size--;
    }


    public static void main(String[] args) {

        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("Messi");
        linkedList.add("Neymar");
        linkedList.add("Suarez");
        linkedList.add("Arda");
        linkedList.add("Inesta");

        linkedList.remove(0);
        linkedList.remove(2);


        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(2));

        System.out.println(linkedList);



        MyLinkedList myLinkedList2 = new MyLinkedList();
        myLinkedList2.add("Salam");
        myLinkedList2.add(2.4);
        myLinkedList2.add(2023);

        System.out.println(myLinkedList2.get(0));
        System.out.println(myLinkedList2.get(1));
        System.out.println(myLinkedList2.get(2));

    }



}
