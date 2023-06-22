//package Below1001;

import java.util.*;

public class GravityFlip {
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
        Arrays.sort(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }
            }
        }
