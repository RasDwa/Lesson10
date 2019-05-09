package lesson10.zad4;

public class Skirt extends Dress implements WomenDress {
    public Skirt(SizeDress size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void odetWomen() {
        System.out.println("Женска юбка "+super.getSize()+" "+super.getPrice()+" "+super.getColor());
    }
}
