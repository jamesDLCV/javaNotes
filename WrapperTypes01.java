public class WrapperTypes01 {
    public static void main(String[] args) {
        // 래퍼 wrapper type
        // 지금까지 배운 자료형은 문자열을 제외하면 primitive(원시) 자료형이라고 한다.
        // primitive 자료형은 순수하게 상수 형태로 표현할 수 있는 자료형으로,
        // 자료의 크기에 대한 제약을 가지고 있고,
        // 추가적인 기능은 제공되지 않는다.
        // 숫자형과 논리형의 래퍼 타입을 간단하게 살펴본다.
        // 이런 것이 있다 정도만 기억하고 넘어가면 된다.
        // 각 래퍼 타입은 각 자료형의 앞 글자를 대문자로 사용한다.
        // int는 예외적으로 Integer라고 사용한다.
        // 선언과 할당하는 방법은 다른 primitiave 자료형과 동일하다.

        Integer integerNmuber = 3;
        Long longNumber = 3L;
        Float floatNumber = 3.0f;
        Double doubleNumber = 3.0d;
        Boolean booleanValue = true;

        // 이 자료형의 주요 기능은, 다른 정수형으로 변환해 주거나,
        // 문자열로 변환해 주는 기능이 있는데,
        // 크게 유용한 기능은 없지만 래퍼 타입을 사용할 일이 생길 수 있다.

        float floatNumber2 = integerNmuber.floatValue();        // 3.0f
        double doubleNumber2 = integerNmuber.doubleValue();     // 3.0d
        String stringNumber2 = integerNmuber.toString();        // "3"

        System.out.println(floatNumber2);
        System.out.println(doubleNumber2);
        System.out.println(stringNumber2);

    }
}
