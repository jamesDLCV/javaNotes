public class Hungry {
    public static void main(String[] args) {
        int money = 6500;

        // 아래 조건문 블럭들은 모두 배타적으로 실행된다.
        if (money >= 8000) {
            System.out.println("순댓국을 먹었다.");
        } else if (money >= 5000) {
            System.out.println("스테이크를 먹었다. 맛있다.");
        } else {
            System.out.println("ㅠㅠㅠㅠㅠ 배 고프다.");
        }
    }
}
