
package exestoque;

public class Fornecedor {
    private int id;
    private String nome;
    private String contato;

    public Fornecedor(int id, String nome, String contato) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getContato() {
        return contato;
    }
    @Override
    public String toString() {
        return nome + " (Contato: " + contato + ")";
    }
}
