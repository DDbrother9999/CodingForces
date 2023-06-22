//package Below1001;

import java.util.*;

public class Dubstep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();

        String replaced = line.replaceAll("(WUB)+", " ").trim();

        System.out.println(replaced);
    }
}
