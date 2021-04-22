public class FunctionExample {
    public static void main(String[] args) {
        sayHello();
        sayHelloTo("Chicken");
        
        printSum(3, 5);
        
        int result = sum(2, 4);
        System.out.println(result);
        
        printSum2(3, 5);
        
        int[] sumAndProduct = addAndMultiply(2, 3);
        System.out.println("sum: " + sumAndProduct[0]);
        System.out.println("product: " + sumAndProduct[1]);
        
        sayHola("자바");
        
    }

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void sayHelloTo(String name) {
        System.out.println("Hello, " + name);
    }

    // 메소드의 인자는 매개변수라고도 한다.
    // 매개변수는 여러 개가 될 수도 있다.

    // 1 + 2 = 3의 형태로 덧셈을 출력하라.
    public static void printSum(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    // 두 정수를 더한 값을 반환하라.
    public static int sum(int a, int b) {
        return a + b;
    }

    // sum 메서드를 인자로 사용할 수 있는가? 예스
    public static void printSum2(int a, int b) {
        System.out.println(a + " + " + b + " = " + sum(a, b));
    }

    // 자바에서 반환 값은 하나여야 한다는 제약이 있다.
    // 배열을 이용하면 같은 타입의 값은 여러 개를 반환할 수 있다.
    // 첫 번째로 두 정수를 더한 값을, 두 번째로 두 정수를 곱한 값을 반환한다.
    // 배열의 순서를 외우고 있어야 하므로, 사용하기 좋은 방법은 아니다.
    public static int[] addAndMultiply(int a, int b) {
        int sum = a + b;
        int product = a * b;

        int[] result = {sum, product};

        return result;
    }

    // return이라는 키워드에 대해서 조금 더 살펴보자.
    public static void sayHola(String name) {
        if (name.equals("바보")) {
            System.out.println("바르고 고운 말을 사요해 주세요.");
        } else {
            System.out.println(name + "님, 안녕하세요?");
        }
    }
}
