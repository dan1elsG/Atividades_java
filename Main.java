public class Main {
    public static void main(String[] args) {
        // Criando instâncias de diferentes tipos de veículos
        Carro carro = new Carro("Toyota", "Corolla", 2020, 4, "Flex", true);
        Bicicleta bicicleta = new Bicicleta("Caloi", "Mountain Bike", 2021, 21, true, "Alumínio");
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2019, 40.0, 6, true);

        // Demonstração do uso dos veículos
        System.out.println("\n=== Testando o Carro ===");
        System.out.println(carro);
        carro.ligar();
        carro.acelerar(60);
        carro.abrirPorta(1);
        carro.ligarArCondicionado();
        carro.frear();
        carro.desligar();

        System.out.println("\n=== Testando a Bicicleta ===");
        System.out.println(bicicleta);
        bicicleta.trocarMarcha(3);
        bicicleta.acelerar(20);
        bicicleta.ajustarAlturaSelim(75);
        bicicleta.frear();

        System.out.println("\n=== Testando o Caminhão ===");
        System.out.println(caminhao);
        caminhao.ligar();
        caminhao.acelerar(80);
        caminhao.carregar(35);
        caminhao.descarregar();
        caminhao.frear();
        caminhao.desligar();
    }
} 