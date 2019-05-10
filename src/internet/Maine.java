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
        /*System.out.println("Введите логин...");
        String login = scanner.nextLine();
        System.out.println("Введите пароль...");
        String password = scanner.nextLine();
        System.out.println("Добро пожаловать в наш магазин! \nВыберите цифру товара что вас интересует...");*/
        SpisocKataloga[] spisocKatalogas = SpisocKataloga.values();
        for (SpisocKataloga s : spisocKatalogas) {
            System.out.println(s + " -> " + s.ordinal());
        }
        int vibor = scanner.nextInt();
        switch (vibor) {
            case 0:
                for (Tovar t : tovarElectronica) {
                    System.out.println(t.getName() + " " + t.getPrice() + " " + t.getReyting());
                }
                break;
            case 1:
                for (Tovar t : tovarUslygi) {
                    System.out.println(t.getName() + " " + t.getPrice() + " " + t.getReyting());
                }
                break;
            default:
                System.out.println("Не правильная группа");
        }
        System.out.println("Выберите товар что хотите купить...");

        Tovar[] kyplenueTovaru = new Tovar[1];
        int viborTovaraElectronici = scanner.nextInt();
        switch (viborTovaraElectronici) {
            case 1:
                kyplenueTovaru[0] = new Tovar("Телефон", 3500, 8.7);
                break;
            case 2:
                kyplenueTovaru[0] = new Tovar("Фитнес-Браслет", 250, 8.3);
                break;
            case 3:
                kyplenueTovaru[0] = new Tovar("Зарядка", 310, 7.0);
                break;
            default:
                System.out.println("Введенная не правильная группа");;
                break;
        }
        switch (viborTovaraElectronici) {
            case 1:
                kyplenueTovaru[0] = new Tovar("Наклейка пленки", 150, 9.0);
                break;
            case 2:
                kyplenueTovaru[0] = new Tovar("Настройка", 50, 9.1);
                break;
            default:
                System.out.println("Введенная не правильная группа");;
                break;
        }
        for (Tovar t : kyplenueTovaru) {
            System.out.println(t.getName() + " " + t.getPrice() + " " + t.getReyting());
        }
    }
}
