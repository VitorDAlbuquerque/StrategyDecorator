package com.company.coberturas;

import com.company.FillDecorator;
import com.company.IItem;
/** Cobertura de granulado para o decorator */
public class CoberturaGranulado extends FillDecorator {


    public CoberturaGranulado(IItem FillItem) {
        super(FillItem);
    }
    /** Decorator*/
    @Override
    public double getPrice() {
        return FillItem.getPrice() + 1.00;
    }

    @Override
    public String getDescription() {
        return FillItem.getDescription() + " com granulado";
    }
}
