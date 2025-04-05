public class Bicicleta extends Veiculo {
    private int numeroMarchas;
    private boolean temFreioDisco;
    private String tipoQuadro;

    public Bicicleta(String marca, String modelo, int ano, int numeroMarchas, boolean temFreioDisco, String tipoQuadro) {
        super(marca, modelo, ano);
        this.numeroMarchas = numeroMarchas;
        this.temFreioDisco = temFreioDisco;
        this.tipoQuadro = tipoQuadro;
    }

    // Métodos específicos para bicicletas
    public void trocarMarcha(int marcha) {
        if (marcha > 0 && marcha <= numeroMarchas) {
            System.out.println("Marcha alterada para: " + marcha);
        } else {
            System.out.println("Marcha inválida!");
        }
    }

    public void ajustarAlturaSelim(double altura) {
        System.out.println("Altura do selim ajustada para: " + altura + " cm");
    }

    // Getters e Setters específicos
    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public boolean isTemFreioDisco() {
        return temFreioDisco;
    }

    public void setTemFreioDisco(boolean temFreioDisco) {
        this.temFreioDisco = temFreioDisco;
    }

    public String getTipoQuadro() {
        return tipoQuadro;
    }

    public void setTipoQuadro(String tipoQuadro) {
        this.tipoQuadro = tipoQuadro;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: Bicicleta\nNúmero de marchas: " + numeroMarchas + 
               "\nFreio a disco: " + (temFreioDisco ? "Sim" : "Não") + "\nTipo de quadro: " + tipoQuadro;
    }
} 