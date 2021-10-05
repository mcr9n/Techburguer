package classes;

import java.util.ArrayList;


public class Pedido {
    static int contadorDeSenhas;
    private ArrayList<Produto> produtos;
    private String formaDePagamento;
    private float total;
    private boolean deAniversariante;
    private int senhaPedido;
    private boolean pago;
    private boolean pronto;

    public Pedido(ArrayList<Produto> produtos, String formaDePagamento, float total, boolean deAniversariante, int senhaPedido, boolean pago, boolean pronto) {
        this.produtos = produtos;
        this.formaDePagamento = formaDePagamento;
        this.total = total;
        this.deAniversariante = deAniversariante;
        this.senhaPedido = senhaPedido;
        this.pago = pago;
        this.pronto = pronto;
    }
    
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    
    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
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
