//package Rated800;
import java.util.Objects;
import java.util.Scanner;
public class Team {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sure = 0;
        for (int i = 0; i <= num; i++){
            String line = input.nextLine();
            String[] split = line.split("\\s+");
            int n = 0;
            for (String value: split){
                if (Objects.equals(value,"1")){
                    n++;
                }
            }
            if (n >=2){
                sure++;
            }

        }
        System.out.println(sure);
    }
}