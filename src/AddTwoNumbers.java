import java.math.BigInteger;
import java.util.Iterator;
import java.util.LinkedList;

public class AddTwoNumbers {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger numberA = new BigInteger("0");
        BigInteger numberB = new BigInteger("0");
        BigInteger multiplier = new BigInteger("1");
        ListNode fakeHead = new ListNode(0);
        ListNode current = fakeHead;

        while (l1 != null) {
            BigInteger bigInteger = new BigInteger(String.valueOf(l1.val));
            numberA = numberA.add(bigInteger.multiply(multiplier));
            multiplier = multiplier.multiply(new BigInteger("10"));
            l1 = l1.next;
        }


        multiplier = new BigInteger("1");

        while (l2 != null) {
            BigInteger bigInteger = new BigInteger(String.valueOf(l2.val));
            numberA = numberA.add(bigInteger.multiply(multiplier));
            multiplier = multiplier.multiply(new BigInteger("10"));
            l2 = l2.next;
        }

        BigInteger result = numberA.add(numberB);

        String stringResult = result.toString();

        for (int i = stringResult.length() - 1; i >=0; i--){
            current.next= new ListNode(Character.getNumericValue(stringResult.charAt(i)));
            current = current.next;
        }
        return fakeHead.next;
    }


}
