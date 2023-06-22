//package Below1001;
import java.util.regex.*;
import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        Pattern pattern = Pattern.compile("(0{7})|(1{7})");
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}