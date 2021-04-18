import java.util.Random;

public class RandomInteger {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(256);
        System.out.println(randomNumber);

        // while문으로 50개의 난수를 생성,
        int i = 0;
        while (i < 50) {
            int randomNumber2 = random.nextInt(256);
            System.out.println(randomNumber2);
            ++i;
        }
    }
}
