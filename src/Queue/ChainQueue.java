
package Queue;

public class ChainQueue {
    Object element;
    ChainQueue next;
    
    ChainQueue(){
        
    }
    ChainQueue(Object Element){
        this.element = element;
    }

    public ChainQueue(Object element, ChainQueue next) {
        this.element = element;
        this.next = next;
    }
}
