package controller;

public class Contato {
    private String nome;
    private String telefone;
    //private int idfk; Para fazermos quinta!

    //Construtor
    public Contato (String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {this.telefone = telefone;}

    public void cadastroSucesso() {
        System.out.print("Contato cadastrado com sucesso!");
    }
    public void cadastroErro() {
        System.out.print("Erro ao cadastrar contato!");
    }
}
