
package exestoque;

public class Produtos {
private int codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Produtos(int codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarQuantidade(int qtd) {
        this.quantidade += qtd;
    }
    
}