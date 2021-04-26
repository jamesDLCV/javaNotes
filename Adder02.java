import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Adder02 {
    public static void main(String[] args) {
        // 연습 문제
        // 두 정수를 입력받아서 더한 결과를 출력한다.
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 개의 정수를 입력받아 더한 결과를 출력합니다.");
        System.out.println("첫 번째 정수를 입력하세요:");

        String numberInput01 = scanner.nextLine();

        try {
            int intNumber01 = Integer.parseInt(numberInput01);
            System.out.println("두 번째 정수를 입력하세요:");
            String numberInput02 = scanner.nextLine();

            try {
                int intNumber02 = Integer.parseInt(numberInput02);
                int sum = intNumber01 + intNumber02;
                System.out.println("두 정수의 합은 " + sum + "입니다.");
            } catch (Exception e) {
                System.out.println("순순히 숫자를 입력한다면");
                System.out.println("유혈 사태는 일어나지 않을 겁니다.");
                System.out.println("입력 값 = " + numberInput02);
            }
        } catch (Exception e) {
            System.out.println("순순히 숫자를 입력한다면");
            System.out.println("유혈 사태는 일어나지 않을 겁니다.");
            System.out.println("입력 값 = " + numberInput01);
        }

        System.out.println("합산을 마치겠습니다.");
   }
}
