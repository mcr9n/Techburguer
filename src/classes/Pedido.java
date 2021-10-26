package classes;

import java.util.ArrayList;
import java.util.Random;

public class Pedido {
        //Esta classe cria um objeto Pedido
    
        //Possui esses atributos:
	private ArrayList<Produto> produtos; //Lista com objetos pedido
	private String formaDePagamento; //aqui identificamos a forma de pagamento realizada pelo usuario nesse pedido
	private float total; 
	private boolean deAniversariante;  //esse boolean é para verificar se ele é aniversariante
	private int senhaPedido;
	private boolean pago;
	private boolean pronto;
        
        //Construtor:
	public Pedido(ArrayList<Produto> produtos, String formaDePagamento, float total, boolean deAniversariante, boolean pago, boolean pronto) {
		Random rand = new Random();
		this.produtos = produtos;
		this.formaDePagamento = formaDePagamento;
		this.total = total;
		this.deAniversariante = deAniversariante;
		this.senhaPedido = rand.nextInt();
		this.pago = pago;
		this.pronto = pronto;
	}
        
        //getters e setters:
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public int getSenhaPedido() {
		return senhaPedido;
	}

	public float getTotal() {
		return total;
	}

	public boolean isDeAniversariante() {
		return deAniversariante;
	}
        
	public void setDeAniversariante(boolean deAniversariante) {
		this.deAniversariante = deAniversariante;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public boolean isPronto() {
		return pronto;
	}

	public void setPronto(boolean pronto) {
		this.pronto = pronto;
	}

	public void incluirProdutos(Produto produto) {
		this.produtos.add(produto);
	}

	public void excluirProdutos(Produto produto) {
		this.produtos.remove(produto);
	}
}
