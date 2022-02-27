package DesafioBanco;

import java.util.List;

public class Banco {
    
    private String nome;
    private List<Conta> Contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getConta() {
        return Contas;
    }

    public void setConta(List<Conta> Conta) {
        this.Contas = Conta;
    }
}
