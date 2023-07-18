/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13;

/**
 *
 * @author Luca
 */
public class Cachorro {
    // Métodos de mesmo nome, mesma assinatura e estando em classes diferentes, é SOBREPOSIÇÃO
    // Métodos de mesmo nome, assinatura diferente e estando na mesma classe, é SOBRECARGA
    
    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("*Abana o rabo*\nAu! Au!\n\n");
        } else {
            System.out.println("*Pose defensiva*\nRrrrrrr!\n\n");
        }
    }
    
    public void reagir(String frase) {
        if (frase.equalsIgnoreCase("vai apanhar!")) {
            System.out.println("Rrr!\n*Sai correndo*\n\n");
        } else if (frase.equalsIgnoreCase("oii!")) {
            System.out.println("*Rabo abanando*\nAu! Au! Au!\n\n");
        }
    }
}
