package espm.poo.aula02;

public class Main {
    
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.nome = "Luan";
        p1.idade = 19;
        p1.salario = 800;

        Pessoa p2 = new Pessoa();
        p2.nome = "Sandrinha";
        p2.idade = 45;
        p2.salario = 45000;

        Pessoa p3 = p1;
        System.out.println(p3.nome);
        p3.nome = "Selmini";
        System.out.println(p1.nome);

        p1.imprimir();
        p2.imprimir();
        p3.imprimir();

        String nome = "Luan";
        if (nome.equals("Luan")) {     //comparação entre
            System.out.println("Levantar da cama");
        }

    }

}
