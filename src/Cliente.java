
import java.util.ArrayList;
import java.util.Calendar;

public class Cliente extends Pessoa{
    private ArrayList<pedido> pedidos;
    private boolean fazAniversario;
    private boolean jaFezPedidoAniversario;

    public Cliente(long cpf, String nome, String dataDeNascimento) {
        super(cpf, nome, dataDeNascimento);
        String[] data_nascimento = dataDeNascimento.split("/");
        Calendar c = Calendar.getInstance();
        for(int i = 0; i < data_nascimento.length; i++){
        if(c.get(Calendar.DAY_OF_MONTH)==Integer.parseInt(data_nascimento[0]) && c.get(Calendar.MONTH) == Integer.parseInt(data_nascimento[1])){
            fazAniversario = true;
            
        }else{
            fazAniversario = false;
        }
        if(checarAniversario()){
            
            jaFezPedidoAniversario = true;
        }else{
            jaFezPedidoAniversario = false;
            
        }
        }  
    }
    public void pagar(){
        for(int i = 0; i < pedidos.size();i++){
            if(pedidos.get(i).getPago() != true){
                pedidos.get(i).setPago(true);
            }
    
    }
    }
    public void zerarQuantidadeDePedidos(){
        pedidos.clear();
    
    
    }
    public boolean checarAniversario(){
        if(fazAniversario == true){
        for(int i = 0; i < pedidos.size();i++){
            if(pedidos.get(i).getDeAniversariante()){
                return true;
            }
        }
        return false;
    }
        return false;
    }
    
    
    
}
