public class WhileBreak02 {
    public static void main(String[] args) {

        /* 반복 0 시작
           반복 0 끝
           반복 1 시작
           반복 1 끝
           반복 2 시작
           반복 2 끝
           반복 3 시작

        while문으로 위와 같이 출력되게 하라.
         */

        int i = 0;
        
        while (true) {
            System.out.println("반복 " + i + " 시작");
            
            if (i == 3) {
                break;
            }

            System.out.println("반복 " + i + " 끝");

            i += 1;
        }
    }
}
