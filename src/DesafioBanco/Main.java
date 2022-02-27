package DesafioBanco;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double valor = 0;
        int operacao = 0;
        int meio = 0;
        int acao = 0;
                
        Cliente Marcinho = new Cliente();
        Marcinho.setNome("Marcinho");
        //Conta cc1 = new ContaCorrente();
        //Conta cp1 = new ContaPoupanca();
        iConta cc1 = new ContaCorrente(Marcinho);
        iConta cp1 = new ContaPoupanca(Marcinho);
                
        System.out.println("Verifique Sua Conta Antes de Operar:");
        cc1.imprimirExtrato();
        cp1.imprimirExtrato();
        
        System.out.println("Qual Operacao Deseja Realizar?");
        System.out.println("1 - Sacar | 2 - Depositar | 3 - Tranferir");
        operacao = ler.nextInt();
        
        System.out.println("Digite o Valor");
        valor = ler.nextDouble();
        
        if(operacao == 1){
            System.out.println("Qual Conta Deseja Realizar Operação?");
            System.out.println("1 - Conta Corrente | 2 - Conta Poupança");
            acao = ler.nextInt();
            if(acao == 1){
                cc1.sacar(valor); 
            }else if(acao == 2){
                cp1.sacar(valor); 
            }else{
                System.out.println("Operação Não Disponível no Momento!");
            }

        }else if(operacao == 2){
            System.out.println("Selecione o meio de Deposito");
            System.out.println("1 - Cheque | 2 - Boleto | 3 - Banco");
            meio = ler.nextInt();
            System.out.println("Meio Selecionado " + meio);
            System.out.println("Qual Conta Deseja Realizar Operação?");
            System.out.println("1 - Conta Corrente | 2 - Conta Poupança");
            acao = ler.nextInt();
            if(acao == 1){
                cc1.depositar(valor); 
            }else if(acao == 2){
                cp1.depositar(valor); 
            }else{
                System.out.println("Operação Não Disponível no Momento!");
            }
        }else if(operacao == 3){
            System.out.println("Meio Selecionado" + meio);
            System.out.println("1 - PIX | 2 - DOC | 3 - TED");
            meio = ler.nextInt();
            System.out.println("Meio Selecionado " + meio);
            System.out.println("Como Deseja Realizar a Operação?");
            System.out.println("1 - CC -> CP | 2 - CP -> CC");
            acao = ler.nextInt();
            if(acao == 1){
                cc1.transferir(valor, cp1);
            }else if(acao == 2){
                cp1.transferir(valor, cc1);
            }else{
                System.out.println("Operação Não Disponível no Momento!");
            }
        }else{
            System.out.println("Operação Não Disponível no Momento!");
        }

        cc1.imprimirExtrato();
        cp1.imprimirExtrato();
        
        System.out.println("Operação Realizada Com Sucesso!");
    }
    
}
