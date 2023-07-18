/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12;

/**
 *
 * @author Luca
 */
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero cachorro = new Mamifero();
        cachorro.locomover(); // Polimorfismo de sobreposição
        
        Reptil cobra = new Reptil();
        cobra.locomover(); // Polimorfismo de sobreposição
        
        Ave passaro = new Ave();
        passaro.locomover(); // Polimorfismo de sobreposição
        
        Canguru canguru = new Canguru();
        canguru.locomover(); // Sobreposição da sobreposição
    }
    
}
