package lesson10.zad4;

public class Futbolka extends Dress implements MenDress, WomenDress {
    public Futbolka(SizeDress size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void odetMen() {
        System.out.println("Мужская футболка "+super.getSize()+" "+super.getPrice()+" "+super.getColor());

    }

    @Override
    public void odetWomen() {
        System.out.println("Женская футболка "+super.getSize()+" "+super.getPrice()+" "+super.getColor());
    }

}
