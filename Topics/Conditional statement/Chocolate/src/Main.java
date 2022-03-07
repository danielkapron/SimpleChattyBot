import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        boolean afterDivisonMustBe0 = k % n == 0 || k % m == 0;
        boolean cantBeMoreThanMultiplicationOfBothSides = k < n * m;


        if (afterDivisonMustBe0 && cantBeMoreThanMultiplicationOfBothSides) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}