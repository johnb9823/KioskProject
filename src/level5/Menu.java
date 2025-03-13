package level5;

import java.util.List;

public class Menu {

    private String categoryName;
    private List<MenuItem> menuItems;

    public Menu(String categoryName, List<MenuItem> menuItems) {
        this.categoryName = categoryName;
        this.menuItems = menuItems;
    }

    // getter setter 추가
    public String getCategoryName() {
        return categoryName;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void displayMenu() {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d. ", i + 1);
            menuItems.get(i).printSelectedMenu();
        }
        System.out.println("0. 뒤로가기");
    }

}
