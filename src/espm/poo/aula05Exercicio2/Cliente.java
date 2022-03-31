package src.espm.poo.aula05Exercicio2;

public class Cliente {
    
    private String nome;
    private String cpf;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "{Nome: " + nome + ", CPF: " + cpf + "}";
    }

}
