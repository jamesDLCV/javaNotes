public class For02 {
    public static void main(String[] args) {
        /* 
        반복 0 시작
        반복 0 끝
        반복 1 시작
        반복 1 끝
        반복 2 시작
        반복 2 끝
        반복 3 시작
        
        for문으로 break를 써서 위와 같이 출력되게 프로그램을 짜라.
        */
        
        for (int i = 0; i < 10; i += 1) {
            System.out.println("반복 " + i + " 시작");
            
            if (i == 3) {
                break;
            }

            System.out.println("반복 " + i + " 끝");
        } 
    }
}