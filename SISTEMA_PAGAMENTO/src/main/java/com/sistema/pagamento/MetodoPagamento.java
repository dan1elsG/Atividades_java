package com.sistema.pagamento;

public abstract class MetodoPagamento {
    protected double valor;
    
    public MetodoPagamento(double valor) {
        this.valor = valor;
    }
    
    public abstract void processarPagamento();
    public abstract String getTipoPagamento();
    
    public double getValor() {
        return valor;
    }
} 