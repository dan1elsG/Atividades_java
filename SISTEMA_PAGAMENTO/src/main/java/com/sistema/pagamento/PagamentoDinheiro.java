package com.sistema.pagamento;

public class PagamentoDinheiro extends MetodoPagamento {
    
    public PagamentoDinheiro(double valor) {
        super(valor);
    }
    
    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento em dinheiro no valor de R$ " + valor);
        // Lógica específica para pagamento em dinheiro
    }
    
    @Override
    public String getTipoPagamento() {
        return "Dinheiro";
    }
} 