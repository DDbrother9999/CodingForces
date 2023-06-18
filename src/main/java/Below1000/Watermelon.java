//package Rated800;

import java.util.Scanner;
public class Watermelon {
    public static void main(String[] args)
    {
        int i;
        Scanner input = new Scanner(System.in);
        i = input.nextInt();
        if (i>2&&i%2==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}