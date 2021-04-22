import java.util.HashSet;
import java.util.Set;

public class CollectionLoopExample03 {
    public static void main(String[] args) {
        Set<String> foods = new HashSet<>();

        foods.add("chicken");
        foods.add("pizza");
        foods.add("sweet potatos");

        // 이 목록이 비었는지 확인해 보자.
        // List와 Set 모두 size()라는 메서드를 가지고 있다.
        // size() 메서드는 List와 Set이 가지고 있는 요소의 개수를 반환한다.
        
        // size가 0이면 "목록이 비어있습니다."를 출력하고, 
        // size가 비어 있지 않으면 "총 00 개의 음식"이라는 메시지를 출력하게 하라. 

        // isEmpty() 메서드를 사용해서 위를 실행해 보자.
        // isEmpty() 메서드는 boolean 값을 반환한다.
        // 목록이 비어 있다면, true 값을 반환한다.

        if (foods.isEmpty()) {
            System.out.println("목록이 비어있습니다.");
        } else {
            System.out.println("총 " + foods.size() + "개의 음식이 있습니다.");
        }

        





    }
}
