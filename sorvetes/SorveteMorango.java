package com.company.sorvetes;

import com.company.IItem;
/** Sorvete de morango  */
public class SorveteMorango implements IItem {

    @Override
    public String getDescription() {
        return "Sorvete de Morango";
    }

    @Override
    public double getPrice() {
        return 8.00;
    }
}
