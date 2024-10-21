package projetoLER01;

import java.util.Scanner;
public class Cadastro01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroMatricula, opicao, cadastro;
        String nome;

        System.out.println("Menu:");
        System.out.println("\t 1 - Cadastro");
        System.out.println("\t 2 - Consulta");



        cadastro = scanner.nextInt();
        switch (cadastro) {
            case 1:
            System.out.println("Nome do Aluno:");
                nome = scanner.next();
            System.out.println("Número da Matrícula");
                numeroMatricula= scanner.nextInt();
                break;
            case 2:
                System.out.println("Número da Matrícula " );
                numeroMatricula = scanner.nextInt();




        }
    }
}
