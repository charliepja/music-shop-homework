package instruments;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {
    private double buyingPrice;
    private double sellingPrice;
    private String name;
    private String make;
    private String model;
    private String sound;

    public Instrument(String name, String make, String model, String sound, double buyingPrice, double sellingPrice) {
        this.name = name;
        this.make = make;
        this.model = model;
        this.sound = sound;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public String getName() {
        return this.name;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getSound() {
        return this.sound;
    }

    public void setSellingPrice(double newPrice) {
        this.sellingPrice = newPrice;
    }

    public abstract String playInstrument();
}
