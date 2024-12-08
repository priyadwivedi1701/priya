public class LL{

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }
    //to insert node at first place
    public void InsertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        size+=1;

        if(tail==null){
            tail=head;
        }
    }
    //to insert node at last node
    public void InsertLast(int value){
        Node node=new Node(value);
        if(tail==null)
        {
            InsertFirst(value);
        }
        tail.next=node;
        tail=node;
        size++;

    }
    //to delete node at first place
    public int DeleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    //to get node
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    //to delete node at last
    public int DeleteLast(){
        if(size<=1){
            return DeleteFirst();
        }
        Node secondlast=get(size-2);
        int val=tail.value;
        tail=secondlast;
        tail.next=null;
        return val;


    }
    //to delete element from anywhere
    public int delete( int index){
        if(index==0){
            return DeleteFirst();
        }
        if(index==size-1){
            return DeleteLast();
        }

        Node prev=get(size-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        return val;
    }
    //to find a number
    public Node Find_num(int num){
        Node node=head;
        while(node!=null){
            if(node.value==num){
                return node;
            }
            node=node.next;
        }
        return null;

    }
    //to display the whole linklist
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
     
    private class Node{
        private int value;
        private Node next;
    

    public Node(int value){
        this.value=value;
    }

    public Node (int value,Node next){
        this.value=value;
        this.next=next;
    }
}
}

public class main {
    public static void main(String[] args) {
        LL list=new LL();
        list.InsertFirst(8);
        list.InsertFirst(7);
        list.InsertFirst(6);
        list.InsertFirst(5);
        list.InsertFirst(4);
        list.InsertLast(99);
        list.display();
        System.out.println(list.DeleteFirst());
        System.out.println(list.Find_num(8));    }
    
}

