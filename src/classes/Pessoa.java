package classes;

public abstract class Pessoa {
        //Esta classe é uma classe abstrata que contem atributos referentes a uma 
    
        //Atributos:
	protected String cpf;
	protected String nome;
	protected String dataDeNascimento;
        
        //Construtor:
	public Pessoa(String cpf, String nome, String dataDeNascimento) {
		this.cpf = cpf;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
	}
        
        //Getters e Setters:
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

}
