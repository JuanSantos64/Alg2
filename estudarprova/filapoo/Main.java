/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudarprova.filapoo;

/**
 *
 * @author juans
 */
public class Main {
        public static void main(String[] args) {
        Fila fila = new Fila();

        fila.inserir(15);
        fila.inserir(20);
        fila.inserir(21);
        fila.inserir(5);
        fila.inserir(18);
        fila.inserir(16);
        
        while(! fila.isEmpty()) {
            int x = fila.retirar();
            System.out.println("Retirei o elemento " + x);
        }
        
        int y = fila.retirar();
    }
}
