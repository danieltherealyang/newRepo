package newRepo.src.Sorting;

public class Node
{
    private Object opaqueObject;
    private Node prevNode;
    private Node nextNode;
    
    public Node(Object opaqueObject, Node node)
    {
        setObject(opaqueObject);
        setPrevNode(node);
        setNextNode(null);
    }
    
    public Node(Node node)
    {
        opaqueObject = node.opaqueObject;
        prevNode = node.prevNode;
        nextNode = node.nextNode;
    }
    
    public void setObject(Object opaqueObject)
    {
        this.opaqueObject = opaqueObject;
    }
    
    public void setPrevNode(Node node)
    {
        this.prevNode = node;
    }
    
    public void setNextNode(Node node)
    {
        this.nextNode = node;
    }
    
    public Object getObject()
    {
        return opaqueObject;
    }
    
    public Node getPrevious()
    {
        return prevNode;
    }
    
    public Node getNext()
    {
        return nextNode;
    }
}