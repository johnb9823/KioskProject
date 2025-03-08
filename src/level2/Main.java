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
        //menuItems.add("chessberger") 실수하는 부분
//        이게 가능한 이유는 자바의 객체 생성과 메서드 호출 방식에 관련된 특징 덕분입니다.
//        객체 생성: 자바에서는 객체를 생성할 때 new 키워드를 사용합니다.
//        예를 들어, new MyClass("example")는 MyClass라는 클래스의 새로운 객체를 생성하면서
//        생성자의 매개변수로 "example" 값을 전달합니다. 이 객체는 생성과 동시에 초기화됩니다.
//        메서드 호출: add() 메서드는 객체를 인자로 받습니다. 예를 들어, add(new MyClass("example"))에서
//        new MyClass("example")는 그 자리에서 즉시 객체를 생성하여 add() 메서드에 전달하는 방식입니다.
//        new MyClass("example")는 객체가 생성되는 순간 그 객체를 바로 메서드의 인자로 넘겨주는 것입니다.
//        이 방식이 가능한 이유는, 자바는 객체 생성식(즉, new MyClass(...))을 표현식(expression)으로 취급하기 때문입니다.
//        자바에서 표현식은 값으로 평가될 수 있기 때문에, 객체를 생성하는 표현식을 메서드 호출의 인자로 넘기는 것이 가능합니다.
//        간단히 말해, 자바에서 객체 생성은 표현식으로 취급되며, 이 표현식을 메서드의 인자 자리에 넣을 수 있기 때문에, 객체를 새로 생성한 후 그 객체를 메서드에 넘기는 것이 가능합니다.

        // Scanner 선언
        Scanner sc = new Scanner(System.in);

        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
        for(MenuItem menuItem : menuItems) {
            System.out.println(menuItem.getName() + " | W " + menuItem.getPrice() + " | " + menuItem.getDescription());
        }

        // 프로그램을 종료
        // 선택한 메뉴 : 이름, 가격, 설명

        boolean flag = false;
        while (flag == false) {
            // 숫자를 입력 받기
            System.out.print("원하시는 버거의 번호를 입력하세요(0을 입력시 종료 됩니다.): ");
            int choice = sc.nextInt();
            // 입력된 숫자에 따른 처리
            switch (choice) {
                case 1:
                    //MenuItem 클래스의 객체를 생성하지 않아서
                    //menuItems.printSelectedMenu() 메소드에 접근하지 못했음
                    // 리스트 함수 get(인덱스 넘버)을 통해서 접근하는 방법을 터득함
                    //menuItems.printSelectedMenu(); (첫번째 시도)
                    //menuItems.get(0); //아무것도 안 나오고 또 원하는 번호를 입력하라고 함 (두번째 시도)
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
