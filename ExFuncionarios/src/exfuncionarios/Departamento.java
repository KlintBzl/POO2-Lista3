
package exfuncionarios;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    
    int id;
    String nome;
    List<Funcionario>funcionarios;

    public Departamento(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }
    
    public void adicionarFuncionario(Funcionario funcionario){
        if(!funcionarios.contains(funcionario)){
            funcionarios.add(funcionario);
        }
    }
    
    public double CalcularMedia(){
        if(funcionarios.isEmpty()) return 0;
        
        double soma = 0;
        for(Funcionario f : funcionarios){
            soma += f.getSalario();
        }
        return soma / funcionarios.size();
    }

    public String getNome() {
        return nome;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    @Override
    public String toString() {
        return nome + " (Funcionários: " + funcionarios.size() + ")";
    }
}
