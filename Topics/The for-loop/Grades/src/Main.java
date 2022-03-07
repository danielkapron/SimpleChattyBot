import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int n = scanner.nextInt();
        String[] grades = new String[n + 1];
        int numberOfDs = 0;
        int numberOfCs = 0;
        int numberOfBs = 0;
        int numberOfAs = 0;

        for (int i = 0; i <= n; i++) {
            grades[i] = scanner.nextLine();
            if ("D".equals(grades[i])) {
                numberOfDs++;
            } else if ("C".equals(grades[i])) {
                numberOfCs++;
            } else if ("B".equals(grades[i])) {
                numberOfBs++;
            } else if ("A".equals(grades[i])) {
                numberOfAs++;
            }
        }
        System.out.println(numberOfDs + " " + numberOfCs + " " + numberOfBs + " " + numberOfAs);

    }
}