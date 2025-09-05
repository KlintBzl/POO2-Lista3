
package exfuncionarios;

public class ExFuncionarios {

    public static void main(String[] args) {
        Departamento d1 = new Departamento(1, "TI");
        Departamento d2 = new Departamento(2, "Financeiro");

        // Criar funcionários
        Funcionario f1 = new Funcionario(101, "Ana", 5000, d1);
        Funcionario f2 = new Funcionario(102, "Carlos", 7000, d1);
        Funcionario f3 = new Funcionario(103, "Beatriz", 6000, d2);

        // Associar funcionários aos departamentos
        d1.adicionarFuncionario(f1);
        d1.adicionarFuncionario(f2);
        d2.adicionarFuncionario(f3);

        // Criar projetos
        Projetos p1 = new Projetos(201, "Projeto Alpha");
        Projetos p2 = new Projetos(202, "Projeto Beta");

        // Atribuir funcionários a projetos
        f1.adicionarProjetos(p1);
        f2.adicionarProjetos(p1);
        f2.adicionarProjetos(p2);
        f3.adicionarProjetos(p2);

        // Mostrar projetos de um funcionário
        System.out.println("Projetos de " + f2.getNome() + ":");
        for (Projetos p : f2.getProjetos()) {
            System.out.println("- " + p);
        }

        
        System.out.printf("Média salarial do departamento %s: R$ %.2f\n", d1.getNome(), d1.CalcularMedia());
        System.out.printf("Média salarial do departamento %s: R$ %.2f\n", d2.getNome(), d2.CalcularMedia());
    }
    
}
