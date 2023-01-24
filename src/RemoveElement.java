import org.w3c.dom.ranges.Range;

public class RemoveElement {


    public static void main(String[] args) {
        int i = 1;

        while (i <= 100) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("AB");
            } else if (i % 3 == 0) {
                System.out.println("A");
            } else if (i % 5 == 0) {
                System.out.println("B");
            } else
                System.out.println(i);

            i++;
        }
    }
}
