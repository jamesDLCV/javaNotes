import java.util.Arrays;

public class ArrayPrintOut04_addArray {
    public static void main(String[] args) {
        String[] days = {"mon", "tues", "wednes", "thurs", "fri", "satur", "sun"};

        String[] days2 = Arrays.copyOf(days, 8);
        days2[7] = "SuperSun";
        for (String day : days2) {
            System.out.println(day + "day");
        }
    }
}
