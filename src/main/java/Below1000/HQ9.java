//package Below1000;

import java.util.*;
import java.util.regex.*;
public class HQ9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        Pattern pattern = Pattern.compile("[HQ9]");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}