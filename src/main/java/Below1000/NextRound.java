//package Rated800;
import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ppl = input.nextInt();
        int num = input.nextInt();
        int fin = 0;

        input.nextLine();

        String line = input.nextLine();
        String[] split = line.split("\\s+");
        int n = Integer.parseInt(split[num - 1]);

        for (String s : split) {
            int val = Integer.parseInt(s);
            if (val > 0 && val >= n) {
                fin++;
            }
        }
        System.out.println(fin);
    }
}