package internet;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Maine {
    public static int countPocupok=0;

    public static void main(String[] args) {

        Tovar[] tovarElectronica = {
                new Tovar("Телефон", 3500.25, 8.7),
                new Tovar("Фитнес-Браслет", 250, 8.3),
                new Tovar("Зарядка", 310, 7.0)
        };
        Tovar[] tovarUslygi = {
                new Tovar("Наклейка пленки", 150, 9.0),
                new Tovar("Настройка", 50, 9.1),
        };
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        Kategoria electronics = new Kategoria("Электроника", tovarElectronica);
        Kategoria uslygi = new Kategoria("Услуги", tovarUslygi);

        Basket basket1 = new Basket(tovarElectronica, LocalDate.now());
        Basket basket2 = new Basket(tovarUslygi,LocalDate.now());

        User user1 = new User("login1", "parol1", basket1);
        User user2 = new User("login2", "parol2", basket2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин...");
        String login = scanner.nextLine();
        System.out.println("Введите пароль...");
        String password = scanner.nextLine();
        System.out.println("Добро пожаловать в наш магазин! "+login+"\nВыберите цифру товара что вас интересует...");

        Tovar[] kyplenueTovaru = new Tovar[2];
        SpisocKataloga[] spisocKatalogas = SpisocKataloga.values();
        for (SpisocKataloga s : spisocKatalogas) {
            System.out.println(s + " -> " + s.ordinal());
        }
        int vibor = scanner.nextInt();

        System.out.println("Выберите то что хотите купить...");
        switch (vibor) {
            case 0:
                for (Tovar t : tovarElectronica) {
                    System.out.println(t.getName() + " " + t.getPrice() + " грн " + t.getReyting()+" рейнтинг");
                }
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
                        System.out.println("Введенная не правильная группа");
                        ;
                        break;
                }
                break;
            case 1:
                for (Tovar t : tovarUslygi) {
                    System.out.println(t.getName() + " " + t.getPrice() + " грн " + t.getReyting()+" рейнтинг");
                }
                int viborTovaraUslugi = scanner.nextInt();
                switch (viborTovaraUslugi) {
                    case 1:
                        kyplenueTovaru[0] = new Tovar("Наклейка пленки", 150, 9.0);
                        break;
                    case 2:
                        kyplenueTovaru[0] = new Tovar("Настройка", 50, 9.1);
                        break;
                    default:
                        System.out.println("Введенная не правильная группа");
                        ;
                        break;
                }
                break;
            default:
                System.out.println("Не правильная группа");
        }

        System.out.println("Желаете продолжить список покупок?\n" +
                "1. Да\n" +
                "2. Нет (Показать мою корзину покупок)");
        int vtoroyEtap = scanner.nextInt();
        switch (vtoroyEtap) {
            case 1:
                for (SpisocKataloga s : spisocKatalogas) {
                    System.out.println(s + " -> " + s.ordinal());
                }
                int vibor2 = scanner.nextInt();

                System.out.println("Выберите то что хотите купить...");
                switch (vibor2) {
                    case 0:
                        for (Tovar t : tovarElectronica) {
                            System.out.println(t.getName() + " " + t.getPrice() + " грн " + t.getReyting()+" рейнтинг");
                        }
                        int viborTovaraElectronici = scanner.nextInt();
                        switch (viborTovaraElectronici) {
                            case 1:
                                kyplenueTovaru[1] = new Tovar("Телефон", 3500, 8.7);

                                break;
                            case 2:
                                kyplenueTovaru[1] = new Tovar("Фитнес-Браслет", 250, 8.3);
                                break;
                            case 3:
                                kyplenueTovaru[1] = new Tovar("Зарядка", 310, 7.0);
                                break;
                            default:
                                System.out.println("Введенная не правильная группа");
                                ;
                                break;
                        }
                        break;
                    case 1:
                        for (Tovar t : tovarUslygi) {
                            System.out.println(t.getName() + " " + t.getPrice() + " грн " + t.getReyting()+" рейнтинг");
                        }
                        int viborTovaraUslugi = scanner.nextInt();
                        switch (viborTovaraUslugi) {
                            case 1:
                                kyplenueTovaru[1] = new Tovar("Наклейка пленки", 150, 9.0);
                                break;
                            case 2:
                                kyplenueTovaru[1] = new Tovar("Настройка", 50, 9.1);
                                break;
                            default:
                                System.out.println("Введенная не правильная группа");
                                ;
                                break;
                        }
                        break;
                    default:
                        System.out.println("Не правильная группа");
                }

                System.out.println("Желаете продолжить список покупок?\n" +
                        "1. Да\n" +
                        "2. Нет (Показать мою корзину покупок)");
                int vibor3 = scanner.nextInt();
                switch (vibor3){
                    case 1:
                        System.out.println("Хватить все покупать...вот то что ты покупаешь: ");
                        shapka(basket1);

                        for (Tovar t : kyplenueTovaru) {
                            seredina(numberFormat, electronics, t);
                            countPocupok+=t.getPrice();
                        }
                        System.out.println("--------------------------------");
                        System.out.println("Итого: "+numberFormat.format(countPocupok));
                        break;
                    case 2:
                        shapka(basket1);

                        for (Tovar t : kyplenueTovaru) {
                            seredina(numberFormat, electronics, t);
                            countPocupok+=t.getPrice();
                        }
                        System.out.println("--------------------------------");
                        System.out.println("Итого: "+numberFormat.format(countPocupok));
                        break;
                }
                break;
            case 2:
                shapka(basket1);
                Tovar [] kyplenoOdin = new Tovar[1];
                System.arraycopy(kyplenueTovaru,0,kyplenoOdin,0,1);
                for (Tovar t : kyplenoOdin) {
                    seredina(numberFormat, electronics, t);

                    countPocupok+=t.getPrice();
                }
                System.out.println("--------------------------------");
                System.out.println("Итого: "+numberFormat.format(countPocupok));
                break;
        }

    }

    private static void shapka(Basket basket1) {
        System.out.printf("Дата: %26s\n", basket1.getPocupkaData());
        System.out.println();
        System.out.printf("%s %15s %7s\n", "Продукт ", "Категория ", "Цена");
        System.out.println("--------------------------------");
    }
    private static void seredina(NumberFormat numberFormat, Kategoria electronics, Tovar t) {
        System.out.printf("%s \t%15s %7s\n", t.getName(), electronics.getNameKategoria(), numberFormat.format(t.getPrice()));
    }

}
