
package InfixtoPostfix;

public class Node{
    public Object data;
    public Node next;
    
    public Node(){
    data = ' ';
    next = null;
    }
    public Node(Object value){
        data = value;
        next = null;
    }
}
