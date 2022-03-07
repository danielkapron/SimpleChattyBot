import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int soldiers = scanner.nextInt();

        if (soldiers < 1) {
            System.out.println("no army");
        } else if (soldiers <= 19) {
            System.out.println("pack");
        } else if (soldiers <= 249) {
            System.out.println("throng");
        } else if (soldiers <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}