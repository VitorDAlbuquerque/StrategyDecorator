package com.company.pagamentos;

import com.company.IPagamento;

public class CartaoCredito  implements IPagamento {
    /** Metodo de pagamento de cartão de credito (strategy) */
    @Override
    public void pagamento(double valor) {
        System.out.println("Pagamento por Cartao de Credito");
    }

}
