
package exfuncionarios;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    int id;
    String nome;
    double salario;
    Departamento departamento;
    List<Projetos> projetos;

    public Funcionario(int id, String nome, double salario, Departamento departamento) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
        this.projetos = new ArrayList<>();
    }
    
    public void adicionarProjetos(Projetos projeto){
        if(!projetos.contains(projeto)){
            projetos.add(projeto);
            projeto.adicionarFuncionario(this);
        }
    }
    
    public List<Projetos> getProjetos() {
        return projetos;
    }
    public double getSalario() {
        return salario;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return nome + " (Salário: R$" + salario + ")";
    }
}
