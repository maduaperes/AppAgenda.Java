package controller;

public class Endereco {
    private String rua, numero, cidade, estado, cep;
    private int idfk;

    public Endereco(String rua, String numero, String cidade, String estado, String cep, int idfk) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.idfk = idfk;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public int getIdfk() {
        return idfk;
    }
    public void cadastroSucesso() {
        System.out.print("Endereço cadastrado com sucesso!");
    }
    public void cadastroErro() {
        System.out.print("Erro ao cadastrar endereço!");
    }
}
