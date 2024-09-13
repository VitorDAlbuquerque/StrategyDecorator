package com.company.coberturas;

import com.company.FillDecorator;
import com.company.IItem;
/** Cobertura de Morango para o decorator */
public class CoberturaMorango extends FillDecorator {


    public CoberturaMorango(IItem FillItem) {
        super(FillItem);
    }

    /** Decorator*/
    @Override
    public double getPrice() {
        return FillItem.getPrice() + 1.50;
    }

    @Override
    public String getDescription() {
        return FillItem.getDescription() + " com cobertura de morango";
    }
}