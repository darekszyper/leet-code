public class InterviewArrayChallenge {
    // Take the arr parameter being passed which will be an array of integers and determine the smallest
    // positive integer (including 0) that can be added to the array to make the sum of all the numbers
    // in the array add up to the next closest Fibonacci number. For example: if arr is [15, 1, 3],
    // then your program should output 2 because if you add up 15 + 1 + 3 + 2 you get 21 which is the
    // closest Fibonacci number. (Example input: [1, 20, 2, 5], output: 6)

    public static int closestFibonacciNumber(int[] arr) {
        int arrSum = 0;

        for (int num : arr) arrSum += num;   // We can also use Arrays.stream(arr).sum()
        if (isFibonacci(arrSum)) return 0;

        int result = 1;
        while (!isFibonacci(arrSum + result)) {
            result++;
        }

        return result;
    }

    public static boolean isFibonacci(int number) {
        if (number == 0 || number == 1) {
            return true;
        }

        return isFibonacciRecursive(number, 0, 1);
    }

    private static boolean isFibonacciRecursive(int number, int a, int b) {
        int nextFibonacci = a + b;
        if (nextFibonacci == number) {
            return true;
        } else if (nextFibonacci > number) {
            return false;
        }

        return isFibonacciRecursive(number, b, nextFibonacci);
    }

    public static void main(String[] args) {
        int[] arr = {1, 20, 2, 5};
        System.out.println(closestFibonacciNumber(arr));
    }
}
