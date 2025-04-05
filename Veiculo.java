public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double velocidade;
    protected boolean ligado;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0.0;
        this.ligado = false;
    }

    // Métodos comuns a todos os veículos
    public void ligar() {
        this.ligado = true;
        System.out.println("Veículo ligado!");
    }

    public void desligar() {
        this.ligado = false;
        this.velocidade = 0.0;
        System.out.println("Veículo desligado!");
    }

    public void acelerar(double velocidade) {
        if (ligado) {
            this.velocidade += velocidade;
            System.out.println("Velocidade atual: " + this.velocidade + " km/h");
        } else {
            System.out.println("Veículo está desligado!");
        }
    }

    public void frear() {
        if (ligado && velocidade > 0) {
            this.velocidade = 0.0;
            System.out.println("Veículo parado!");
        }
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public boolean isLigado() {
        return ligado;
    }

    @Override
    public String toString() {
        return "Veículo: " + marca + " " + modelo + " (" + ano + ")";
    }
} 