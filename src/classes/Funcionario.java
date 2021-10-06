package classes;

public class Funcionario extends Pessoa {

    protected String senha;
    protected float salario;

    public Funcionario(String senha, float salario, long cpf, String nome, String dataDeNascimento) {
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

}
