package ex01;

/**
 *
 * @author Jv Loreti
 */

public class CarrinhoDeCompras{
    private Produto produtos[];
    int MAX = 200; //Define o limite de produtos suportado pelo carrinho de compras
    
    //Incorpora o limite ao vetor
    public CarrinhoDeCompras(){
        this.produtos = new Produto[MAX];
    }
    
    //Adiciona produtos ao carrinho de compras
    public boolean adiciona(Produto p){
        for(int i = 0; i < MAX; i++){
            if(this.produtos[i] == null){
                this.produtos[i] = p;
                return true;
            }
        }
        return false;
    }
    
    //Retorna a soma de todos os preços dos produtos do carrinho
    public void soma(){
        double soma = 0;
        for(int i = 0; i < MAX; i++){
            if(this.produtos[i] != null){
                soma += this.produtos[i].getPreco();
            }
        }
        System.out.println("Somatória do valor acumulado pelos produtos no carrinho de compras: R$" + String.format("%.2f", soma));
    }
}
