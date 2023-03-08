public class GetValue_Linkedlist {

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
            public int getFirstNodeValue(){
                if(size==0){
                    return -1;
                }
                else {
                    return head.data;
                }
            }

            public int getLastNodeValue(){
                if(size==0){
                    return -1;
                }
                else{
                    return tail.data;
                }
            }

            public int getNodeValueAtIndex(int index){
                Node temp=head;
                if(index<0 || index>size-1 || size==0){
                    return  -1;
                }
                else{
                    int count=0;
                    while(count<index){
                        temp=temp.next;
                        count++;
                    }
                    return temp.data;
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
                System.out.println("First Node Value"+ ll.getFirstNodeValue());
                System.out.println("Last Node Value"+ ll.getLastNodeValue());
                System.out.println("Get Node value at index"+ll.getNodeValueAtIndex(8));

            }
        }

}
