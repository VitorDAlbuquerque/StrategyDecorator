package com.company.pagamentos;

import com.company.IPagamento;

public class Dinheiro  implements IPagamento {
    /** Metodo de pagamento de dinheiro (strategy) */
    @Override
    public void pagamento(double valor) {
        System.out.println("Pagamento por dinheiro");
    }
}
