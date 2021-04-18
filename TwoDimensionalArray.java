import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        String[][] days = {
            {"Monday", "Tuesday", "Wednesday", "Tursday", "Friday", "Saturday", "Sunday"},
            {"Monday", "Tuesday", "Wednesday", "Tursday", "Friday", "Saturday", "Sunday"},
            {"월", "화", "수", "목", "금", "토", "일"},
        };
        System.out.println(Arrays.toString(days[0]));
        System.out.println(Arrays.toString(days[1]));
        System.out.println(Arrays.toString(days[2]));

        System.out.println(days[2][6]);

        System.out.println(Arrays.toString(days));

        for (int i = 0; i < days.length; ++i) {
            System.out.println(Arrays.toString(days[i]));
        }
    }
}
