import java.util.Scanner;

public class Input06 {
    public static void main(String[] args) {
        System.out.println("숫자를 하나 입력해 주세요.");
        Scanner scanner = new Scanner(System.in);
        String intInput = scanner.nextLine();
        System.out.println(intInput + 1);
        // 15
        // 151
        // <- 문자열끼리의 연산이다.

        int intValue = Integer.parseInt(intInput);
        System.out.println(intValue + 1);
        // 입력 15
        // 출력 16

    }
}
