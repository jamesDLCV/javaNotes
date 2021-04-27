public class Continue02 {
    public static void main(String[] args) {

        // 0부터 10까지 숫자 중에서 홀수만 출력하라

        for (int i = 0; i < 11; i += 1) {
            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i);
        }
    }
}
