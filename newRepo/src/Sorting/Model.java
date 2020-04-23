package newRepo.src.Sorting;

import java.util.*;

public class Model
{
    private Node headNode;         // 1st element in Queue
    private Node tailNode;         // Last element in Queue
    private Node currentNode;      
    
    public Model()
    {
        headNode = null;
        tailNode = null;
        currentNode = null;
    }
    
    public Object getFirstObject()
    {
    currentNode = headNode;
    
    if (headNode == null)
        return null;
    else
        return headNode.getObject();
    }
    
    public Object getLastObject()
    {
    currentNode = tailNode;
    
    if (tailNode == null)
        return null;
    else
        return tailNode.getObject();
    }
    
    public Object getObject()
    {
    if (currentNode == null)
        return null;
    else
        return currentNode.getObject();
    }
    
    public void setNext()
    {
    currentNode = currentNode.getNext();
    
    // never let currentNode be null, wrap to head
    if (currentNode == null)
        currentNode = headNode;
    }
    
    public void setPrevious()
    {
        currentNode = currentNode.getPrevious();
        
        // never let currentNode be null, wrap to head
        if (currentNode == null)
            currentNode = tailNode;
    }
    
    public void add(Object opaqueObject)
    {
      // add new object to end of Queue
      // set opaqueObject
      // build previous link of tail (as current)
      tailNode = new Node(opaqueObject, currentNode);
      
      // build next link of current (as tail)
      if (currentNode != null)
          currentNode.setNextNode(tailNode);
      
      // after links are established current eq tail
      currentNode = tailNode;
    
      // head eq tail on 1st element only
      if (headNode == null) {
          headNode = tailNode;
      }
    }
    
    public Object delete()
    {
        Object opaqueObject = null;
          
        if (headNode != null) {
          opaqueObject = headNode.getObject();
          headNode = headNode.getNext();
          if (headNode == null)
              tailNode = headNode;
          else
              headNode.setPrevNode(null);
        }
            
        return opaqueObject;
    }
    
    public String toString()
    {
        String queueToString = "[";
        
        Node node = headNode;             // start from the head
        while (node != null)
        {
            queueToString += "("+node.getObject()+")";  // append the data to output string
            node = node.getNext();              // go to next node
            if (node != null)
                queueToString += ", ";
        }                                       // loop 'till queue ends
        queueToString += "]";
        return queueToString;
    }
    
    public void selectionSort() {
        Node node1 = headNode;
        while (node1.getNext() != null) {
            currentNode = node1.getNext();
            int min = 1;
            int currentIndex = 2;
            Node minNode = node1;
            String minString = minNode.getObject().toString();
            while (currentNode != null) {
                if (currentNode.getObject().toString().compareTo(minString) < 0) {
                    minNode = currentNode;
                    min = currentIndex;
                    minString = minNode.getObject().toString();
                }
                currentNode = currentNode.getNext();
                currentIndex++;
            }
            //swap
            currentNode = node1;
            for (int i = 1; i < min; i++) {
                currentNode = currentNode.getNext();
            }
            Object temp = currentNode.getObject();
            currentNode.setObject(node1.getObject());
            node1.setObject(temp); 
            
            node1 = node1.getNext();
        }
    }
    
    public ArrayList<Integer> toList() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Node node = headNode;             
        while (node != null)
        {
            int i = (int) node.getObject();
            list.add(i);
            node = node.getNext();
        }
        
        return list;
    }
    
    public int getMax() {
        Node node = headNode;
        int max = (int) node.getObject();
        while (node != null) {
            int nextInt = (int) node.getNext().getObject();
            if (nextInt > max) {
                max = nextInt;
            }
            
            node = node.getNext();
        }
        
        return max;
    }
    
    public void clear() {
        headNode = null;
        tailNode = null;
        currentNode = null;
    }
}