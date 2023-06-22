//package Below1001;

import java.util.*;
import java.util.regex.*;
public class ChatRoom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        Pattern pattern = Pattern.compile("h.*e.*l.*l.*o");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}