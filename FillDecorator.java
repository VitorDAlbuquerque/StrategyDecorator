package com.company;
/** Classe abstrata pro decorator */
public abstract class FillDecorator implements IItem{

    protected IItem FillItem;

    public FillDecorator(IItem FillItem){
        this.FillItem = FillItem;
    }

    @Override
    public String getDescription() {
        return FillItem.getDescription();
    }

    @Override
    public double getPrice() {
        return FillItem.getPrice();
    }
}
