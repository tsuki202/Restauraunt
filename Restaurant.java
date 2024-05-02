

public class Restaurant {
    String name;
    String[] menu;
    int[] price;

    public Restaurant(String name, String[] menu, int[] price) {
        this.name = name;
        this.menu = menu;
        this.price = price;
    }

    void MenuPrice() {
        System.out.println(name);
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i] + ": " + price[i] +"₴");
        }
        System.out.println(); // Додаємо порожній рядок для відділення від наступного меню
    }


}



