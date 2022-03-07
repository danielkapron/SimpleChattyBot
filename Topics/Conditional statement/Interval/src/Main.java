import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        // (−15,12] ∪ (14,17) ∪ [19,+∞)
        // () are exclusive;
        // [] are inclusive.
        // True if fits, False if no

        int integer = scanner.nextInt();

        if (integer > -15 && integer <= 12) {
            System.out.println("True");
        } else if (integer > 14 && integer < 17) {
            System.out.println("True");
        } else if (integer >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}