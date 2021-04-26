import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class PasswordInput01 {
    public static void main(String[] args) {
        String password = "abc";

        Scanner scanner = new Scanner(System.in);

        System.out.println("비밀 번호를 입력해 주세요:");
        String inputPassword = scanner.nextLine();

        while (inputPassword.equals(password) != true) {
            System.out.println("비밀 번호가 틀렸습니다.");
            System.out.println("비밀 번호를 입력해 주세요:");
            inputPassword = scanner.nextLine();
        }

        System.out.println("올바를 비밀 번호를 입력했습니다.");
    }
}

// while문에서는 위와 같이 중복된 코드가 종종 등장한다.
// inputPassword를 while문 안에서도 다시 받고 있다.
// 그래서 나온 것이 do-while문이다.