/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase5;

/**
 *
 * @author LABORATORIO 04
 */
public class Clase5 {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 2;
        int result = 0;
        
        metodo1(2);
        result = metodo2(numero, numero);
        
        System.out.println(numero);
        System.out.println(result);
    }
    
    public static void metodo1(int parametro){
        parametro = parametro * 2;
        System.out.println(parametro);
    }
    
    public static int metodo2 (int n1,int n2){
        return n1 + n2 * 2;
    }
}
