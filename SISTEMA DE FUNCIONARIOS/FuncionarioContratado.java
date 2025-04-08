public class FuncionarioContratado extends Funcionario {
    private int mesesContrato;
    private double taxaServico;

    public FuncionarioContratado(String nome, String cpf, double salarioBase, int mesesContrato, double taxaServico) {
        super(nome, cpf, salarioBase);
        this.mesesContrato = mesesContrato;
        this.taxaServico = taxaServico;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + taxaServico;
    }

    public int getMesesContrato() {
        return mesesContrato;
    }

    public void setMesesContrato(int mesesContrato) {
        this.mesesContrato = mesesContrato;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }
} 