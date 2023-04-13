package model;

public class Solicitacao {
    
    private int numSolicitacao;
    private String cliente;
    private String data;
    private String endereco;
    private String telefone;
    private String especialidade;

    public int getNumSolicitacao() {
        return numSolicitacao;
    }

    public void setNumSolicitacao(int numSolicitacao) {
        this.numSolicitacao = numSolicitacao;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}