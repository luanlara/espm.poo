package src.espm.poo.aula03;


import src.espm.poo.aula02.Pessoa;

public class Main {
    public static void main(String[] args) {
        int N = 1000000;
        long t = System.currentTimeMillis();
        Pessoa[] ps = new Pessoa[N];
        for (int i = 0; i < N; i++) {
        }
       
         long d = System.currentTimeMillis();
        System.out.println("d1: " + (d - t));

         System.gc();   //invoca o gabage collector
         d = System.currentTimeMillis();
         System.out.println("d1: " + (d - t));
    }

    public static boolean decriptar(String senha) {
         //verifica de a senha é válida
        return true;
    }
    
}
