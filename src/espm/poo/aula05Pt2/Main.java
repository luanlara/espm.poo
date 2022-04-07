package espm.poo.aula05Pt2;

import espm.poo.aula05Exercicio2.Cliente;

public class Main {
    
    public static void main(String[] args) {
        
        Cliente selmini = new Cliente();
        selmini.getConta().depositar(15);
        System.out.println(selmini.getConta().getSaldo());
        selmini.getConta().depositar(25);
        System.out.println(selmini.getConta().getSaldo());
        selmini.getConta().depositar(20);
        System.out.println(selmini.getConta().getSaldo());

    }
    

}
