import java.util.*;

public class listExample02 {
    public static void main(String[] args) {
        // 문자열을 입력 받아서,
        // 중복되지 않는 문자열만 입력한 후에,
        // 프로그램이 종료될 때, 이 목록을 출력해 주는 코드를 짜 보자.

        System.out.println("저장할 음식 이름 입력. (종료:0)");
        List<String> foods = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String food = scanner.nextLine();

            if (food.equals("0")) {
                break;
            }

            if (foods.contains(food)) {
                System.out.println("이미 목록에 있습니다.");
            } else {
                foods.add(food);
            }
        }

        // 0이 입력되어 while문을 탈출했으므로, 목록을 출력한다.
        System.out.println("입력 순으로 출력하라.");
        System.out.println(foods);

        // 리스트 정렬, 오름차순
        Collections.sort(foods);
        System.out.println("오름차순 정렬 후 출력하라.");
        System.out.println(foods);

        // 리스트 정렬, 내림차순 -> 오름차순으로 정렬한 후 reverse로 뒤집는다.
        Collections.reverse(foods);
        System.out.println("내림차순으로 정렬 후 출력하라.");
        System.out.println(foods);

        // Collections가 제공하는 유용한 메서드 중에 목록을 랜덤하게 섞는 메서드가 있다.
        Collections.shuffle(foods);
        System.out.println("랜덤한 순서로 정렬하라.");
        System.out.println(foods);

        // 랜덤하게 음식을 추천받아 보자.
        // shuffle()로 섞은 후 get()으로 특정 인덱스를 추천받는다.

        System.out.println("점심 추천 메뉴: " + foods.get(0));
    }
}
