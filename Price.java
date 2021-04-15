import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        System.out.println("음식 이름을 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String menu = scanner.nextLine();

        switch (menu) {
            case "치킨":
                System.out.println("치킨은 5000원입니다.");
                break;
            case "순댓국":
                System.out.println("순댓국은 8000원입니다.");
                break;
            case "스테이크":
                System.out.println("스테이크는 7000원입니다.");
                break;
            default:
                System.out.println("메뉴에 없는 음식입니다.");
        }
    }
}
