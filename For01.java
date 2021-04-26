public class For01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i += 1) {
            System.out.println("현재 반복 횟수: " + i);
        }

        System.out.println("\n");

        // 구구단 프로그램을 작성하라.

        // 2단부터 9단까지
        for (int i = 2; i < 10; i += 1) {
            // 1부터 9까지
            System.out.println(i + "단");
            for (int j = 1; j < 10; j += 1) {
                int multipleNumber = i * j;
                System.out.println(i + " * " + j + " = " + multipleNumber);
            }
        }
        System.out.println("구구단을 마칩니다.");
    }
}