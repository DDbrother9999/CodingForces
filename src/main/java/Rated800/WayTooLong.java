//package Rated800;

import java.util.Scanner;

public class WayTooLong {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        String word = null;
        for (int i = 0; i <= length; i++){
            word = input.nextLine();
            if (word.length()>10){
                int midlength = word.length()-2;
                System.out.print(word.charAt(0));
                System.out.print(midlength);
                System.out.println(word.charAt(word.length()-1));
                //System.out.println(word.charAt(0)+midlength+word.charAt(word.length()-1));
            }
            else {
                System.out.println(word);
            }
        }
    }
}