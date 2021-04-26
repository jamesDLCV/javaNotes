import java.util.Scanner;

public class Exeption01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요:");
        String numberInput = scanner.nextLine();

        try {
            int number  = Integer.parseInt(numberInput);
            number += 1;
            System.out.println("다음 숫자는 " + number + "입니다.");
        } catch (Exception e) {
            System.out.println("순순히 숫자를 입력한다면");
            System.out.println("유혈 사태는 일어나지 않을 겁니다.");
            System.out.println("입력 값 = " + numberInput);
        }
    }
}
