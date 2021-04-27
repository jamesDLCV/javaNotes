public class ForBreak01 {
    public static void main(String[] args) {
        
        /* 반복문 진입
           반복문 끝
           반복문 진입
           반복문 끝
           반복문 진입

        For문으로 위와 같이 출력되게 하라.
        */
        
        for (int i = 0; i < 10; i += 1) {
            System.out.println("반복문 진입");
            
            if (i == 2) {
                break;
            }
            System.out.println("반복문 끝");
        }
    }
}
