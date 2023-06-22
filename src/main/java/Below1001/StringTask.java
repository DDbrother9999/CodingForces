//package Below1001;

import java.util.*;
public class StringTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        line = line.toLowerCase();
        String replaced = line.replaceAll("[aoyeui]", "");
        String[] fin = replaced.split("");
        StringBuilder returned = new StringBuilder();
        for (String s : fin) {
            returned.append(".").append(s);
        }
        System.out.println(returned);
    }
}

