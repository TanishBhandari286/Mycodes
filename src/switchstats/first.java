package switchstats;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "mango" -> System.out.println("king of all fruits");
            case "banana" -> System.out.println("Yellow fruit");
            case "guava" -> System.out.println("my fav fruit");
            default -> System.out.println("enter a valid fruit");
        }

    }
    }
