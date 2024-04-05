/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudarprova;

/**
 *
 * @author juans
 */

//Fatoral
//Fibonacci
public class Recursividade {
    public static void main(String[] args) {
        System.out.println(fatoral(3));
        System.out.println(fibonacci(5));
    }
    
    static int fatoral(int num){
        if(num == 0 || num ==1)
            return 1;
        return num + fatoral(num - 1);
    }
    
    static int fibonacci(int num){
        if(num == 0 || num == 1)
            return 1;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
