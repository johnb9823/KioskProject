package level4;

public class MenuItem {
    private String name;
    private double price;
    private String description;

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // getter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void printSelectedMenu() {
        System.out.println(name + " | W " + price + " | " + description);
    }

}
