
package exestoque;

public class Produtos {
    private int id;
    private String nome;
    private int quantidade;
    private int estoqueMinimo;
    private Fornecedor fornecedor;

    public Produtos(int id, String nome, int quantidade, int estoqueMinimo, Fornecedor fornecedor) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.estoqueMinimo = estoqueMinimo;
        this.fornecedor = fornecedor;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }
    @Override
    public String toString() {
        return nome + " - Estoque: " + quantidade + " (Mínimo: " + estoqueMinimo + ")";
    }
}