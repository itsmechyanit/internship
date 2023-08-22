class LinkedList{


  Node head;
  Node tail;
  //This function will insert the element at the tail of the linkedlist
  void insert(Node node){
    //if the linkedList is empty
    if(head == null){
      head = node;
      tail = node;
      return;
    }

    //adding the element as the last element
    Node current = head;
    while(current != tail){
      current = current.next;
    }
    current.next = node;
    //make the newly inserted element as the tail of the linked list
    tail = node;
  }
  //This will delete the last element of the linkedList
  Node delete(){
    //if the linkedList is empty
    if(tail == null){
      return tail;
    }
    Node prev = null;
    Node current = head;
    while(current != tail){
      prev = current;
      current = current.next;
    }
    //make the second last element as the tail of the linked List
    prev.next = null;
    return current;

  }
  //This will print the linked List 
  void print(){
    Node current = head;
    while(current != null){
      System.out.print(current.data + " ");
      current = current.next;
    }
  }

  //static class that defines the element of a linkedList
  static class Node{
    int data;
    Node next;

   
  }
}



public class Question5 {
  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    LinkedList.Node n1 = new LinkedList.Node();
    
    LinkedList.Node n2 = new LinkedList.Node();
    LinkedList.Node n3 = new LinkedList.Node();
    LinkedList.Node n4 = new LinkedList.Node();
    LinkedList.Node n5 = new LinkedList.Node();
    LinkedList.Node n6 = new LinkedList.Node();
    n1.data = 5;
    n1.next = n2;
    n2.data = 6;
    n2.next = n3;
    n3.data = 7;
    n3.next = n4;
    n4.data = 8;
    n4.next = n5;
    n5.data = 9;
    n5.next = n6;
    n6.data = 10;
    System.out.println("inserting the nodes");
    ll.insert(n1);
    ll.insert(n2);
    ll.insert(n3);
    ll.insert(n4);
    ll.insert(n5);
    ll.insert(n6);
    System.out.println("printing the linked list");
    ll.print();
    System.out.println();
    System.out.println("deleting the last element from the linked list");
    LinkedList.Node deleted = ll.delete();
    System.out.println("The deleted element is: " + deleted.data);
    System.out.println("printing the linked list again");
    ll.print();     

  }
  
  
}
