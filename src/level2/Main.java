package level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // List 선언 및 초기화
        List<MenuItem> menuItems = new ArrayList<>();

        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        System.out.println("[ SHAKESHACK MENU ]");
        menuItems.add(new MenuItem("1. ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("2. SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("3. Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("4. Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // Scanner 선언
        Scanner sc = new Scanner(System.in);

        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        for(MenuItem menuItem : menuItems) {
            System.out.println(menuItem.getName() + " | W " + menuItem.getPrice() + " | " + menuItem.getDescription());
        }


        boolean flag = false;
        while (flag == false) {
            // 숫자를 입력 받기
            System.out.print("원하시는 버거의 번호를 입력하세요(0을 입력시 종료 됩니다.): ");
            int choice = sc.nextInt();
            // 입력된 숫자에 따른 처리
            switch (choice) {
                case 1:
                    menuItems.get(0).printSelectedMenu();
                    break;
                case 2:
                    menuItems.get(1).printSelectedMenu();
                    break;
                case 3:
                    menuItems.get(2).printSelectedMenu();
                    break;
                case 4:
                    menuItems.get(3).printSelectedMenu();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    flag = true;
                    break;
            }


        }




    }
}
