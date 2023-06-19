import java.util.Scanner;

public class FirstFactorial {

//    public static int firstFactorial(int num) {
//        switch (num) {
//            case 2:
//                return 2;
//            case 1:
//            case 0:
//                return 1;
//            default:
//                return num * firstFactorial(num - 1);
//        }
//        if (num == 2) return 2;
//        if (num == 1) return 1;
//        if (num == 0) return 1;
//        return num * firstFactorial(num - 1);
//    }

    public static int firstFactorial(int num) {
        return (num == 1 ? 1 : num * firstFactorial(num - 1));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(firstFactorial(s.nextInt()));
    }
}
