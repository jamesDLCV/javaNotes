import java.util.Scanner;

public class PriceOfFoods02 {
    public static void main(String[] args) {
        System.out.println("메뉴 번호를 입력해 주세요. ");
        System.out.println("1. 치킨");
        System.out.println("2. 순댓국");
        System.out.println("3. 한우 스테이크");

        Scanner scanner = new Scanner(System.in);
        int menuNumber;

        try {
            menuNumber = scanner.nextInt();
        } catch (Exception e) {
            menuNumber = -1;
        }

        switch (menuNumber) {
            case 1:
                System.out.println("치킨은 5000원입니다.");
                break;
            case 2:
                System.out.println("순댓국은 8000원입니다.");
                break;
            case 3:
                System.out.println("한우 스테이크는 7000원입니다.");
                break;
            default:
                System.out.println("올바른 메뉴 번호를 입력해 주세요.");
                break;
        }
    }
}
