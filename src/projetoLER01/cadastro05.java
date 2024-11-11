package projetoLER01;
import java.util.Scanner;
public class cadastro05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxAlunos = 10;
        int maxCoordenadores = 2;

        String[] nomesAlunos = new String[maxAlunos];
        String[] matriculasAlunos = new String[maxAlunos];
        int[] codigosUsuarios = new int[maxAlunos];
        String nomeAQV = null;
        String matriculaAQV = null;
        String[] nomesCoordenadores = new String[maxCoordenadores];
        String[] matriculasCoordenadores = new String[maxCoordenadores];
        int codigoUsuarioAtual = 1;
        int contadorAlunos = 0;
        int contadorCoordenadores = 0;
        boolean sair = false;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastro");
            System.out.println("2. Listar Alunos");
            System.out.println("3. Buscar Aluno por Nome ou Matrícula");
            System.out.println("0. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    boolean sairCadastro = false;
                    do {
                        System.out.println("Escolha uma opção de cadastro:");
                        System.out.println("1. Cadastrar Aluno");
                        System.out.println("2. Cadastrar AQV");
                        System.out.println("3. Cadastrar Coordenador");
                        System.out.println("0. Voltar");
                        int opcaoCadastro = scanner.nextInt();
                        scanner.nextLine();
                        switch (opcaoCadastro) {
                            case 1:
                                if (contadorAlunos < maxAlunos) {
                                    System.out.print("Nome do Aluno: ");
                                    nomesAlunos[contadorAlunos] = scanner.nextLine();
                                    System.out.print("Matrícula do Aluno: ");
                                    matriculasAlunos[contadorAlunos] = scanner.nextLine();
                                    codigosUsuarios[contadorAlunos] = codigoUsuarioAtual++;
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
                                if (contadorCoordenadores < maxCoordenadores) {
                                    System.out.print("Nome do Coordenador: ");
                                    nomesCoordenadores[contadorCoordenadores] = scanner.nextLine();
                                    System.out.print("Matrícula do Coordenador: ");
                                    matriculasCoordenadores[contadorCoordenadores] = scanner.nextLine();
                                    contadorCoordenadores++;
                                } else {
                                    System.out.println("Limite de coordenadores cadastrados atingido.");
                                }
                                break;
                            case 0:
                                sairCadastro = true;
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                    } while (!sairCadastro);
                    break;
                case 2:
                    System.out.println("Lista de Alunos Cadastrados:");
                    for (int i = 0; i < contadorAlunos; i++) {
                        System.out.println("Aluno " + (i + 1) + ":");
                        System.out.println("Nome: " + nomesAlunos[i]);
                        System.out.println("Matrícula: " + matriculasAlunos[i]);
                        System.out.println("Código de Usuário: " + codigosUsuarios[i]);
                    }
                    break;
                case 3:
                    System.out.print("Digite o Nome ou Matrícula do Aluno para buscar: ");
                    String busca = scanner.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < contadorAlunos; i++) {
                        if (nomesAlunos[i].equalsIgnoreCase(busca) || matriculasAlunos[i].equals(busca)) {
                            System.out.println("Aluno encontrado:");
                            System.out.println("Nome: " + nomesAlunos[i]);
                            System.out.println("Matrícula: " + matriculasAlunos[i]);
                            System.out.println("Código de Usuário: " + codigosUsuarios[i]);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (!sair);
        scanner.close();
    }
}

