package src.espm.poo.aula04;

public class Aluno {
    
    Integer ra = null;
    String nome = null;

    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public float media(float n1, float n2) {
        float soma = n1 + n2;
        return soma / 2;
    }

    @Override
    public String toString() {
        return "{ra: " + ra + "}" + " {nome: " + nome + "}";
    }
    
}
