package aula09exercício;
public class Aula09Exercício {
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p = new Pessoa("Pedro", 22, "M");
        Livro l = new Livro("As longas tranças de um careca", "John Hairless", 302, p);
        
        System.out.println(l.detalhes());
    }
    
}
