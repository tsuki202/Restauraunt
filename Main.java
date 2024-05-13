import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Оберіть ресторан Amadeus/Celentano/36 Po:");
        String restaurantChoice = scanner.nextLine();
        System.out.println("Ви обрали ресторан: " + restaurantChoice);

        ArrayList<String> selectedItems = new ArrayList<>();
        int totalPrice = 0;

        switch (restaurantChoice) {
            case "Amadeus":
                totalPrice = calculateTotalPrice(getAmadeusMenu(), scanner, selectedItems);
                break;
            case "Celentano":
                totalPrice = calculateTotalPrice(getCelentanoMenu(), scanner, selectedItems);
                break;
            case "36 Po":
                totalPrice = calculateTotalPrice(get36PoMenu(), scanner, selectedItems);
                break;
            default:
                System.out.println("Такого ресторану не існує.");
                return;
        }

        System.out.println("Ваші обрані страви:");
        for (String item : selectedItems) {
            System.out.println(item);
        }
        System.out.println("Загальна сума до оплати: " + totalPrice + "₴");
    }

    private static int calculateTotalPrice(Restaurant[] menu, Scanner scanner, ArrayList<String> selectedItems) {
        int totalPrice = 0;
        while (true) {
            System.out.println("Оберіть меню: " + getMenuCategories(menu) + " (або 'кінець' для завершення)");
            String menuChoice = scanner.nextLine();
            if (menuChoice.equals("кінець")) break;
            boolean found = false;
            for (Restaurant menuItem : menu) {
                if (menuItem.getCategory().equalsIgnoreCase(menuChoice)) {
                    found = true;
                    System.out.println("Оберіть страву:");
                    for (Restaurant item : menu) {
                        if (item.getCategory().equalsIgnoreCase(menuChoice)) {
                            System.out.println(item.getName() + " - " + item.getPrice());
                        }
                    }
                    String selectedItem = scanner.nextLine();
                    selectedItems.add(selectedItem);
                    for (Restaurant item : menu) {
                        if (item.getName().equalsIgnoreCase(selectedItem)) {
                            totalPrice += item.getPrice();
                            break;
                        }
                    }
                    break;
                }
            }
            if (!found) {
                System.out.println("Невідоме меню!");
            }
        }
        return totalPrice;
    }

    private static String getMenuCategories(Restaurant[] menu) {
        StringBuilder categories = new StringBuilder();
        for (Restaurant menuItem : menu) {
            if (!categories.toString().contains(menuItem.getCategory())) {
                categories.append(menuItem.getCategory()).append("/");
            }
        }
        return categories.toString();
    }

    private static Restaurant[] getAmadeusMenu() {
        return new Restaurant[]{
                new Restaurant("Англійський сніданок", "Сніданки", 290),
                new Restaurant("Італійський сніданок", "Сніданки", 355),
                new Restaurant("Салат овочевий", "Сніданки", 255),
                new Restaurant("Бургер з яловичиною", "Основне меню", 580),
                new Restaurant("Салат з креветками", "Основне меню", 345),
                new Restaurant("Тайський суп", "Основне меню", 470),
                new Restaurant("Тайське зелене карі", "Основне меню", 295),
                new Restaurant("Тірамісу", "Десерти", 280),
                new Restaurant("Торт Наполеон", "Десерти", 90),
                new Restaurant("Пиріг з ягід", "Десерти", 85),
                new Restaurant("Львівська кава", "Напої", 60),
                new Restaurant("Молочний коктейль", "Напої", 95),
                new Restaurant("Чай", "Напої", 70)
        };
    }

    private static Restaurant[] getCelentanoMenu() {
        return new Restaurant[]{
                new Restaurant("Цезаре", "Піца", 305),
                new Restaurant("Маргарита", "Піца", 232),
                new Restaurant("Гавайська", "Піца", 245),
                new Restaurant("Діабола", "Піца", 270),
                new Restaurant("Кальцоне з салямі", "Піца", 152),
                new Restaurant("Капрічоза", "Піца", 329),
                new Restaurant("Ді Вітело", "Піца", 310),
                new Restaurant("Карбонара", "Піца", 329),
                new Restaurant("Львівська кава", "Напої", 60),
                new Restaurant("Молочний коктейль", "Напої", 95),
                new Restaurant("Чай", "Напої", 70)
        };
    }

    private static Restaurant[] get36PoMenu() {
        return new Restaurant[]{
                new Restaurant("Тост зі слабосоленим лососем, гуакамоле та яйцями пашот", "Сніданки", 325),
                new Restaurant("Яйця пашот з соусом Голландез та беконом", "Сніданки", 245),
                new Restaurant("Скрембл зі слабосоленим лососем та соусом песто", "Сніданки", 275),
                new Restaurant("Скрембл з хамоном та соусом песто", "Сніданки", 255),
                new Restaurant("Трюфельний скрембл на хрусткому бріоші з в'яленими томатами", "Сніданки", 265),
                new Restaurant("Англійський сніданок з соковитими ковбасками та беконом", "Сніданки", 320),
                new Restaurant("Сирники з малиновою еспумою та сметаною", "Сніданки", 185),
                new Restaurant("Панкейки з медовим крем-сиром та ягідним джемом", "Сніданки", 250),
                new Restaurant("Карпаччо з лосося із соусом Понзу", "Основне меню", 590),
                new Restaurant("Салат овочевий з фетою та соусом з печеного перцю", "Основне меню", 255),
                new Restaurant("Салат зі слабосоленим лососем та авокадо", "Основне меню", 375),
                new Restaurant("Салат Цезар з курячим філе у беконі", "Основне меню", 295),
                new Restaurant("Салат Цезар з креветками та томатам чері", "Основне меню", 365),
                new Restaurant("Рибний суп з мідіями", "Основне меню", 350),
                new Restaurant("Стейк Striploin вологої витримки з салатом бейбі Ромен гриль", "Основне меню", 500),
                new Restaurant("Спартак з ванільним морозивом", "Десерти", 160),
                new Restaurant("Шоколадний фондан з ванільним морозивом", "Десерти", 210),
                new Restaurant("Тірамісу з шоколадом та фундуком", "Десерти", 195),
                new Restaurant("Баскський 'палений' чізкейк з малиновою еспумою", "Десерти", 185),
                new Restaurant("Наполеон з заварним кремом", "Десерти", 180),
                new Restaurant("Вермути/Бітери/Настоянки", "Напої", 60),
                new Restaurant("Ром", "Напої", 65),
                new Restaurant("Текіла", "Напої", 85),
                new Restaurant("Джин", "Напої", 99),
                new Restaurant("Віскі/Бурбон", "Напої", 81),
                new Restaurant("Бренді", "Напої", 75),
                new Restaurant("Коньяк", "Напої", 173),
                new Restaurant("Грапа", "Напої", 77)
        };
    }
}

class Restaurant {
    private String name;
    private String category;
    private int price;

    public Restaurant(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }
}
