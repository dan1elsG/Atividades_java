package com.sistema.pagamento;

public class PagamentoCartaoCredito extends MetodoPagamento {
    private String numeroCartao;
    private String nomeTitular;
    private String dataValidade;
    private String cvv;
    
    public PagamentoCartaoCredito(double valor, String numeroCartao, String nomeTitular, 
                                String dataValidade, String cvv) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.dataValidade = dataValidade;
        this.cvv = cvv;
    }
    
    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento com cartão de crédito");
        System.out.println("Valor: R$ " + valor);
        System.out.println("Cartão: " + numeroCartao);
        // Lógica específica para processamento de cartão de crédito
    }
    
    @Override
    public String getTipoPagamento() {
        return "Cartão de Crédito";
    }
} 