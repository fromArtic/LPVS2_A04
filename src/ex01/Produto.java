package ex01;

/**
 *
 * @author Jv Loreti
 */

public class Produto{
    private int codigo;
    private String nome;
    private double preco;
    
    public Produto(int c, String n, double p){
        this.codigo = c;
        this.nome = n;
        this.preco = p;
    }
    
    public double getPreco(){
        return preco;
    }
}
