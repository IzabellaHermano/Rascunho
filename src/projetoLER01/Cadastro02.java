package projetoLER01;

import java.util.Scanner;

public class Cadastro02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao, matricula;
        String nome;

        opcao = 0;
        while ( opcao <= 2){
            System.out.println(" Menu: \n 1 - Cadastro \n 2- Consulta");
            opcao = scanner.nextInt();
            if (opcao == 1){
                System.out.print("Nome do Aluno:");
                nome = scanner.next();
                System.out.print("Número da Matricula:");
                matricula= scanner.nextInt();
                System.out.print(" Cadastro realizado com sucesso");
                
            } else if (opcao == 2) {
                nome = scanner.next();
                matricula = scanner.nextInt();

                System.out.println("Consulta: ");
                System.out.println("\n Nome:" + nome + "\n Número da matricula: " + matricula);

            } if( opcao > 2)
                    System.out.println("Opção Inválida");
                }
        }
        }


