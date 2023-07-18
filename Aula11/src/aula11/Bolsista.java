package aula11;
public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa() {
        System.out.println("Bolsa renovada!");
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println("Para bolsistas o pagamento é facilitado!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
