package SistemaGerenciamentoBanco.dominio;

import java.util.ArrayList;

public class Turma {
    private String nomedaTurma;
    private ArrayList<Aluno> alunos;

    public Turma(String nomedaTurma) {
        this.nomedaTurma = nomedaTurma;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void listarAlunos(){
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno nesta turma.");
            return;
        }
        System.out.println("Alunos da turma " + nomedaTurma + ":");
        for (Aluno aluno : alunos){
            System.out.println(" - " + aluno.getNome());
        }
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setNomedaTurma(String nomedaTurma) {
        this.nomedaTurma = nomedaTurma;
    }
    public String getNomedaTurma() {
        return nomedaTurma;
    }
}