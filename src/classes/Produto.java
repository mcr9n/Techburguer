package classes;

import java.util.ArrayList;

public class Produto {
        //classe que instancia um produto que irá compor o pedido. Contém três atributos descritivos.

	private float preco;
	private String nome;
	private int quantidade;

	public Produto(float preco, String nome) {
		this.preco = preco;
		this.nome = nome;
	}

	public Produto(float preco, String nome, int quantidade) {
		this.preco = preco;
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
