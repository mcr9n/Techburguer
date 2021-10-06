package classes;

import java.util.ArrayList;

public class Cozinheiro extends Funcionario {

    private ArrayList<Pedido> listaPedidos;

    public Cozinheiro(ArrayList<Pedido> listaPedidos, String senha, float salario, long cpf, String nome, String dataDeNascimento) {
        super(senha, salario, cpf, nome, dataDeNascimento);
        this.listaPedidos = listaPedidos;
    }

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

}
