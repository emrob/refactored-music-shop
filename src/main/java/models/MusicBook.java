package models;

import behaviours.ISell;

import javax.persistence.*;

@Entity
@Table(name ="music_book")
public class MusicBook implements ISell {

    private int id;
    String title;
    int buyPrice;
    int sellPrice;

    public MusicBook(String title, int buyPrice, int sellPrice) {
        this.title = title;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public MusicBook() {
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="title")
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name="buy_price")
    public int getBuyPrice() {
        return this.buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    @Column(name="sell_price")
    public int getSellPrice() {
        return this.sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int calculateMarkup() {
        return this.sellPrice - this.buyPrice;
    }

}
