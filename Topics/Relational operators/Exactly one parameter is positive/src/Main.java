import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean isAPositive = a > 0;
        boolean isBPositive = b > 0;
        boolean isCPositive = c > 0;

        boolean isFirstOnePositive = isAPositive && !isBPositive && !isCPositive;
        boolean isSecondOnePositive = !isAPositive && isBPositive && !isCPositive;
        boolean isThirdOnePositive = !isAPositive && !isBPositive && isCPositive;

        boolean isOnePositive = isFirstOnePositive || isSecondOnePositive || isThirdOnePositive;

        System.out.println(isOnePositive);

    }
}