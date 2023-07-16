/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06;

/**
 *
 * @author Luca
 */
public class ControleRemoto implements Controlador {
    //Atributo
    private boolean ligado;
    
    //Métodos especiais
    public ControleRemoto() {
        this.ligado = false;
    }
    
    private void getLigado() {
        if (this.ligado == true) {
        System.out.println("Estou ligado!");
        } else {
            System.out.println("_(-.-)_ zzz");
        }
    }
    
    private void setLigado(boolean status) {
        this.ligado = status;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        
    }

    @Override
    public void verificar() {
        this.getLigado();
    }
}
