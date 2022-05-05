package espm.poo.aula05Exercicio2;

public class Ex1 {

    public static void main(String[] args) {
        
        PessoaJuridica pj1 = new PessoaJuridica();
        pj1.setNome("Luan");
        pj1.setCnpj("123.321.232-0001-23");


        Cliente pj2 = new PessoaJuridica();

        Banco bank = new Banco("Banco da ESPM");
        bank.addCliente(pj1);
        bank.addCliente(pj2);

        Cliente Luan = pj1;

        Cliente leon = new PessoaFisica();

        

    }
    
}
