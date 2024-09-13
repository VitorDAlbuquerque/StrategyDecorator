package com.company.coberturas;

import com.company.FillDecorator;
import com.company.IItem;
/** Cobertura de chocolate para o decorator */
public class CoberturaChocolate extends FillDecorator {



    public CoberturaChocolate(IItem FillItem){
        super(FillItem);
    }
    /** Decorator*/
    @Override
    public double getPrice() {
        return FillItem.getPrice() + 2.00;
    }

    @Override
    public String getDescription() {
        return FillItem.getDescription() + " com cobertura de chocolate";
    }
}
