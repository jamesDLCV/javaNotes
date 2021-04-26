public class WhileBreak01 {
    public static void main(String[] args) {

        /* 반복문 진입
           반복문 끝
           반복문 진입
           반복문 끝
           반복문 진입

        위와 같이 출력되게 하라.
         */

        int i = 0;
        
        while (true) {
            System.out.println("반복문 진입");
            
            if (i == 2) {
                break;
            }
            
            i += 1;
            System.out.println("반복문 끝");
        }
    }
}
