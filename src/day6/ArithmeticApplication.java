package day6;

import java.util.Random;
import java.util.UUID;

public class ArithmeticApplication {

    public static void main(String[] args) {

        float premium = 25678.01f;

        System.out.println(Math.ceil(premium));
        System.out.println(Math.floor(premium));
        System.out.println(Math.round(premium));

        int max = Math.max(3, 5);
        System.out.println(max);

        double random = Math.random() * 10;
        System.out.println(random);

        String uniqueString = UUID.randomUUID().toString();
        System.out.println(uniqueString);

        System.out.println(Math.signum(-2567845));
    }
}
