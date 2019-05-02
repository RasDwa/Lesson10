package internet;

import java.util.Objects;

public class Tovar {
    private String name;
    private double price;
    private double reyting;

    public Tovar(String name, double price, double reyting) {
        this.name = name;
        this.price = price;
        this.reyting = reyting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getReyting() {
        return reyting;
    }

    public void setReyting(double reyting) {
        this.reyting = reyting;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", reyting=" + reyting +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tovar tovar = (Tovar) o;
        return Double.compare(tovar.price, price) == 0 &&
                Double.compare(tovar.reyting, reyting) == 0 &&
                Objects.equals(name, tovar.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, reyting);
    }
}

