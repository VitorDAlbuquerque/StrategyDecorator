package com.company.pagamentos;

import com.company.IPagamento;

public class Pix implements IPagamento {

    /** Metodo de pagametno de boleto (strategy) */
    @Override
    public void pagamento(double valor) {
        System.out.println("Pagamento por pix");
    }
}
