
package exestoque;

public class ExEstoque {

    public static void main(String[] args) {
        Gerenciador gerenciador = new Gerenciador();

        // Fornecedores
        Fornecedor f1 = new Fornecedor(1, "Quero tudo", "QueroTudo@gmail.com");
        Fornecedor f2 = new Fornecedor(2, "Quero Nota", "QueroNota123@gmail.com");

        gerenciador.adicionarFornecedor(f1);
        gerenciador.adicionarFornecedor(f2);

        // Produtos
        Produtos p1 = new Produtos(101, "Caneta", 10, 15, f1);
        Produtos p2 = new Produtos(102, "Caderno", 50, 20, f2);
        Produtos p3 = new Produtos(103, "Borracha", 5, 10, f1);

        gerenciador.adicionarProduto(p1);
        gerenciador.adicionarProduto(p2);
        gerenciador.adicionarProduto(p3);

        // Operações
        gerenciador.listarProdutos();
        gerenciador.listarEstoqueBaixo();

        gerenciador.fazerPedido(101, 20);

        gerenciador.listarProdutos();
    }
    
}
