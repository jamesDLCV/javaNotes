public class ArrayPrintOut02 {
    public static void main(String[] args) {
        String[] days = {"mon", "tues", "wednes", "thurs", "fri", "satur", "sun"};

        days[0] = "SuperMon";

        for (int i = 0; i < days.length; ++i) {
            System.out.println(days[i] + "day");
        }
    }
}
