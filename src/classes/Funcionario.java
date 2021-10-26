package classes;

public abstract class Funcionario extends Pessoa {
        //contem novos atributos que estendem pessoa mas o construtor não é utilizável já que se trata de uma classe abstrata

	protected String senha;
	protected float salario;
	private String ocupacao;

	public Funcionario(String senha, float salario, String cpf, String nome, String dataDeNascimento) {
		super(cpf, nome, dataDeNascimento);
		this.senha = senha;
		this.salario = salario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}

	public String getOcupacao() {
		return ocupacao;
	}
}
