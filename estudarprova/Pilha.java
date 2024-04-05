package estudarprova;

/**
 *
 * @author juans
 */
public class Pilha {
        static int topo = -1;
        static int[] pilha = new int[10];
    public static void main(String[] args) {
        push(3);
        push(4);
//        pop();
//        pop();
        removeAll();
        System.out.println(topo);
    }
    
    static public void pop(){
        System.out.println("Removing the top element of stack");
        if(isEmpty())
            return;
            System.out.println("No, its not empty");
        System.out.println(pilha[topo]);
        topo--;
    }
    static public void push(int a){
        System.out.println("Add number to stack");
        System.out.println("Seeing if stack is full");
        if(topo == pilha.length - 1)
            return;
        System.out.println("No, it's not");
        pilha[++topo] = a;
    }
    static boolean isEmpty(){
        System.out.println("Seeing if it's empty");
        return topo <= -1;
    }
    static void removeAll(){
        System.out.println("Removing all");
        while(topo != -1){
            pop();
        }
    }
}
