package lesson10.zad4;

public class Atelle {
    public static void Checc(Dress[] array){
        for (Dress a : array){
            if (a instanceof MenDress){
                ((MenDress) a).odetMen();
            }
            if (a instanceof WomenDress){
                ((WomenDress) a).odetWomen();
            };
        }
    }

    public static void main(String[] args) {

        Futbolka futbolka = new Futbolka(SizeDress.XXS, 14, "white");
        Shtanu shtanu = new Shtanu(SizeDress.L, 150, "blue");
        Skirt skirt = new Skirt(SizeDress.S, 200, "red");
        Galstuk galstuk = new Galstuk(SizeDress.M, 154, "black");
        Dress[] dresses = {futbolka, shtanu, skirt, galstuk};
        Checc(dresses);

    }
}
