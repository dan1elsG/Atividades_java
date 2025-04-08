public class Main {
    public static void main(String[] args) {
        // Criando funcionários de diferentes tipos
        FuncionarioTempoIntegral funcionario1 = new FuncionarioTempoIntegral("João Silva", "123.456.789-00", 5000.0, 1000.0);
        FuncionarioMeioPeriodo funcionario2 = new FuncionarioMeioPeriodo("Maria Santos", "987.654.321-00", 5000.0, 20);
        FuncionarioContratado funcionario3 = new FuncionarioContratado("Pedro Souza", "456.789.123-00", 4000.0, 6, 500.0);

        // Array de funcionários para demonstrar polimorfismo
        Funcionario[] funcionarios = {funcionario1, funcionario2, funcionario3};

        // Calculando e exibindo os salários
        System.out.println("=== Cálculo de Salários ===");
        for (Funcionario func : funcionarios) {
            System.out.println("Funcionário: " + func.getNome());
            System.out.println("Tipo: " + func.getClass().getSimpleName());
            System.out.println("Salário: R$ " + String.format("%.2f", func.calcularSalario()));
            System.out.println("--------------------");
        }
    }
} 