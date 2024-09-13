package com.company.sorvetes;

import com.company.IItem;
/** Sorvete de baunilha */
public class SorveteBaunilha implements IItem {


    @Override
    public String getDescription() {
        return "Sorvete de Baunilha";
    }

    @Override
    public double getPrice() {
        return 7.00;
    }
}
