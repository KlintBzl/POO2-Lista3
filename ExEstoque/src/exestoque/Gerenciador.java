
package exestoque;

import java.util.ArrayList;

public class Gerenciador {
    private ArrayList<Produtos> produtos = new ArrayList<>();
    private ArrayList<Fornecedor> fornecedores = new ArrayList<>();

    public void adicionarFornecedor(Fornecedor fornecedor) {
        fornecedores.add(fornecedor);
    }

    public void adicionarProduto(Produtos produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {
        System.out.println("\n Estoque atual:");
        for (Produtos p : produtos) {
            System.out.println(" " + p);
        }
    }

    public void listarEstoqueBaixo() {
        System.out.println("\n Produtos com estoque baixo:");
        for (Produtos p : produtos) {
            if (p.getQuantidade() < p.getEstoqueMinimo()) {
                System.out.println(" " + p);
            }
        }
    }

    public void fazerPedido(int produtoId, int quantidade) {
        for (Produtos p : produtos) {
            if (p.getId() == produtoId) {
                Pedidos pedido = new Pedidos(p, quantidade);
                pedido.realizarPedido();
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }
}
