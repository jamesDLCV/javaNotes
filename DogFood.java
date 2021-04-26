import java.util.Scanner;

public class DogFood {
    public static void main(String[] args) {
        // 연습 문제2 강아지 사료 계산
        // 하루에 강아지 몸무게 1kg당 10g의 사료를 제공

        int foodPerKg = 10;
        Scanner scanner = new Scanner(System.in);

        System.out.println("강아지 몸무게를 입력하세요: (kg 단위)");
        String dogWeight = scanner.nextLine();

        try {
            float DogWeight = Float.parseFloat(dogWeight);
            float foodPerDay = DogWeight * foodPerKg;
            System.out.println("하루에 필요한 사료량은 " + foodPerDay + "g입니다.");
        } catch (Exception e) {
            System.out.println("몸무게는 숫자로 이뤄져 있습니다.");
            System.out.println("숫자를 입력해 주세요.");
        }
    }
}
