import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        String a = "치킨";
        Scanner scanner = new Scanner(System.in);

        System.out.println("a에는 '치킨'이 입력돼 있다. ");
        System.out.println("b에도 '치킨'을 입력해서 a와 b를 비교해 보자.");
        System.out.println("b를 입력하라:");
        String b = scanner.nextLine();

        System.out.println("a = b " + (a == b));
        // false 가 뜬다.
        // 왜냐? 자바에서는 단순히 글자가 같다고 같다고 판단하지 않는다.
        // equals를 사용해야 한다.

        System.out.println("a.equals(b) " + a.equals(b));
    }
}

// 자바에서는 문자열과 같은 비교 연산자를 사용할 때,
// 그 값을 직접 비교하는 것이 아니라,
// 메모리 상에서 그 값이 저장돼 있는 위치를 비교한다.