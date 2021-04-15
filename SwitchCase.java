public class SwitchCase {
    public static void main(String[] args) {
        int month = 5;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Fabruary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;

            // 일치하는 값이 없을 경우
            default:
                System.out.println("번역할 수 없음, 일치하는 값이 없음.");
        }
    }
}
