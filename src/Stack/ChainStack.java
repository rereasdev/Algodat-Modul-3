
package Stack;

public class ChainStack {
    Object element;
    ChainStack next;
    
    ChainStack(){
        
    }
    ChainStack(Object Element){
        this.element = element;
    }

    public ChainStack(Object element, ChainStack next) {
        this.element = element;
        this.next = next;
    }
}
