/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04;

/**
 *
 * @author Luca
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.Caneta("BIC Cristal", "Azul", (float) 0.5);
        c1.status();
        
        System.out.println("");
        
        Caneta c2 = new Caneta();
        c2.Caneta("NIC Carbon", "Amarela", (float) 1.0);
        c2.destampar();
        c2.status();
    }
    
}
