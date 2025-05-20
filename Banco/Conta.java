package Banco;

import java.util.Scanner;

public class Conta {
    public String nome;
    public int numeroconta;
    public int idade;
    public double saldo;
    public int alternativas;
    public double valor;
    public int resposta;
    Scanner impressora = new Scanner(System.in);

  

     public boolean verificarIdade(){
        System.out.print("Digite sua idade para saber se pode entrar no banco:  ");
        this.idade = impressora.nextInt();
        return idade >= 18;
     }

    public void iniciar(){
        if (!verificarIdade()){
            System.out.println("Você não pode entrar no banco, pois é menor de idade");
            return;
        }
    
        solicitarDados();
        exibirMenu();
    }

    public void solicitarDados(){
        impressora.nextLine();
        System.out.println("Digite Seu nome: ");
        this.nome = impressora.nextLine();
        System.out.println("Ola " + this.nome + " Bem Vindo Ao Banco GREMIOSUL");

        System.out.println("Digite o numero da sua conta: 1- Poupança 2-Corrente ");
        this.numeroconta = impressora.nextInt();

        if(numeroconta == 1){
            this.saldo = 1000;
        }
        else if(numeroconta == 2){
            this.saldo = 500;
        }
        else{
            System.out.println("Número da conta inválido. Tente novamente.");
            solicitarDados();
        }



    }

    public void exibirMenu(){
     int alternativas;
        do {
            System.out.println("1- Sacar// 2-Depositar // 3- Verificar Saldo // 4- Trocar Conta // 5- Sair");
            System.out.print("Digite As alternativas: ");
            alternativas = impressora.nextInt();

            switch (alternativas) {
                case 1 -> realizarSaque();
                case 2 -> realizarDeposito();
                case 3 -> exibirSaldo();
                case 4 -> trocarConta();
                case 5 -> finalizar();
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (alternativas != 5);
        
        }
    public void realizarSaque(){
        System.out.println("Quanto você quer sacar? ");
        this.valor = impressora.nextInt();

        if (valor > saldo){
            System.out.println("Você tentou Sacar Mais Do Que Poderia, tente novamente verificar seu saldo: ");
            exibirMenu();
        }
        else{
            saldo -= valor;
            System.out.println("Seu novo Saldo é: " + saldo + " Você Sacou: " + valor);
        }
    } 

    public void realizarDeposito(){
        System.out.println("Quanto você quer depositar: ");
        this.valor = impressora.nextInt();

        if (valor <= 0){
            System.out.println("Valor Invalido");
            exibirMenu();
        }
        else{
            saldo += valor;
            System.out.println("Seu Saldo Atual é: " + saldo + " Você depositou: " + valor);
        }
    }


    public void trocarConta(){
        System.out.println("Digite o numero da conta que deseja acessar: 1- Poupança 2-Corrente ");
        this.numeroconta = impressora.nextInt();

        if(numeroconta == 1){
            this.saldo = 1000;
        }
        else if(numeroconta == 2){
            this.saldo = 500;
        }
        else{
            System.out.println("Número da conta inválido. Tente novamente.");
            solicitarDados();
        }


    }

    public void exibirSaldo(){
        System.out.println("Seu Saldo é: " + this.saldo);
    }
    public void finalizar(){
        System.out.println("Obrigado por usar o banco GREMIOSUL");
    }

}


        