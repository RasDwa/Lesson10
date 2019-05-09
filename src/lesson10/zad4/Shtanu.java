package lesson10.zad4;

public class Shtanu extends Dress implements MenDress, WomenDress {
    public Shtanu(SizeDress size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void odetMen() {
        System.out.println("Мужские штаны "+super.getSize()+" "+super.getPrice()+" "+super.getColor());
    }

    @Override
    public void odetWomen() {
        System.out.println("Женские штаны "+super.getSize()+" "+super.getPrice()+" "+super.getColor());
    }
}
