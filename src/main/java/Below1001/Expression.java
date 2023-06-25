//package Below1001;

import java.util.*;

public class Expression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println(Math.max(Math.max(((a + b) * c), (a * (b + c))), Math.max((a * b * c), (a + b + c))));
        //Bro that was so simple O-o I wrote an entire fucking 20 lines trynna to do what this one line can do lmao bruhhhh
    }
}

