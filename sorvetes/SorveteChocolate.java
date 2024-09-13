package com.company.sorvetes;

import com.company.IItem;
/** Sorvete de chocolate */
public class SorveteChocolate implements IItem {

    @Override
    public String getDescription() {
        return "Sorvete de Chocolate";
    }

    @Override
    public double getPrice() {
        return 10.00;
    }
}
