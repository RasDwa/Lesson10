package lesson10.zad4;

import java.util.Objects;

public abstract class Dress {
    private SizeDress size;
    private int price;
    private String color;

    public Dress(SizeDress size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public SizeDress getSize() {
        return size;
    }

    public void setSize(SizeDress size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dress dress = (Dress) o;
        return price == dress.price &&
                size == dress.size &&
                Objects.equals(color, dress.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, price, color);
    }

    @Override
    public String toString() {
        return "Dress{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
