package BANCO2;
import java.util.Scanner;
public class Cliente{
    public static void main(String[] args) {
        String nome = new String();
        String cpf = new String();
        double saldo = 0;
        Scanner scn = new Scanner(System.in);
        Pessoa meuCliente = new Pessoa(nome, cpf, saldo);


        System.out.println("---CADASTRO---");
        System.out.print("Digite seu nome: ");
        nome = scn.nextLine();
        meuCliente.setNome(nome);

        System.out.print("Digite seu CPF: ");
        cpf = scn.nextLine();
        meuCliente.setCpf(cpf);

        meuCliente.iniciar();
    }
}