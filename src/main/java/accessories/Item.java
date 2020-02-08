package accessories;

import behaviours.ISell;

public class Item implements ISell {
    private String itemName;
    private String itemDescription;
    private Instruments intendedInstrument;
    private double boughtPrice;
    private double sellingPrice;

    public Item(String itemName, String itemDescription, Instruments intendedInstrument, double boughtPrice, double sellingPrice) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.intendedInstrument = intendedInstrument;
        this.boughtPrice = boughtPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getItemName() {
        return this.itemName;
    }

    public String getItemDescription() {
        return this.itemDescription;
    }

    public String getIntendedInstrument() {
        return this.intendedInstrument.getName();
    }

    public double getBoughtPrice() {
        return this.boughtPrice;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double calculateMarkUp() {
        return getSellingPrice() - getBoughtPrice();
    }
}
