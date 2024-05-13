public class Restauraunts{
    private String name;
    private String[] menu;
    private final int[] prices;

    // Конструктор для параметрів
    public Restauraunts(String name, String[] menu, int[] prices) {
        this.name = name;
        this.menu = menu;
        this.prices = prices;
    }

    // Метод для встановлення імені
    public void setName(String name) {

        this.name = name;
    }

    // Метод для встановлення меню
    public void setMenu(String[] menu) {

        this.menu = menu;
    }

    // Метод для отримання цін
    public int[] getPrices() {

        return prices;
    }

    // Метод для отримання меню
    public String[] getMenu() {

        return menu;
    }

    public String getName() {
        return name;
    }
}



