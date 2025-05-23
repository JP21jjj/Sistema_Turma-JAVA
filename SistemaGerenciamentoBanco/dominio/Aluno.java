package SistemaGerenciamentoBanco.dominio;

public class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }



}
