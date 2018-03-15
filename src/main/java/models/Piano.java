package models;
import javax.persistence.*;

@Entity
@Table(name="piano")
public class Piano extends Instrument {
    private String manufacturer;

    public Piano() {
    }

    public Piano(String manufacturer, String colour, int buyPrice, int sellPrice) {
        super(colour, "Keyboard", buyPrice, sellPrice);
        this.manufacturer = manufacturer;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    @Column(name="manufacturer")
    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }

    public String play() {
        return "Plink Plonk";
    }

}
