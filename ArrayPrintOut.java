public class ArrayPrintOut {
    public static void main(String[] args) {
        String[] days = {"mon", "tues", "wednes", "thurs", "fri", "satur", "sun"};
        int lengthOfDays = days.length;

        for (int i = 0; i < lengthOfDays; ++i) {
            System.out.println(days[i] + "day");
        }
    }
}
