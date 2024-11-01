import java.util.Scanner;

public class tentativa01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxAlunos = 10, maxCoordenadores = 2;

        String[] nomeAlunos = new String[maxAlunos];
        String[] matriculaAlunos = new String[maxAlunos];
        int[] codUsuarios = new int[maxAlunos];
        String nomeAQV;
        String matriculaAQV;
        String[] nomesCoor = new String[maxCoordenadores];
        String[] matriculaCoor = new String[maxCoordenadores];

        int codUsuarioAtual = 1, contadorAlunos = 0, contadorCoor = 0;
        boolean sair = false;

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
            }

        }

    }