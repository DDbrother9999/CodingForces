//package Below1001;

import java.util.*;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.nextLine();
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int i = 0; i <num;i++) {
            String line = input.nextLine();
            String[] split = line.split("\\s+");

            int a = Integer.parseInt(split[0]);
            sum1 = sum1 + a;
            //System.out.println(a);

            int b = Integer.parseInt(split[1]);
            sum2 = sum2 + b;
            //System.out.println(b);

            int c = Integer.parseInt(split[2]);
            sum3 = sum3 + c;
            //System.out.println(c);
        }
        //System.out.println(sum);
        if (sum1 ==0 && sum2==0 && sum3==0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
