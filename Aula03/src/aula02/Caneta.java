package aula02;

/**
 * @author Luca
 */
public class Caneta {
    public String modelo;
    public String cor;
    protected float ponta;
    private int carga;
    private boolean tampada;
    
    public void status() {
        System.out.printf("Uma caneta %s %s de ponta %s esta com carga de %s.\nEstá tampada? %s\n", this.modelo, this.cor, this.ponta, this.carga, this.tampada);
    }
    
    public void rabiscar() {
        if (this.tampada == false && this.carga > 0) {
            System.out.println("Rabiscou!");
            this.carga -= 1;
        } else {
            System.out.println("Impossível rabiscar.");
        }
    }
    
    public void tampar () {
        this.tampada = true;
    }
    
    public void destampar () {
        this.tampada = false;
    }
    
    protected void recarregar () {
        this.carga += 10;
    }
}
