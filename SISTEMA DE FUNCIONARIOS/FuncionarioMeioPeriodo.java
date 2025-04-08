public class FuncionarioMeioPeriodo extends Funcionario {
    private int horasTrabalhadasSemana;

    public FuncionarioMeioPeriodo(String nome, String cpf, double salarioBase, int horasTrabalhadasSemana) {
        super(nome, cpf, salarioBase);
        this.horasTrabalhadasSemana = horasTrabalhadasSemana;
    }

    @Override
    public double calcularSalario() {
        // Considerando que o salário base é para 40 horas semanais
        return (salarioBase * horasTrabalhadasSemana) / 40;
    }

    public int getHorasTrabalhadasSemana() {
        return horasTrabalhadasSemana;
    }

    public void setHorasTrabalhadasSemana(int horasTrabalhadasSemana) {
        this.horasTrabalhadasSemana = horasTrabalhadasSemana;
    }
} 