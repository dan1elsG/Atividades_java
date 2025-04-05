public class Carro extends Veiculo {
    private int numeroPortas;
    private String combustivel;
    private boolean temArCondicionado;

    public Carro(String marca, String modelo, int ano, int numeroPortas, String combustivel, boolean temArCondicionado) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
        this.combustivel = combustivel;
        this.temArCondicionado = temArCondicionado;
    }

    // Métodos específicos para carros
    public void abrirPorta(int numeroPorta) {
        if (numeroPorta > 0 && numeroPorta <= numeroPortas) {
            System.out.println("Porta " + numeroPorta + " aberta!");
        } else {
            System.out.println("Número de porta inválido!");
        }
    }

    public void ligarArCondicionado() {
        if (ligado && temArCondicionado) {
            System.out.println("Ar condicionado ligado!");
        } else if (!ligado) {
            System.out.println("Carro está desligado!");
        } else {
            System.out.println("Este carro não possui ar condicionado!");
        }
    }

    // Getters e Setters específicos
    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public boolean isTemArCondicionado() {
        return temArCondicionado;
    }

    public void setTemArCondicionado(boolean temArCondicionado) {
        this.temArCondicionado = temArCondicionado;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: Carro\nNúmero de portas: " + numeroPortas + 
               "\nCombustível: " + combustivel + "\nAr condicionado: " + (temArCondicionado ? "Sim" : "Não");
    }
} 