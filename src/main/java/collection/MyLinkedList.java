package collection;

import com.sun.prism.shader.Solid_TextureFirstPassLCD_AlphaTest_Loader;

import javax.jws.soap.SOAPMessageHandler;
import java.security.acl.LastOwnerException;

/**
 * Created by heishuai.china.cn
 * 2017/4/11 10:28
 * JAVASE
 */
public class MyLinkedList {


    private Node first;
    private Node last;

    public MyLinkedList() {
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("a");
        myLinkedList.add("b");
        myLinkedList.add("c");
        System.out.println(myLinkedList.first());
        System.out.println(myLinkedList.last());
        System.out.println(myLinkedList.get(1));
    }
/*
   ----------[0]---[?]---[?]---[?].............[n?]
 */

    public String get(int index) {
        // TODO: 4/11/17
        return null;
    }

    public boolean add(String element) {
        if (first == null) {
            Node node = new Node(element, null, null);
            first = node;
            last = node;
        } else {
            Node node = new Node(element, last, null);
            last.next = node;
            last = node;
        }
        return true;
    }

    public String first() {
        return first.element;
    }

    public String last() {
        return last.element;
    }

    private class Node { // node 节点\ [nəʊd]
        String element;
        Node prev; // prev previous 以前的\ ['priːvɪəs]
        Node next;

        public Node(String element, Node prev, Node next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }
}