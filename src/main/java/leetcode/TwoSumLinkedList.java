package leetcode;

import org.w3c.dom.Node;

public class TwoSumLinkedList {

    public static void main(String[] args) {

        NodeList nodeList1 = new NodeList(6);



        NodeList nodeList2 = new NodeList(5);


        System.out.println(twoSum(nodeList1, nodeList2));


    }

    public static NodeList twoSum(NodeList l1 , NodeList l2){

        NodeList result = new NodeList(0);
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0){

            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;

            carry = sum/10;

            result.next = new NodeList(sum % 10);
            result = result.next;


            l1 = l1.next;
            l2 = l2.next;
        }



        return result;
    }

}

class NodeList{

    int val;
    NodeList next;

    public NodeList(int val, NodeList next) {
        this.val = val;
        this.next = next;
    }

    public NodeList(int val) {
        this.val = val;
    }

    public NodeList() {

    }

    @Override
    public String toString() {
        return "NodeList{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
