public class Continue03 {
    public static void main(String[] args) {

        // 0부터 10까지 숫자 중에서 홀수만 출력하라
        // while문으로 작성하라.

        int i = 0;
        while (i < 11) {
            if (i % 2 == 0) {
                i += 1;
                continue;
            }

            System.out.println(i);
            i += 1;
        }
    }
}
