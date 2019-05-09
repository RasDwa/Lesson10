package lesson10.zad4;

public class Galstuk extends Dress implements MenDress{
    public Galstuk(SizeDress size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void odetMen() {
        System.out.println("Мужской галстук "+super.getSize()+" "+super.getPrice()+" "+super.getColor());
    }
}
