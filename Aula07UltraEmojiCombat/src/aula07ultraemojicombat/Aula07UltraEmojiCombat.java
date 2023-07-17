/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07ultraemojicombat;

/**
 *
 * @author Luca
 */
public class Aula07UltraEmojiCombat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lutador L1 = new Lutador("Pretty boy", "França", 31, 11, 2, 1, 1.75f, 68.9f);
        L1.apresentar();
        
        System.out.println("");
        
        Lutador L2 = new Lutador("Putscript", "Brasil", 29, 14, 2, 3, 1.68f, 57.8f);
        L2.apresentar();
    }
    
}
