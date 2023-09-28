package org.example.tarefaAbstract;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String dataNascimento) {
        super(nome, dataNascimento);
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
