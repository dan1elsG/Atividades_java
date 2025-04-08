public class FuncionarioTempoIntegral extends Funcionario {
    private double beneficios;

    public FuncionarioTempoIntegral(String nome, String cpf, double salarioBase, double beneficios) {
        super(nome, cpf, salarioBase);
        this.beneficios = beneficios;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + beneficios;
    }

    public double getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(double beneficios) {
        this.beneficios = beneficios;
    }
} 