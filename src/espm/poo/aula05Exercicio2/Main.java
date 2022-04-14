package espm.poo.aula05Exercicio2;

import java.util.Scanner;

public class Main {

    public static Banco banco = null;
    
    public static void main(String[] args) {

        banco = new Banco("ESPM Bank");
        
        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            try {
            
                System.out.print("ESPM> ");
                String input = scan.nextLine().trim().toLowerCase();

                if ("".equals(input)){

                } else if("exit".equals(input)) {
                    exit = true;
                } else if("help".equals(input)) {
                    help();
                } else if("list".equals(input)) {
                    listCustomers(banco);
                } else if("add".equals(input)){
                    addCustomer(banco);
                }else if("find".equals(input)) {
                    throw new UnsupportedOperationException();
                } else {
                    System.err.println("Comando inválido.");
                }
            } catch (UnsupportedOperationException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Bye bye");
    }

    private static void help(){
        System.out.println("ESPM Sistema de Clientes");
        System.out.println("------------------------");
        System.out.println("add -> Cadastra Cliente");
        System.out.println("list -> Lista Cliente");
        System.out.println("del -> Apaga Cliente");
        System.out.println("find -> Localiza Cliente");
        System.out.println();
        System.out.println("exit -> Sair do Sistema");

    }

    private static void listCustomers(Banco banco){
        banco.getClientes().forEach(c -> System.out.println(c));
    }

    private static void addCustomer(Banco banco) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = scan.nextLine();

        String tipoPessoa = inputTipoCliente();

        Cliente c = null;
        if("f".equals(tipoPessoa)) {

            System.out.print("CPF: ");
            String cpf = scan.nextLine();

            PessoaFisica pf = new PessoaFisica();
            pf.setCpf(cpf);
            c = pf;

        } else if ("j".equals(tipoPessoa)) {

            System.out.println("CNJP: ");
            String cnpj = scan.nextLine();

            PessoaJuridica pj = new PessoaJuridica();
            pj.setCnpj(cnpj);
            c = pj;

        }
        c.setNome(nome);
        

        banco.addCliente(c);
    }

    private static String inputTipoCliente() {
        Scanner scan = new Scanner(System.in);
        String tp = "";
        while(tp != "j" || tp != "f") {
            System.out.print("Tipo do Cliente? [F/J] ");
            String tipoPessoa = scan.nextLine().toLowerCase();
            if(tp != "j" || tp != "f") {
                System.err.println("F: Física | J: Jurídica");
            }
        }
        return tp;
    }

}
