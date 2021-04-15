import java.util.Scanner;

public class Hungry02 {
    public static void main(String[] args) {
        System.out.println("얼마를 가지고 있어요? (액수만 입력)");
        Scanner scanner = new Scanner(System.in);
        String intInput = scanner.nextLine();

        try {
            int intValue = Integer.parseInt(intInput);
            if (intValue >= 8000) {
                System.out.println("순댓국 한 그릇을 먹었어요. 배 부르다.");
            } else {
                System.out.println("순댓국을 먹기에는 돈이 부족해요.");
            }

        } catch (Exception e) {
            System.out.println("가지고 있는 돈의 액수 즉, 숫자를 입력하세요.");
        }
    }
}
