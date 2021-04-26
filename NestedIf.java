import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {

        // 십대인지 아닌지 판단하는 프로그램을 짜 보라.
        // 중첩 if를 사용해 보자.

        Scanner scanner = new Scanner(System.in);

        System.out.println("당신이 십대인지 아닌지 판단해 드리겠습니다.");

        while (true) {
            System.out.println("당신의 나이를 입력하세요: (종료: 0)");
            String ageInput = scanner.nextLine();

            try {
                int intAgeInput = Integer.parseInt(ageInput);
                if (intAgeInput >= 10) {
                    if (intAgeInput < 20) {
                        System.out.println("당신은 10대입니다.\n");
                    } else if (intAgeInput <= 120) {
                        System.out.println("당신은 10대가 아닙니다.\n");
                    } else {
                        System.out.println("인간의 나이를 초과했습니다.");
                        System.out.println("당신은 인간이 아닌 신선일 겁니다.\n");
                    }
                } else if (intAgeInput > 0){
                    System.out.println("당신은 어린이입니다.\n");
                } else if (intAgeInput == 0) {
                    System.out.println("종료하겠습니다.");;
                    break;
                } else {
                    System.out.println("나이는 양수입니다.\n");
                }
            } catch (Exception e) {
                System.out.println("나이는 숫자입니다. 숫자를 입력해 주세요");
            }
        }
    }
}
