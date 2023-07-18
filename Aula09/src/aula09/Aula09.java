package aula09;
public class Aula09 {
    public static void main(String[] args) {
        // Programa principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");
        
        p2.setCurso("Informática");
        p3.setSalario(2030.85f);
        p4.setSetor("Estoque");
        
        
        // Não vão conseguir ser executados, pois, os métodos não pertencem a ele
        p1.receberAum();
        p2.mudarTrabalho();
        p4.cancelarMatr();
    }
}
