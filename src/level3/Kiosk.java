package level3;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    private ArrayList<MenuItem> items;

    public Kiosk(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public void start () {
        Scanner sc = new Scanner(System.in);
        MenuItem menuItem = new MenuItem();
        boolean flag = false;
        while (flag == false) {
            // 숫자를 입력 받기
            System.out.print("원하시는 버거의 번호를 입력하세요(0을 입력시 종료 됩니다.): ");
            int choice = sc.nextInt();
            // 입력된 숫자에 따른 처리
            switch (choice) {
                case 1:
                    System.out.println("1번 ShackBurger를 선택하셨습니다.");
                    break;
                case 2:
                    System.out.println("2번 ShackBurger를 선택하셨습니다.");
                    break;
                case 3:
                    System.out.println("3번 ShackBurger를 선택하셨습니다.");
                    break;
                case 4:
                    System.out.println("4번 ShackBurger를 선택하셨습니다.");
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    flag = true;
                    break;
            }


        }
    }

}
