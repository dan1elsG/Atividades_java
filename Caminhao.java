public class Caminhao extends Veiculo {
    private double capacidadeCarga;
    private int numeroEixos;
    private boolean temCabineDupla;

    public Caminhao(String marca, String modelo, int ano, double capacidadeCarga, int numeroEixos, boolean temCabineDupla) {
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
        this.numeroEixos = numeroEixos;
        this.temCabineDupla = temCabineDupla;
    }

    // Métodos específicos para caminhões
    public void carregar(double peso) {
        if (peso <= capacidadeCarga) {
            System.out.println("Carga de " + peso + " toneladas carregada com sucesso!");
        } else {
            System.out.println("Peso excede a capacidade máxima de carga!");
        }
    }

    public void descarregar() {
        System.out.println("Carga descarregada!");
    }

    // Getters e Setters específicos
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }

    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    public boolean isTemCabineDupla() {
        return temCabineDupla;
    }

    public void setTemCabineDupla(boolean temCabineDupla) {
        this.temCabineDupla = temCabineDupla;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: Caminhão\nCapacidade de carga: " + capacidadeCarga + " toneladas" + 
               "\nNúmero de eixos: " + numeroEixos + "\nCabine dupla: " + (temCabineDupla ? "Sim" : "Não");
    }
} 