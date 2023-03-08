public class AddLast_Linkedlist {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

       public  void addLast(int value) {
            Node temp = new Node();
            temp.data = value;
            temp.next = null;
            if(size==0){
            head = tail = temp;
        }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addLast(5);
        ll.addLast(6);
        System.out.println(ll.size);
    }
}