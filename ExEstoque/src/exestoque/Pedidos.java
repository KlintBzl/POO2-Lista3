
package exestoque;

public class Pedidos {
    private Produtos produto;
    private int quantidade;
    private Fornecedor fornecedor;

    public Pedidos(Produtos produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.fornecedor = produto.getFornecedor();
    }
    
    public void realizarPedido() {
        System.out.println("Fazendo pedido de " + quantidade + "x " + produto.getNome() + " ao fornecedor '" + fornecedor.getNome() + "'");
        produto.adicionarEstoque(quantidade);
    }
}
