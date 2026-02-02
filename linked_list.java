import java.util.*;
class Node{
    int data;
    Node next;
    public Node(int info){
        this.data=info;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    public LinkedList(){
        this.head=null;
    }
    public void insert(int var){
        Node newNode = new Node(var);
        if(head==null){
            head=newNode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }

    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }

    
}
public class linked_list{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int choice;
        int i=0;
        do{
            i++;
            System.out.printf("Enter the value of node %d: ",i);
            int var = sc.nextInt();
            list.insert(var);
            System.out.print("If wanna continue type 1 or if not then 0 :");
            choice = sc.nextInt();
        }while(choice!=0);
        System.out.println("The created linked list is :");
        list.display();
    }
}