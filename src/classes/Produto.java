package classes;

import java.util.ArrayList;


public class Produto {
    private float preco;
    private String nome; 
    private ArrayList<Ingrediente> ingredientes;

    public Produto(float preco, String nome, ArrayList<Ingrediente> ingredientes) {
        this.preco = preco;
        this.nome = nome;
        this.ingredientes = ingredientes;
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

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void incluirIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }        
   
    public void removerIngrediente(Ingrediente ingrediente) {
        this.ingredientes.remove(ingrediente);  
    }        
}
