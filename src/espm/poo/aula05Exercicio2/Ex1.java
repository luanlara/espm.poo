package espm.poo.aula05Exercicio2;

public class Ex1 {

    public static void main(String[] args) {
        
        PessoaJuridica pj1 = new PessoaJuridica();

        Cliente pj2 = new PessoaJuridica();

        Banco bank = new Banco("Banco da ESPM");
        bank.addCliente(pj1);
        bank.addCliente(pj2);

        

    }
    
}
