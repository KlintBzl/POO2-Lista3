
package exfuncionarios;

import java.util.ArrayList;
import java.util.List;

public class Projetos {

    int id;
    String nome;
    List<Funcionario> funcionario;
    
    public Projetos(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.funcionario = new ArrayList<>();
    }
    
    public void adicionarFuncionario(Funcionario f) {
        if (!funcionario.contains(f)) {
            funcionario.add(f);
            if (!f.getProjetos().contains(this)) {
                f.adicionarProjetos(this);
            }
        }
    }
    
    public List<Funcionario> getFuncionarios() {
        return funcionario;
    }

    @Override
    public String toString() {
        return nome + " (Equipe: " + funcionario.size() + ")";
    }
    
}
