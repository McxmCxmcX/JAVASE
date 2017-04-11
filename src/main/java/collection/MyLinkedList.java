package collection;

/**
 * Created by heishuai.china.cn
 * 2017/4/11 10:28
 * JAVASE
 */
public class MyLinkedList {


    public MyLinkedList() {

    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("a");
    }


    private boolean add(String element) {
        // TODO: 4/11/17

        return  true;
    }

    private class Node{// node 节点\
        String element;
        Node prev; // prev previous 以前的\
        Node next;


        public Node(String element, Node prev, Node next){
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }
}
