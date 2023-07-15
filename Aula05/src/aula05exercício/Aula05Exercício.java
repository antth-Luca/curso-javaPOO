package aula05exercício;

public class Aula05Exercício {
    public static void main(String[] args) {
        ContaBanco conta = new ContaBanco();
        conta.ContaBanco();
        conta.abrirConta();
        
        conta.depositar(500);
        
        conta.pagarMensalidade();
        
        conta.sacar(200);
    }
}
