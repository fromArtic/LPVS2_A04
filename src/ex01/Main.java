package ex01;

/**
 *
 * @author Jv Loreti
 */

public class Main{
    public static void main(String[] args){
        Produto p1 = new Produto(1, "TV de LED", 2000);
        Produto p2 = new Produto(2, "Geladeira", 1000);
        Produto p3 = new Produto(3, "Sofá 3 lugares", 700);
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(p1);
        carrinho.adiciona(p2);
        carrinho.adiciona(p3);
        carrinho.soma();
    }
}
