package instruments;

import accessories.string.Strings;
import behaviours.IPlay;

public abstract class Instrument implements IPlay {
    private double buyingPrice;
    private double sellingPrice;
    private int weight;
    private String make;
    private String model;

    public Instrument(String make, String model, int weight, double buyingPrice, double sellingPrice) {
        this.make = make;
        this.model = model;
        this.weight = weight;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public int getWeight() {
        return this.weight;
    }


    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }


    public void setSellingPrice(double newPrice) {
        this.sellingPrice = newPrice;
    }

    public abstract String playInstrument();
}
