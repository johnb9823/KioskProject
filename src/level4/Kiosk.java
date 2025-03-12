package level4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus;

    // 생성자
    public Kiosk() {
        menus = new ArrayList<>();
        menus.add(createBurgersMenu());
        menus.add(createDrinksMenu());
        menus.add(createDessertsMenu());
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            //카테고리 출력
            System.out.println("[ SHAKESHACK MENU ]");
            for(int i = 0; i < menus.size(); i++) {
                System.out.println(1 + i + ". " + menus.get(i).getCategoryName());
            }
            System.out.println("0. 종료");

            // 사용자가 카테고리 선택
            int categoryChoice = sc.nextInt();
            if (categoryChoice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 선택된 카테고리로 이동
            if (categoryChoice >= 1 && categoryChoice <= menus.size()) {
                Menu selectedMenu = menus.get(categoryChoice - 1);
                handleMenuSelection(selectedMenu, sc);
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }

    }

    // 선택된 카테고리에서 메뉴 항목 처리
    private void handleMenuSelection(Menu menu, Scanner scanner) {
        while (true) {
            // 해당 카테고리의 메뉴 항목 출력
            System.out.println("[" + menu.getCategoryName().toUpperCase() + " MENU ]");
            menu.displayMenu();

            // 메뉴 항목 선택
            int itemChoice = scanner.nextInt();
            if (itemChoice == 0) {
                break; // 뒤로가기
            }

            // 유효한 메뉴 항목 선택 시 출력
            if (itemChoice >= 1 && itemChoice <= menu.getMenuItems().size()) {
                MenuItem selectedItem = menu.getMenuItems().get(itemChoice - 1);
                System.out.println("선택한 메뉴: " + selectedItem.getName() + " | W " + selectedItem.getPrice() +
                        " | " + selectedItem.getDescription());
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }

    private Menu createBurgersMenu() {
        List<MenuItem> burgers = new ArrayList<>();
        burgers.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        return new Menu("Burgers", burgers);
    }
    private Menu createDrinksMenu() {
        List<MenuItem> drinks = new ArrayList<>();
        drinks.add(new MenuItem("Coke", 2.5, "콜라"));
        drinks.add(new MenuItem("Sprite", 2.5, "스프라이트"));
        drinks.add(new MenuItem("Milkshake", 5.0, "밀크쉐이크"));
        drinks.add(new MenuItem("Water", 1.0, "물"));
        return new Menu("Drinks", drinks);
    }
    private Menu createDessertsMenu() {
        List<MenuItem> desserts = new ArrayList<>();
        desserts.add(new MenuItem("Ice Cream", 3.5, "바닐라 아이스크림"));
        desserts.add(new MenuItem("Pie", 4.0, "애플 파이"));
        return new Menu("Desserts", desserts);
    }

}
