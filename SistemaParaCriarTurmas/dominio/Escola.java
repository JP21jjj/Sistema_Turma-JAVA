package SistemaGerenciamentoBanco.dominio;
import java.util.ArrayList;
import java.util.Scanner;

public class Escola {
    private ArrayList<Turma> turmas;
    private Scanner impressora = new Scanner(System.in);

    public Escola() {
        turmas = new ArrayList<>();
    }

    public void escolhas(){
        int alternativas;
        do {
            System.out.println("Menu Escolar: ");
            System.out.println("1- Criar Turma ** 2- Adicionar Aluno a turma ** 3- Listar Alunos de uma turma ** 4- Sair");
            alternativas = impressora.nextInt();
            impressora.nextLine(); // Limpa o buffer

            switch (alternativas) {
                case 1: criarLista(); break;
                case 2: adicionarAluno(); break;
                case 3: listarAlunos(); break;
                case 4: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida!"); break;
            }
        } while (alternativas != 4);
    }

    public void criarLista(){
        System.out.print("Qual o nome da turma? ");
        String nometurma = impressora.nextLine();

        if (nometurma == null || nometurma.isBlank()) {
            System.out.println("Nome da turma inválido.");
            return;
        } else {
            Turma novaTurma = new Turma(nometurma);
            turmas.add(novaTurma);
            System.out.println("Turma criada com sucesso!");
        }
    }

    public void adicionarAluno(){
        if (turmas.isEmpty()) {
            System.out.println("Não há turmas criadas.");
            return;
        }
        System.out.print("Nome do aluno: ");
        String nome = impressora.nextLine();

        Aluno novoAluno = new Aluno(nome);

        System.out.println("Escolha a turma:");
        for (int i = 1; i < turmas.size(); i++){
            System.out.println(i + " - " + turmas.get(i).getNomedaTurma());
        }

        int indice = impressora.nextInt();
        impressora.nextLine(); // Limpa o buffer

        if(indice >= 0 && indice < turmas.size()){
            turmas.get(indice).adicionarAluno(novoAluno);
            System.out.println("Aluno adicionado!");
        } else {
            System.out.println("Turma inválida.");
        }
    }

    public void listarAlunos(){
        if (turmas.isEmpty()){
            System.out.println("Não há turmas.");
            return;
        }
        System.out.println("Escolha a turma:");
        for(int i = 1; i < turmas.size(); i++){
            System.out.println(i + " - " + turmas.get(i).getNomedaTurma());
        }
        int indice = impressora.nextInt();
        impressora.nextLine(); // Limpa o buffer

        if (indice >= 0 && indice < turmas.size()){
            turmas.get(indice).listarAlunos();
        } else {
            System.out.println("Turma inválida.");
        }
    }
}