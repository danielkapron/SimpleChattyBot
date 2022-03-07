import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value

        int reeses = scanner.nextInt();
        boolean isItWeekend = scanner.nextBoolean();

        boolean partyOnWeekDays = !isItWeekend && reeses <= 20 && reeses >= 10;
        boolean partyOnWeekend = isItWeekend && reeses <= 25 && reeses >= 15;
        boolean wasPartySuccessful = partyOnWeekend || partyOnWeekDays;

        System.out.println(wasPartySuccessful);
    }
}