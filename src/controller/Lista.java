package controller;

public class Lista {
    private String nome;

    public Lista(String nome) {
        this.nome = nome;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastroSucesso() {
        System.out.print("Lista cadastrada com sucesso!");
    }
    public void cadastroErro() {
        System.out.print("Erro ao cadastrar lista!");
    }
}
