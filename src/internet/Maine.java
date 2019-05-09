package internet;


import java.util.Scanner;

public class Maine {
    public static void main(String[] args) {
        Tovar[] tovarElectronica = {
                new Tovar("Телефон", 3500, 8.7),
                new Tovar("Фитнес-Браслет", 250, 8.3),
                new Tovar("Зарядка", 310, 7.0)
        };
        Tovar[] tovarUslygi = {
                new Tovar("Наклейка пленки", 150, 9.0),
                new Tovar("Настройка", 50, 9.1),
        };
        Kategoria electronics = new Kategoria("Электроника", tovarElectronica);
        Kategoria uslygi = new Kategoria("Услуги", tovarUslygi);

        Basket basket1 = new Basket(tovarElectronica);
        Basket basket2 = new Basket(tovarUslygi);

        User user1 = new User("login1", "parol1", basket1);
        User user2 = new User("login2", "parol2", basket2);

        Scanner scanner = new Scanner(System.in);
    }
}
