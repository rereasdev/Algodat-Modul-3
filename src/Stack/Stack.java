
package Stack;

public class Stack{
    
    protected ChainStack firstNode;
    protected int size;
    
    public Stack(int initialcapacity){
        
    }
    public Stack(){
        this(0);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }


    public Object peek() {
        
        ChainStack currentNode = firstNode;
        if(!isEmpty()){
            for(int i = 0; i < size-1; i++){
                currentNode = currentNode.next;
            }
            return currentNode.element;
        }
        else{
            return "Kosong";
        }
        
    }

    public Object pop() {

        Object removedElement = null;
        if(!isEmpty()){
            
            if(size == 1){
                removedElement = firstNode.element;
                firstNode = firstNode.next;
            }
            else{
                ChainStack q = firstNode;
                for(int i = 0; i<size-2; i++){
                    q = q.next;
                }
                removedElement = q.next.element;
                q.next = q.next.next;
            }
            size--;
        }
        else{
            System.out.println("Stack Kosong");
        }
        return removedElement;
    }

    public void push(Object theElement) {

        if(size == 0){
            firstNode = new ChainStack(theElement, firstNode);
        }
        else{
            ChainStack p = firstNode;
            for(int i = 0; i < size - 1; i++){
                p = p.next;
            }
            p.next = new ChainStack(theElement, p.next);
        }
        size++;
    }
    
    @Override
    public String toString(){
        StringBuffer s = new StringBuffer("[");
        
        ChainStack currentNode = firstNode;
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
