
package Queue;

public class Queue{
    
    protected ChainQueue firstNode;
    protected int size;
    
    public Queue(int initialcapacity){
        
    }
    public Queue(){
        this(0);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }


    public Object peek() {
        ChainQueue currentNode = firstNode;
        if(!isEmpty()){
            return currentNode.element;
        }
        else{
            return "Kosong";
        }
        
    }

    public Object pop() {
        Object removedElement = null;
        if(!isEmpty()){
            removedElement = firstNode.element;
            firstNode = firstNode.next;
            size--;
        }
        else{
            System.out.println("Stack Kosong");
        }
        return removedElement;
    }

    public void push(Object theElement) {
        if(size == 0){
            firstNode = new ChainQueue(theElement, firstNode);
        }
        else{
            ChainQueue p = firstNode;
            for(int i = 0; i < size - 1; i++){
                p = p.next;
            }
            p.next = new ChainQueue(theElement, p.next);
        }
        size++;
    }
    
    @Override
    public String toString(){
        StringBuffer s = new StringBuffer("[");
        
        ChainQueue currentNode = firstNode;
        while(currentNode != null){
            if(currentNode.element == null){
                s.append("null, ");
            }
            else{
                s.append(currentNode.element.toString()+", ");
            }
            currentNode = currentNode.next;
        }
        if(size>0){
            s.delete(s.length() - 2, s.length());
        }
        s.append("]");
        
        return new String(s);
    }

}
