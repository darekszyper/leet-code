import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    // Print numbers from 1 to 100. If the number is divisible by 3, print "A".
    // If it is divisible by 5, print "B". If it is divisible by both 3 and 5, print "AB".
    // Otherwise, print the number.

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) result.add("AB");
            else if (i % 3 == 0) result.add("A");
            else if (i % 5 == 0) result.add("B");
            else result.add(String.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> array = fizzBuzz(100);
        System.out.println(array);
    }
}
