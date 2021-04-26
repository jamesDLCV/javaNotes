import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        // 연습 문제
        // 두 정수를 입력받아서 더한 결과를 출력한다.
        Scanner scanner = new Scanner(System.in);

        System.out.println("두 개의 정수를 입력받아 더한 결과를 출력합니다.");
        System.out.println("첫 번째 정수를 입력하세요:");

        int intNumber01 = scanner.nextInt();

        System.out.println("두 번째 정수를 입력하세요:");

        int intNumber02 = scanner.nextInt();

        int sum = intNumber01 + intNumber02;

        System.out.println("두 정수의 합은 " + sum + "입니다.");


   }
}
