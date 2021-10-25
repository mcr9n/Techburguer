package classes;

import java.util.ArrayList;
import java.util.Calendar;

public class Cliente extends Pessoa {

	private ArrayList<Pedido> pedidos;
	private boolean jaFezPedidoAniversario;

	public Cliente(String cpf, String nome, String dataDeNascimento) {
		super(cpf, nome, dataDeNascimento);
		this.pedidos = new ArrayList<Pedido>();

	}

	public void pagar() {
		for (int i = 0; i < pedidos.size(); i++) {
			if (pedidos.get(i).isPago() != true) {
				pedidos.get(i).setPago(true);
			}

		}
	}

	public void zerarQuantidadeDePedidos() {
		pedidos.clear();

	}

	public boolean checarAniversario() {
		Calendar c = Calendar.getInstance();
		String[] data_nascimento = dataDeNascimento.split("/");
		
		boolean isAniversario = c.get(Calendar.DAY_OF_MONTH) == Integer.parseInt(data_nascimento[0])
				&& (c.get(Calendar.MONTH) + 1) == Integer.parseInt(data_nascimento[1]);
		
		return isAniversario;
	}

	public boolean isJaFezPedidoAniversario() {
		return jaFezPedidoAniversario;
	}
	
	public void setJaFezPedidoAniversario(boolean isPedidoDeAniversario) {
		this.jaFezPedidoAniversario = isPedidoDeAniversario;
	}

}
