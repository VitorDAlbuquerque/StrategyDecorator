package com.company;

/** Pedido utilizando*/
public class Pedido {


    private IItem item;
    private IPagamento pagamento;


    public Pedido(IItem item){

        this.item = item;

    }


    public void setPagamento(IPagamento pagamento){
        this.pagamento = pagamento;
    }

    public void pagar(){

        System.out.println("O seu pedido ficou: " +item.getDescription());
        System.out.println("Valor total: " +item.getPrice());
        pagamento.pagamento(item.getPrice());
    }


}
