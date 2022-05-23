package BANCO2;
import java.util.Scanner;
public class Pessoa {
    private String nome;
    private String cpf;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    Scanner scn = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Pessoa(String nome,String cpf,double saldo){
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }
    public void extrato() {
        String cpf4;
        System.out.println("Digite seu CPF: ");
        cpf4 = this.scn.next();
        if (!cpf.equals(cpf4)) {
            System.out.println("Digite um CPF Válido!");
        } else {
            System.out.println("-----EXTRATO-----");
            System.out.println("Nome: " + this.nome);
            System.out.println("CPF: " + this.cpf);
            System.out.printf("Saldo atual: %.2f\n", this.saldo);
        }
    }
    public void sacar(Double valor) {
        if(valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso!");
        }else {
            System.out.println("Não foi possível realizar o saque!");
        }
    }
    public void depositar(Double valor) {
        if(valor > 0) {
            setSaldo(getSaldo() + valor);
            //this.saldo = this.getSaldo() + valor;
            System.out.println("Seu depósito foi realizado com sucesso!");
        }else {
            System.out.println("Não foi possível realizar depósito!");
        }
    }
    public void iniciar(){
        int opcao;

        do{
            exibeMenu();
            opcao = scn.nextInt();
            escolheOpcao(opcao);
        }while(opcao!=4);
    }
    public void exibeMenu(){

        System.out.println("---PAINEL---");
        System.out.println("1 - Extrato");
        System.out.println("2 - SAQUE");
        System.out.println("3 - DEPOSITO");
        System.out.println("4 - Sair\n");
        System.out.print("Opção: ");

    }
    public void autenticarsaque(){
        String cpf2;
        double valor;
        System.out.println("Digite seu cpf: ");
        cpf2 = this.scn.next();
        if(!cpf.equals(cpf2)){
            System.out.println("Digite um CPF Válido!");
        }else{
            System.out.println("Valor a sacar: ");
            valor = this.scn.nextDouble();
            sacar(valor);
        }

    }
    public void autenticardeposito(){
        String cpf3;
        double valor;
        System.out.println("Digite seu cpf: ");
        cpf3 = this.scn.next();
        if(!cpf.equals(cpf3)){
            System.out.println("Digite um CPF Válido!");
        }else {
            System.out.println("Valor a ser depositado: ");
            valor = this.scn.nextDouble();
            depositar(valor);
        }

    }

    public void escolheOpcao(int opcao){
        double valor;
        String cpf2;

        switch( opcao ){
            case 1:
                extrato();
                break;
            case 2:
                autenticarsaque();

                break;


            case 3:
                autenticardeposito();
                break;

            case 4:
                System.out.println("Sistema encerrado.");
                break;

            default:
                System.out.println("Opção inválida");
        }
    }
}