package estudarprova;

/**
 *
 * @author juans
 */
public class FilaCircular {
    static int[] fila = new int[10];
    static int topo = 0;
    static int comeco = 0;
    public static void main(String[] args) {
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        enqueue(5);
        enqueue(6);
        enqueue(7);
        enqueue(8);
        enqueue(9);
        enqueue(10);
        enqueue(11);
        enqueue(12);
        enqueue(13);
        enqueue(14);
        enqueue(15);
        removeAll();
    }
    static void enqueue(int a){

        System.out.println("Add: " + a);
        fila[(comeco + topo) % fila.length] = a;
        System.out.println("Lugar na fila");
        System.out.println((comeco + topo) % fila.length);
        topo++;
        
            
    }
    static void dequeue(){
        if(isEmpty()){
            System.out.println("Vazia");
            return;
        }
        System.out.println("Dequeue");
        System.out.println(fila[comeco]);
        comeco++;
    }
    static boolean isEmpty(){
        return topo == 0;
    }
    static void removeAll(){
        if(topo < 10){
        while(comeco < topo){
            
            dequeue();
        } 
        }else{
            while(comeco < 10){
                dequeue();
            }
        }
    }
}

