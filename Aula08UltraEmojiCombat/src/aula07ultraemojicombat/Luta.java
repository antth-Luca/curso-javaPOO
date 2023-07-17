package aula07ultraemojicombat;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria())
                && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar() {
        if (this.aprovada) {
            System.out.println("\n### DESAFIADO ###");
            this.desafiado.status();
            System.out.println("\n### DESAFIANTE ###");
            this.desafiante.status();
            
            Random random = new Random();
            int vencedor = random.nextInt(3); // 0 1 2
            
            switch (vencedor) {
                case 0: // Empate
                    System.out.println("\nResultado: Empate!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // Desafiado
                    System.out.println("\nResultado: Desafiado vence!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // Desafiante
                    System.out.println("\nResultado: Desafiante vence!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        }
    }
    
    //Métodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
