import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionLoopExample {
    public static void main(String[] args) {

        // list와 set에서 공통적으로 사용할 수 있는 것을 살펴보자.
        // for each문을 사용해 보자.

        List<String> foods = new ArrayList<>();

        foods.add("chicken");
        foods.add("pizza");
        foods.add("sweet potatos");

        for (String food : foods) {
            System.out.println(food + " 맛있어요.");
        }

//        chicken 맛있어요.
//        pizza 맛있어요.
//        sweet potatos 맛있어요.

        System.out.println("\n");

        // set으로 만들어도 위와 마찬가지의 결과 출력
        Set<String> foods2 = new HashSet<>();

        foods2.add("chicken2");
        foods2.add("pizza2");
        foods2.add("sweet potatos2");

        for (String food : foods2) {
            System.out.println(food + " 맛있어요.");
        }



    }
}
