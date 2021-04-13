public class StringExample {
    public static void main(String[] args) {
        // 문자열
        System.out.println("I am String");
        // 문자
        System.out.println('I');
        // back slash
        System.out.println("안녕 나는 \"자바\"야.");
        // 줄 바꿈
        System.out.println("치킨은 살 안 쪄요. \n살은 내가 쩌요.");
        System.out.println("\n\n");

        // 문자열 변수

        String chicken = "치킨은 살 안 쪄요.";
        String me = "살은 내가 쪄요.";

        System.out.println(chicken);
        System.out.println(me);

        System.out.println(chicken + ' ' + me);

        // 문자열 연결하기
        String chickenAndMe1 = chicken + me;
        String chickenAndMe2 = chicken + ' ' + me;

        System.out.println(chickenAndMe1);
        System.out.println(chickenAndMe2);
        System.out.println('\n');

        // 문자열의 글자 수 세기
        // stringName.length();
        System.out.println(me.length());    // 9, 공백도 한 글자로 친다.

        int length = me.length();           // me.length()가 9를 반환하게 되고 반환된 9는
                                            // 정수형 변수 length에 대입된다.
        System.out.println(length);

        // 문자열 바꾸기
        // stringName.replaceAll("바꿀 문자열", "새 문자열");

        System.out.println(me.replaceAll("내가", "치킨이"));

        String meReplaced = me.replaceAll("치킨이", "내가");
        System.out.println(meReplaced);
        System.out.println('\n');

        // 문자열 자르기기
        String birthday = "1970/01/01";
        String year = birthday.substring(0, 4);     // 끝 위치는 포함되지 않는다.
        String day = birthday.substring(8);         // 시작 위치 8부터 끝까지.

        System.out.println(year);
        System.out.println(day);

        // 논리형 boolean은 다른 클래스에서

   }
}
