import java.util.Scanner;

public class PasswordInput02 {
    public static void main(String[] args) {
        String password = "abc";

        Scanner scanner = new Scanner(System.in);
        String inputPassword;       // <- 여기 선언해 줘야 한다.

        do {
            System.out.println("비밀 번호를 입력해 주세요:");
            inputPassword = scanner.nextLine();
        } while (inputPassword.equals(password) != true);

        System.out.println("올바를 비밀 번호를 입력했습니다.");
    }
}

// do-while문에서는 중복된 코드를 입력하지 않아도 된다.