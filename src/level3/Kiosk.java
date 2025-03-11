package level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private ArrayList<MenuItem> menuItems =new ArrayList<>();

    public Kiosk(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void start () {
        System.out.println("[ SHAKESHACK MENU ]");
        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        for(MenuItem menuItem : menuItems) {
            System.out.println(menuItem.getName() + " | W " + menuItem.getPrice() + " | " + menuItem.getDescription());
        }

        Scanner sc = new Scanner(System.in);

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
