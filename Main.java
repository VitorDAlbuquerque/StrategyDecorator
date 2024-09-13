package com.company;

import com.company.coberturas.*;

import com.company.pagamentos.*;
import com.company.sorvetes.*;

public class Main {
        /** Rodar o programa */
    public static void main(String[] args) {


            IItem sorveteBaunilha = new SorveteBaunilha();
            IItem sorveteChocolate = new SorveteChocolate();
            IItem sorveteMorango = new SorveteMorango();

            sorveteMorango = new CoberturaChocolate(sorveteMorango);
            sorveteMorango = new CoberturaMorango(sorveteMorango);
            sorveteMorango = new CoberturaGranulado(sorveteMorango);

            sorveteChocolate = new CoberturaChocolate(sorveteChocolate);
            sorveteChocolate= new CoberturaMorango(sorveteChocolate);
            sorveteChocolate= new CoberturaGranulado(sorveteChocolate);

            sorveteBaunilha = new CoberturaChocolate(sorveteBaunilha);
            sorveteBaunilha= new CoberturaMorango(sorveteBaunilha);
            sorveteBaunilha= new CoberturaGranulado(sorveteBaunilha);


            Pedido pedidoum = new Pedido(sorveteMorango);
            Pedido pedidodois = new Pedido(sorveteChocolate);
            Pedido pedidotres = new Pedido(sorveteBaunilha);

            pedidoum.setPagamento(new Pix());
            pedidodois.setPagamento(new Dinheiro());
            pedidotres.setPagamento(new CartaoCredito());


            pedidoum.pagar();
            pedidodois.pagar();
            pedidotres.pagar();
    }
}
