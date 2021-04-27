import java.util.Scanner;

public class WhileBreak02_password {
    public static void main(String[] args) {
        String password = "abc";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("비밀 번호를 입력해 주세요:");
            String inputPassword = scanner.nextLine();

            if (inputPassword.equals(password)) {
                System.out.println("비밀 번호가 일치합니다.");
                break;
            }

            System.out.println("비밀 번호가 틀렸습니다.");
        }

    }
}
