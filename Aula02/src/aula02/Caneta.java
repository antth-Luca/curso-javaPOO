package aula02;

/**
 * @author Luca
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.printf("Uma caneta %s %s de ponta %s esta com carga de %s.\nEstá tampada? %s\n", this.modelo, this.cor, this.ponta, this.carga, this.tampada);
    }
    
    void rabiscar() {
        if (this.tampada == false && this.carga > 0) {
            System.out.println("Rabiscou!");
            this.carga -= 1;
        } else {
            System.out.println("Impossível rabiscar.");
        }
    }
    
    void tampar () {
        this.tampada = true;
    }
    
    void destampar () {
        this.tampada = false;
    }
}
