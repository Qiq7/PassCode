package Practice;

import java.util.Random;

public class Mytext01 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            System.out.println(random.nextInt(100)%2);
        }
    }
}
