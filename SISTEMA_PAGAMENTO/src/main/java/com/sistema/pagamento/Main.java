package com.sistema.pagamento;

public class Main {
    public static void main(String[] args) {
        // Exemplo de pagamento em dinheiro
        MetodoPagamento pagamentoDinheiro = new PagamentoDinheiro(100.00);
        pagamentoDinheiro.processarPagamento();
        
        // Exemplo de pagamento com cartão de crédito
        MetodoPagamento pagamentoCartao = new PagamentoCartaoCredito(
            150.00,
            "1234 5678 9012 3456",
            "João Silva",
            "12/25",
            "123"
        );
        pagamentoCartao.processarPagamento();
    }
} 