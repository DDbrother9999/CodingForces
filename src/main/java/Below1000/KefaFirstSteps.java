//package Below1000;

import java.util.*;

public class KefaFirstSteps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String line = input.nextLine();
        String[] split = line.split("\\s+");
        int[] number = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            number[i] = Integer.parseInt(split[i]);
        }
        int fin = 0;
        int num = 0;
        for (int l = 0; l < n - 1; l++) {
            if (number[l] <= number[l + 1]) {
                fin++;
            } else {
                if (fin > num) {
                    num = fin;
                }
                fin = 0;
            }
        }
        if (fin > num) {
            num = fin;
        }
        System.out.println(num+1);
    }
}
