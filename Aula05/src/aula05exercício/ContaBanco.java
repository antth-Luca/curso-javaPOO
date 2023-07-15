package aula05exercício;

import java.util.Random;
import java.util.Scanner;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    private boolean recem;
    
    //Método construtor
    public void ContaBanco() {
        //Preparando
        Scanner tc = new Scanner(System.in);
        
        //Setando número aleatório como número de conta
        Random random = new Random();
        int numAleat = random.nextInt(90000) + 10000;
        this.numConta = numAleat;
        
        //Loop até receber uma resposta válida, CC para conta corrente ou CP para conta poupança
        String resp = "";
        while (!resp.equalsIgnoreCase("cc") && !resp.equalsIgnoreCase("cp")) {
            System.out.print("Qual o tipo da conta, corrente [CC] ou poupança [CP]?\nR: ");
            resp = tc.nextLine();
            
            if (resp.equalsIgnoreCase("cc") || resp.equalsIgnoreCase("cp")) {
                this.tipo = resp;
            } else {
                System.out.print("Desculpe, não reconheci sua resposta. Lembrando que você têm as opções CC ou CP.\nTente novamente: ");
            }
        }
        
        //Setando nome do titular da conta
        boolean contin = true;
        while (contin == true) {
            System.out.print("Qual o nome completo do titular da conta?\nR: ");
            String nome_comp = tc.nextLine();
            System.out.printf("'%s'\nConfirma o nome do titular?\n[S/N]R: ", nome_comp);
            resp = tc.nextLine(); 
            while (true) {
                if (resp.equalsIgnoreCase("s")) {
                this.dono = nome_comp;
                System.out.println("Registrado!");
                contin = false;
                break;
                } else if (resp.equalsIgnoreCase("n")) {
                    System.out.println("Vamos tentar novamente...");
                    break;
                } else {
                System.out.println("Não consegui reconhecer a sua resposta, me desculpe.\nTente novamente (S/N): ");
                resp = tc.nextLine();
                }
            }
        }
        
        //Setando saldo
        this.saldo = 0;
        
        //Setando status de conta fechada, mas criada
        this.status = false;
        
        //Setando atributo de recém criação para validação de entrega do bônus
        this.recem = true;
        
        //Dando informação de status e instrução de abertura
        System.out.println("Conta criada com successo, mas permanece fechada. Abra-a agora!");
    }
    
    //Métodos
    public void abrirConta() {
        this.status = true;
        System.out.println("Conta aberta! Tudo pronto para o uso.");
        
        if (this.recem == true) {
            if (this.tipo.equalsIgnoreCase("cc")) {
                this.saldo = 50;
                this.recem = false;
                System.out.println("Parabéns! Você acaba de receber um bônus de R$50,00.");
            } else if (this.tipo.equalsIgnoreCase("cp")) {
                this.saldo = 150;
                this.recem = false;
                System.out.println("Parabéns! Você acaba de receber um bônus de R$150,00.");
            }
        }
    }
    
    public void fecharConta() {
        Scanner tc = new Scanner(System.in);
        
        if (this.saldo == 0) {
            System.out.print("Você tem certeza que deseja fecjar a conta?\n[S/N] R: ");
            String resp = tc.nextLine();
            
            while (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n")) {
                if (resp.equalsIgnoreCase("s")) {
                this.status = false;
                System.out.println("Ótimo! Conta fechada.");
                } else if (resp.equalsIgnoreCase("n")) {
                    System.out.println("Tudo bem, conta não alterada!");
                } else {
                System.out.println("Não consegui reconhecer a sua resposta, me desculpe. Conta não alterada. Tente novamente.");
                }
            }
        } else {
            System.out.printf("Não posso fechar sua conta, ainda existem R$%.2f de saldo.\nFaça o saque deste valor e depois tente realizar esta ação.\n", this.saldo);
        }
    }
    
    public void depositar(float valor) {
        if (this.status == true) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Impossível realizar tal ação, pois, sua conta encontra-se fechada.");
        }
        this.getSaldo();
    }
    
    public void sacar(float valor) {
        if (this.status == true) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Saque realizado com sucesso!");
                System.out.print("\n      _____\n     /     \\\n    /  $ $  \\\n   |  $ $ $  |\n   |  $ $ $  |\n    \\  $ $  /\n     \\_____/\n");
            } else {
                System.out.println("Você não tem saldo suficiente para realizar o saque.");
            }
        } else {
            System.out.println("Impossível realizar tal ação, pois, sua conta encontra-se fechada.");
        }
    }
    
    public void pagarMensalidade() {
        float valor = 0;
        if (this.status == true) {
            if (this.tipo.equalsIgnoreCase("cc")) {
                valor = 12;
            } else if (this.tipo.equalsIgnoreCase("cp")) {
                valor = 20;
            }
            this.saldo -= valor;
            System.out.println("Pagamento realizado com sucesso!");
            this.getSaldo();
        } else {
            System.out.println("Impossível realizar tal ação, pois, sua conta encontra-se fechada.");
        }
        this.getSaldo();
    }
    
    //Métodos getters e setters
    public void getSaldo() {
        System.out.printf("Seu saldo atual é de R$%.2f\n", this.saldo);
    }
}
