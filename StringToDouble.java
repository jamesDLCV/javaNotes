import java.util.Scanner;

public class StringToDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("달러 환율을 입력하세요.");
        String exchangeString = scanner.nextLine();

        System.out.println("순댓국 값을 입력하세요.");
        String priceOfSoupString = scanner.nextLine();

        double exchange = Double.parseDouble(exchangeString);
        double priceOfSoup = Double.parseDouble(priceOfSoupString);

        System.out.println("순댓국은 " + priceOfSoup / exchange + "달러입니다.");
        //        달러 환율을 입력하세요.
        //        1200
        //        순댓국 값을 입력하세요.
        //        8500
        //        순댓국은 7.083333333333333달러입니다.
    }
}
