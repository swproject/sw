import java.util.Iterator;
import java.util.NoSuchElementException;

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
   if(!hasNext()) throw new NoSuchElementException();
   Object res = nextNode.data;
   nextNode = nextNode.next;
   return res;
}
   
}
public Iterator<Object> iterator()
{
   return new LinkedListIterator();
}
public void addFirst(Object item)
{
   head = new Node<Object>(item, head);
}
public Node<Object> getHead()
{
    return head;
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
public void insertAfter(Object key, Object toInsert)
{
   Node<Object> tmp = head;
   while(tmp != null && !tmp.data.equals(key)) tmp = tmp.next;

   if(tmp != null)
      tmp.next = new Node<Object>(toInsert, tmp.next);
}
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

}
