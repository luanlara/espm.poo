package src.espm.poo.aula05Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Cliente> clientes;
    private List<Conta> contas;
    private String nome;

    public Banco(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    public void addCliente(Cliente c) {
        this.clientes.add(c);
    }

    public String getNome(){
        return nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }



}
