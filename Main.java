package ua.nato.himars;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FakeCryptoGenerator {

    private static final int lenght = 30;
    private static final String chars = "qwertyuiopasdfghjklzxcvbnm";
    private static final String nums = "123456789";
    private static final String symbols = "!@#$%^&**()_+-=<>\"}{:;`~";
    private static final String charsUppercase = chars.toUpperCase();

    public static void main(String... args) {
        while (true) {
            generate();
        }
    }

    private static void generate() {
        // Variables.
        StringBuilder password = new StringBuilder(lenght);
        Random random = new Random(System.nanoTime());
        List<String> charCategories = new ArrayList<>(4);

        charCategories.add(chars);
        charCategories.add(nums);
        charCategories.add(symbols);
        charCategories.add(charsUppercase);

        // Build the fake crypto token.
        for (int i = 0; i < lenght; i++) {
            String charCategory = charCategories.get(random.nextInt(charCategories.size()));
            int position = random.nextInt(charCategory.length());
            password.append(charCategory.charAt(position));
        }

        System.out.println(password.toString());
    }
}
