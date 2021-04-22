import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        // set과 부모 자식 관계에 있는 HashSet을 사용한다.
        Set<String> myFavoriteFoods = new HashSet<>();
        myFavoriteFoods.add("chicken");
        myFavoriteFoods.add("pizza");
        myFavoriteFoods.add("chicken");

        // set은 중복을 허용하지 않는다.
        System.out.println(myFavoriteFoods);    // [chicken, pizza]

        myFavoriteFoods.remove("chicken");

        System.out.println(myFavoriteFoods);    // [pizza]
    }
}

// list는 순서가 있고, 중복 값을 허용한다.
// set은 순서가 없고, 중복 값을 허용하지 않는다.
// 이러한 특성을 고려하여 list를 쓸지 set을 쓸지 결정한다.
// 주민등록번호와 같이 동일한 번호가 존재하지 않아야 하는 경우에는,
// set을 사용하는 편이 더 좋다.