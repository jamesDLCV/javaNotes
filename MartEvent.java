public class MartEvent {
    public static void main(String[] args) {
        System.out.println(100 * .15);
        System.out.println(300 * .15);
        System.out.println(1000 * .15);
        System.out.println(10000 * .15);
        System.out.println("\n");

        // 적립금 비율 부분을 변수로 해 주자.
        int ratio;
        ratio = 13;

        System.out.println(100 * ratio / 100.0);
        System.out.println(300 * ratio / 100.0);
        System.out.println(1000 * ratio / 100.0);
        System.out.println(10000 * ratio / 100.0);
    }
}
