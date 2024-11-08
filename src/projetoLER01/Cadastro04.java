package projetoLER01;

import java.util.Scanner;

public class Cadastro04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxAlunos = 10, maxCoordenadores = 2;

        String[] nomeAlunos = new String[maxAlunos];
        String[] matriculaAlunos = new String[maxAlunos];
        int[] codUsuarios = new int[maxAlunos];
        String nomeAQV = null;
        String matriculaAQV;
        String[] nomesCoor = new String[maxCoordenadores];
        String[] matriculaCoor = new String[maxCoordenadores];

        int codUsuarioAtual = 1, contadorAlunos = 0, contadorCoor = 0;
        boolean sair = false;

        boolean sairCadastro = false;
        do {
            System.out.println("Menu:");
            System.out.println("1. Cadastro");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Buscar Alunos");
            System.out.println("0. Sair");

            int opcaoCadastro = scanner.nextInt();
            scanner.nextLine();
            switch (opcaoCadastro) {

                case 1:
                    if (contadorAlunos < maxAlunos) {
                        System.out.print("Nome do Aluno:");
                        nomeAlunos[contadorAlunos] = scanner.nextLine();
                        System.out.println("Matricula do Aluno:");
                        matriculaAlunos[contadorAlunos] = scanner.nextLine();
                        codUsuarios[contadorAlunos] = codUsuarioAtual++;
                        contadorAlunos++;

                    } else {
                        System.out.println("Limite de alunos cadastrados atingido.");
                    }
                    break;
                case 2:
                    if (nomeAQV == null) {
                        System.out.print("Nome do AQV: ");
                        nomeAQV = scanner.nextLine();
                        System.out.print("Matrícula do AQV: ");
                        matriculaAQV = scanner.nextLine();
                    } else {
                        System.out.println("AQV já cadastrado.");
                    }
                    break;
                case 3:
                    if (contadorCoor < maxCoordenadores) {
                        System.out.print("Nome do Coordenador:");
                        String string = nomesCoor[contadorCoor] + scanner.nextLine();
                        contadorCoor++;
                    } else {
                        System.out.println("Limite de Cordenadores cadastrados atingidos.");
                    }
                    break;
                case 0:
                    sairCadastro = true;
                    break;
                default:
                    System.out.println("Opção inválida. \n Tente novamente");
                    break;
            }
        } while (sairCadastro);
        int buscar = scanner.nextInt();
        scanner.nextLine();
        boolean encontrado = false;
        switch (buscar) {

            case 2:
                System.out.println("Lista de Alunos Cadastrados: ");
                for (int i = 0; i < contadorAlunos; i++) {
                    System.out.println("Aluno " + (i + 1) + ":");
                    System.out.println("Nome: " + nomeAlunos[i]);
                    System.out.println("Matrícula:" + matriculaAlunos[i]);
                    System.out.println("Código de Usuário:" + codUsuarios[i]);
                    break;
                }
            case 3:
                System.out.print("Informe o nome ou numero de matricula do aluno para buscar: ");
                String busca = scanner.nextLine();
                encontrado = false;

                for (int i = 0; i < contadorAlunos; i++) ;
                int i = 0;
                if (nomeAlunos[i].equalsIgnoreCase(busca) || matriculaAlunos[i].equalsIgnoreCase(busca)) ;
                System.out.println("Aluno Encontrado:");
                System.out.println("Nome: " + nomeAlunos[i]);
                System.out.println("Matricula:" + matriculaAlunos[i]);
                System.out.println("Código de Usuário: " + codUsuarios[i]);
                encontrado = true;
                break;
        }
        if (!encontrado) {
            System.out.println("Aluno não encontrado.");
        }


    }

}

