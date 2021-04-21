import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // add the element to the list.
        list.add("치킨");
        list.add("pizza");
        list.add("noodles");

        // remove the element from the list.
        // remove는 두 가지 사용 방법이 있다.
        // 한 가지 방법은 요소의 이름을 그대로 넣는다.
        list.remove("치킨");

        // 인덱스를 넣는다.
        list.remove(1);

        System.out.println(list);       // [pizza]
                                        // 치킨을 제거했으므로 인덱스 1은 [noodles]가 된다.
        list.add("치킨");
        list.add("pizza");
        list.add("noodles");

        System.out.println("세 개의 요소 새로 추가");
        System.out.println(list);

        // set, 요소 변경
        System.out.println("요소를 변경해 보자.");
        list.set(1, "chicken");

        System.out.println(list);

        // set() method도 범위를 벗어난 인덱스를 입력하면 예외가 발생한다.
        // set(4, "banana"); <-- 범위를 벗어남.

        // list에서 요소 하나만 가져다 쓰기 위해서는 get() 메서드를 사용한다.
        // get()의 인자로 인덱스를 넣어주면, 인덱스에 해당하는 요소를 반환한다.
        System.out.println("get(0)으로 list의 인덱스 0을 반환하여 출력해 보자. ");
        System.out.println(list.get(0));

        // 변수를 선언해도 똑같이 출력이 된다.
        String food01 = list.get(0);
        System.out.println(food01);

        // 치킨은 중복 값을 허용한다.
        System.out.println(list);
        // 현재 list는 [pizza, chicken, pizza, noodles]이다.
        // list에 chicken을 한 번 더 입력해 보자.
        list.add("chicken");
        System.out.println(list);   // [pizza, chicken, pizza, noodles, chicken]
                                    // 마지막 요소에 chicken이 추가되었다.
        System.out.println("\n");

        // 중복 값을 넣고 싶지 않아서 list의 요소를 확인하고 싶다면,
        // 반목문을 사용할 수도 있지만,
        // list가 제공하는 contains() 메서드를 사용하면 더 쉽게 확인할 수 있다.

        boolean containsChicken = list.contains("chicken");
        System.out.println(containsChicken);
    }
}
