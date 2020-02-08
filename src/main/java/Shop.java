import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public void addItem(ISell newItem) {
        this.stock.add(newItem);
    }

    public void removeItem(ISell oldItem) {
        this.stock.remove(oldItem);
    }

    public int getSizeOfStock() {
        return this.stock.size();
    }

    public double getProjectedProfits() {
        double profits = 0;

        for(ISell item : this.stock) {
            double itemMarkup = item.calculateMarkUp();
            profits += itemMarkup;
        }

        return profits;
    }
}
