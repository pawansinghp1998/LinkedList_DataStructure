public class RemoveFirstNode_LinkedList {
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
            public void removeFirst(){
                if(size==0){
                    System.out.print(("List is Emoty"));
                }
               else if(size==1){
                    head=tail=null;
                    size=0;
                }
               else {
                    head = head.next;
                    size--;
                }
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
                ll.removeFirst();
                System.out.println();
                ll.display();
            }
        }
    }


