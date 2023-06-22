//package Below1001;
import java.util.*;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long m = input.nextLong();
        long a = input.nextLong();
        long x = findNextMultiple(n,a);
        long y = findNextMultiple(m,a);
        //System.out.println(x);
        //System.out.println(y);
        System.out.println(Math.max((x * y) / (a * a), 1));
    }
    public static long findNextMultiple(long currentNumber, long divisor) {
        if (currentNumber % divisor ==0){
            return currentNumber;
        }
        long remainder = currentNumber % divisor;
        long nextMultiple = currentNumber + (divisor - remainder);

        return nextMultiple;
    }
}
