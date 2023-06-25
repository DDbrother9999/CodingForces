//package Below1001;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LuckyDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean fin = false;
        for (int i = 1; i<=num;i++){
            if (num % i ==0){
                String toString = String.valueOf(i);
                Pattern pattern = Pattern.compile("^[47]+$");
                Matcher matcher = pattern.matcher(toString);
                if (matcher.find()){
                    fin = true;
                }
                }
            }
        if (fin){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        }
    }

