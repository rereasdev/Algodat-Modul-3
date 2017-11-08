
package InfixtoPostfix;

public class InfixToPostfix {
    private Node top;
    
    public InfixToPostfix(){
        top=null;
    }
    public boolean isempty(){
        return top==null;
    }
    
    public Object pop(){
        Object element = top.data;
        top = top.next;
        return element;
    }
    
    public Object peek(){
        Object element = top.data;
        return element;
    }
    
    public void push(Object Element){
        Node dat = new Node(Element);
        dat.next = top;
        top = dat;
    }
    
    public int prio(Object isi){
        if(isi.equals('+') || isi.equals('-'))
            return 1;
        else if(isi.equals('*') || isi.equals('/'))
            return 2;
        else
            return 0;
    }
    
    public void postfix(String isi){
        String hasil = "";
        InfixToPostfix p = new InfixToPostfix();
        for(int i=0; i<isi.length(); i++){
            char c = isi.charAt(i);
            switch (c) {
                case '+':
                case '*':
                case '-':
                case '/':
                    while (!p.isempty() && prio(p.peek()) >= prio(c)){ 
                        hasil += p.pop();
                    }
                        p.push(c);
                       break;
                case '(':
                    p.push(c);
                    break;
                case ')':
                    while (!p.peek().equals('(')){ 
                        hasil+=p.pop();
                    }
                        p.pop();
                       break;
                default:
                    hasil+=c;
                    break;
            }
        }
        while(!p.isempty()){
            hasil+=p.pop();
        }
        System.out.println("Infix = "+ isi);
        System.out.println("Postfix = "+ hasil);
    }
}