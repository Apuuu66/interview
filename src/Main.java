import linkList.LinkedListCreator;
import linkList.LinkedListReverser;
import linkList.Node;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        LinkedListCreator linkedListCreator = new LinkedListCreator();
        Node.printLinkedList(linkedListCreator.createLinkList(new ArrayList<>()));
        Node.printLinkedList(linkedListCreator.createLinkList(Arrays.asList(1)));
        Node.printLinkedList(linkedListCreator.createLinkList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)));
        Node.printLinkedList(LinkedListReverser.reverseLinkedList(linkedListCreator.createLinkList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8))));
    }
}
