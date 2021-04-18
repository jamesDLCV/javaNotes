import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Tursday", "Friday", "Saturday", "Sunday"};

        // 이상한 문자가 출력된다.
        System.out.println(days);

        // for문 없이 배열의 내용물을 출력하기
        System.out.println(Arrays.toString(days));

    }
}
