public class GoodVariableName {
    public static void main(String[] args) {
        // 좋은 변수명이다. a, b로 하지 말라.
        int age = 17;
        int ageAfter10Years = age + 10;
        System.out.println(ageAfter10Years);
    }
}

/* 좋은 변수명
1. 첫 글자는 영문 소문자를 권장, int age (o), int Age(X), int _age(x)
2. int pageNumber (o), int page_number (x)
 */
/*
1. 대소 문자를 구분한다. age와 aGe는 다른 변수이다.
2. 의미를 명확히 하는 선에서 가능한 짧은 단어를 사용.
3. camel case 표기법 사용을 권장한다.
    int searchResult(o)
4. 다른 용도로 사용하고 있는 키워드(예약어, reserved words)는 변수명으로 사용할 수 없다.
    eg) boolean, break, byte, case, char, class, const, continue etc......
 */

