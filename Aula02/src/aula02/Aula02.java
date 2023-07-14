package aula02;

/**
 * @author Luca
 */
public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = (float) 0.5;
        c1.tampada = true;
        c1.modelo = "BIC Cristal";
        c1.carga = 50;
        
        c1.status();
        
        c1.rabiscar();
        
        c1.destampar();
        c1.rabiscar();
    }
    
}
