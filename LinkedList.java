package linkedList;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

//TEST
//TEST 2

public class LinkedList<Object> implements Iterable<Object>{
    private Node<Object> head;
private static class Node<Object>
{
   private Object data;
   private Node<Object> next;

   public Node(Object data, Node<Object> next)
   {
      this.data = data;
      this.next = next;
   }
}
private class LinkedListIterator implements Iterator<Object>
{
   private Node<Object> nextNode;

   public LinkedListIterator()
   {
      nextNode = head;
   }
   public boolean hasNext() {  return nextNode != null;  }
   public void remove(){}
   public Object next()
{
   if(!hasNext()) throw new NoSuchElementException("No such element!");
   Object res = nextNode.data;
   nextNode = nextNode.next;
   return res;
}
   
}
public LinkedList()
{
    
}
public Iterator<Object> iterator()
{
   return new LinkedListIterator();
}
public void addFirst(Object item)
{
   head = new Node<Object>(item, head);
}

public void addLast(Object item)
{
   if(head == null) addFirst(item);
   else
   {
      Node<Object> tmp = head;
      while(tmp.next != null) tmp = tmp.next;

      tmp.next = new Node<Object>(item, null);
   }
}
/*Insert toInsert object after the node that contains "key" object*/
public void insertAfter(Object key, Object toInsert)
{
   Node<Object> tmp = head;
   while(tmp != null && !tmp.data.equals(key)) tmp = tmp.next;

   if(tmp != null)
      tmp.next = new Node<Object>(toInsert, tmp.next);
}
/*Insert toInsert object before the node that contains "key" object*/
public void insertBefore(Object key, Object toInsert)
{
   if(head == null) return;
   if(head.data.equals(key))
   {
      addFirst(toInsert);
      return;
   }

   Node<Object> prev = null;
   Node<Object> cur = head;

   while(cur != null && !cur.data.equals(key))
   {
      prev = cur;
      cur = cur.next;
   }
   //insert between cur and prev
   if(cur != null) prev.next = new Node<Object>(toInsert, cur);
}
/*This function removes a datum from the list. Input a datum you like to remove*/
public void remove(Object key)
{
   if(head == null) throw new RuntimeException("cannot delete");

   if( head.data.equals(key) )
   {
      head = head.next;
      return; 
   }

   Node<Object> cur  = head;
   Node<Object> prev = null;

   while(cur != null && !cur.data.equals(key) )
   {
      prev = cur;
      cur = cur.next;
   }

   if(cur == null) throw new RuntimeException("cannot delete");

   //delete cur node
   prev.next = cur.next;
}
/*Get head pointer from the list*/
public Node<Object> getHead()
{
    return head;
}
/*Get the data from the object you like*/
public Object getObj(Node<Object> input)
{
    return input.data;
}

/*Lets check whether we removed the data from the list*/
/*Input the object that you wanted to delete*/
public boolean isRemoved(Object key)
{
    if(head == null) throw new RuntimeException("everything is gone");
     System.out.println("");
      System.out.println("");
    System.out.println("Is " + key.toString()+ " still in the list??? ");
    System.out.println("");
      System.out.println("");
   if( head.data.equals(key) )
   {
      head = head.next;
       System.out.println("");
      System.out.println("");
       System.out.println("Answer is: No");
       System.out.println("");
      System.out.println("");
      return false;
   }

   Node<Object> cur  = head;
   Node<Object> prev = null;

   while(cur != null && !cur.data.equals(key) )
   {
      prev = cur;
      cur = cur.next;
   }

   if(cur == null)
   {
       System.out.println("");
      System.out.println("");
       System.out.println("Answer is: Yes");
       System.out.println("");
      System.out.println("");
       return true;
   }
   else
   {
       System.out.println("");
      System.out.println("");
       System.out.println("Answer is: No");
       System.out.println("");
      System.out.println("");
       return false;
   }
  }
 public static void main(String[] args) throws IOException {
    LinkedList<Integer> ls = new LinkedList<Integer>();
    ls.addFirst(1);
    ls.addLast(2);
    ls.remove(1);
    Node h = ls.getHead();
    boolean isRemoved = ls.isRemoved(2);
    System.out.println("isRemoved: " + isRemoved);
    if(ls.getObj(h) == null)
        System.out.println("NULL!!!");
    else
    {
        int ele = ls.getObj(h);
        System.out.println("ele: " + ele);
    }
 }
}
