/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04;

/**
 *
 * @author Luca
 */
public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    protected boolean tampada;
    
    public void Caneta(String modelo, String cor, float ponta) {
        this.setModelo(modelo);
        this.setCor(cor);
        this.setPonta(ponta);
        this.tampar();
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String m) {
        this.modelo = m;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String c) {
        this.cor = c;
    }
    
    public float getPonta() {
        return this.ponta;
    }
    
    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
    
    public void status() {
        String msg;
        if (this.tampada == true) {
            msg = "está tampada.";
        } else {
            msg = "não está tampada.";
        }
        System.out.printf("Uma caneta %s %s de ponta %s %s", this.getModelo(), this.getCor(), this.getPonta(), msg);
    }
}
