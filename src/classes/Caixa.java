
package classes;

import java.util.ArrayList;

/**
 *
 * @author Marcelo Piano
 */
public class Caixa extends Funcionario{
    private ArrayList<Pedido> ListaPedidos;
    public Caixa(ArrayList<Pedido> listaPedidos, String senha, float salario, long cpf, String nome, String dataDeNascimento) {
        super(senha, salario, cpf, nome, dataDeNascimento);
        this.ListaPedidos = listaPedidos;
    }
    
}
