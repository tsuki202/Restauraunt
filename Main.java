import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Перенесення створення Scanner до main

        // Виведення повідомлення "Оберіть ресторан"
        System.out.println("Оберіть ресторан:");

        // Прийняття рядка з клавіатури
        String restaurantChoice = scanner.nextLine();

        // Виведення обраного ресторану
        System.out.println("Ви обрали ресторан: " + restaurantChoice);

        if (restaurantChoice.equals("Amadeus")){
            Restaurant menu1 = new Restaurant("Сніданки", new String[]{"Англійський сніданок", "Італійський сніданок", "Салат овочевий"}, new int[]{290, 355, 255});
            Restaurant menu2 = new Restaurant("Основне меню", new String[]{"Бургер з яловичиною", "Салат з креветками", "Тайський суп", "Тайське зелене карі"}, new int[]{580, 345, 470, 295});
            Restaurant menu3 = new Restaurant("Десерти", new String[]{"Тірамісу", "Торт Наполеон", "Пиріг з ягід"}, new int[]{280, 90, 85});
            Restaurant menu4 = new Restaurant("Напої", new String[]{"Львівська кава", "Молочний коктейль", "Чай"}, new int[]{60, 95, 70});
            menu1.MenuPrice();
            menu2.MenuPrice();
            menu3.MenuPrice();
            menu4.MenuPrice();
        } else if (restaurantChoice.equals("Mons Pius")) {
            Restaurant menu1 = new Restaurant("Сніданки", new String[]{"Англійський сніданок", "Італійський сніданок", "Салат овочевий"}, new int[]{290, 355, 255});
            Restaurant menu2 = new Restaurant("Основне меню", new String[]{"Бургер з яловичиною", "Салат з креветками", "Тайський суп", "Тайське зелене карі"}, new int[]{580, 345, 470, 295});
            Restaurant menu3 = new Restaurant("Десерти", new String[]{"Тірамісу", "Торт Наполеон", "Пиріг з ягід"}, new int[]{280, 90, 85});
            Restaurant menu4 = new Restaurant("Напої", new String[]{"Львівська кава", "Молочний коктейль", "Чай"}, new int[]{60, 95, 70});
            menu1.MenuPrice();
            menu2.MenuPrice();
            menu3.MenuPrice();
            menu4.MenuPrice();
        } else if (restaurantChoice.equals("36 Po")) {
            Restaurant menu1 = new Restaurant("Сніданки", new String[]{"Англійський сніданок", "Італійський сніданок", "Салат овочевий"}, new int[]{290, 355, 255});
            Restaurant menu2 = new Restaurant("Основне меню", new String[]{"Бургер з яловичиною", "Салат з креветками", "Тайський суп", "Тайське зелене карі"}, new int[]{580, 345, 470, 295});
            Restaurant menu3 = new Restaurant("Десерти", new String[]{"Тірамісу", "Торт Наполеон", "Пиріг з ягід"}, new int[]{280, 90, 85});
            Restaurant menu4 = new Restaurant("Напої", new String[]{"Львівська кава", "Молочний коктейль", "Чай"}, new int[]{60, 95, 70});
            menu1.MenuPrice();
            menu2.MenuPrice();
            menu3.MenuPrice();
            menu4.MenuPrice();
        }
        else {
            System.out.println("Такого ресторану не існує.");
        }


    }
}