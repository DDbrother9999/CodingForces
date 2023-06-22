package Below1001;

import java.util.*;

public class Twins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.nextLine();
        String line = input.nextLine();
        String[] split = line.split("\\s+");
        int[] number = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            number[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(number);
        int sum = 0;
        for (int j : number) {
            sum += j;
        }
        sum = sum/2;
        int fin = 0;
        for (int i = number.length - 1; i >= 0; i--) {
            int n = number[i];
            fin = fin+n;
            if (fin>sum){
                System.out.println(num-i);
                break;
            }
        }

    }
}