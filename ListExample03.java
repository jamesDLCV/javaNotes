import java.util.*;

public class ListExample03 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        // add로 요소를 추가하면, 아래와 같이 작성해야 한다.
        names.add("정동원");
        names.add("장민호");
        names.add("임영웅");
        names.add("이찬원");

        System.out.println(names);

        // 위와 같이 목록을 일일이 입력하는 것보다 좀 더 편하게 목록을 작성할 수 있다.
        // Arrays에서 제공하는 asList() 메소드를 활용하는 방법이 있다.
        // 그 중 하나의 방법은 배열을 리스트로 만드는 것이다. 두 가지 방법이 있다.
        // 이렇게 요소를 인자로 넣어주는 방법이 하나 있고,
        List<String> names2 = Arrays.asList("정동원", "장민호", "임영웅", "이찬원");
        System.out.println(names2);

        // asList()의 인자로 배열 변수를 넣어주는 방법이 있다.
   }
}
