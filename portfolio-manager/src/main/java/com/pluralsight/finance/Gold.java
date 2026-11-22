package com.pluralsight.finance;

public class Gold extends FixedAsset{
    private double weight;

    public Gold(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.weight = weight;
    }
    @Override
    public double getValue() {
        return super.getValue() * weight;
    }
}
