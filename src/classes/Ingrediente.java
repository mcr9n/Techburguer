package classes;

public class Ingrediente {
        //Esta classe cria o objeto Ingrediente, que tem como atribuitos:
	private String nome;
	private int quantidade;
        
        //Construtor:
	public Ingrediente(String nome, int quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	}

        //Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
