package LinkedLists;

import java.util.LinkedList;

public class Main {

    // LinkedList =  Nodes are in 2 parts (data + address)
    //                        Nodes are in non-consecutive memory locations
    //                        Elements are linked using pointers

    //    advantages?
    //    1. Dynamic Data Structure (allocates needed memory while running)
    //    2. Insertion and Deletion of Nodes is easy. O(1)
    //    3. No/Low memory waste

    //    disadvantages?
    //    1. Greater memory usage (additional pointer)
    //    2. No random access of elements (no index [i])
    //    3. Accessing/searching elements is more time consuming. O(n)

    //    uses?
    //    1. implement Stacks/Queues
    //    2. GPS navigation
    //    3. music playlist
    //

    //the main advantage of LinkedLists over Arrays and ArrayLists is the insertion and deletion of nodes

    public static void main(String[] args) {

        // this is a doubly linked list. each node knows where the previous and the next nodes are
        // our LinkedList class stores the memory info for our first and last Nodes
        //there is also an inner class named Node, this class knows the memory address of each next and previous Node
        LinkedList<String> linkedList = new LinkedList<String>();

        //linkedlists can be treated as Stacks also
//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("F");
//        linkedList.pop();

        //it can be treated as a queue also with the keyword .offer
        //and to remove the head of the queue we use .poll
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        linkedList.add("E");
        linkedList.offer("test");
        linkedList.poll();


        //to search for an elements in LinkedLists :
        System.out.println(linkedList.indexOf("F"));

        //we can also peek in the head or the last element
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        //we can also add on first or last element
        linkedList.addFirst("0");
        linkedList.addLast("G");

        //to remove first and last
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        System.out.println(linkedList);
    }
}