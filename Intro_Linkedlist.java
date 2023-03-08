//Array is continuous memory location
//Linkedlist can use discontinuous memory loaction
//if we require 40 byte to store data ,but the space which is available is not in continuous, in that case we can't use
//but we can use linked list here

//Linked list can optimally use the space available as compare to array

//Every Node of linkedlist contain data and address of the next node

//Disadvantage of using linked list is that it occupies more space everyode occupies meemory to store data and address
//while in array every node occupies memory only to store data


//Data member of Linkedlist

import java.util.*;

public class Intro_Linkedlist{
    public static class Node{
        int data;
        Node next;
    }
    public static  class LinkedList{
        Node head;
        Node tail;
        int size;
    }

    public static void main(String[] args) {

    }
}