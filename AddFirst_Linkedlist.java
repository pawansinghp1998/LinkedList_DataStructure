public class AddFirst_Linkedlist {
        public static class Node{
            int data;
            Node next;
        }
        public static class LinkedList{
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

            public  int size(){
                return  size;
            }
            public void display(){
                Node temp=head;
                while(temp!=null){
                    System.out.print(temp.data+" ");
                    temp=temp.next;
                }
            }
            public void addFirst(int value){
                    Node temp = new Node();
                    temp.data = value;
                    temp.next = head;
                    head = temp;
                    if(size==0){
                        tail=temp;
                    }
                    size++;
                }


            public static void main(String[] args) {
                LinkedList ll=new LinkedList();
                ll.addLast(1);
                ll.addLast(2);
                ll.addLast(3);
                ll.addLast(4);
                System.out.print("Size = "+ ll.size());
                System.out.println();
                ll.display();
                ll.addFirst(0);
                ll.addFirst(100);
                System.out.println();
                ll.display();
            }
        }
    }




