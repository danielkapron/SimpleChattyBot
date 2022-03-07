import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        
        // System.out.println("Please type the number of students in first group");
        int firstGroup = scanner.nextInt();

        //System.out.println("Please type the number of students in second group");
        int secondGroup = scanner.nextInt();

        //System.out.println("Please type the number of students in third group");
        int thirdGroup = scanner.nextInt();

        int desksForFirstGroup = firstGroup % 2 + firstGroup / 2;
        int desksForSecondGroup = secondGroup % 2 + secondGroup / 2;
        int desksForThirdGroup = thirdGroup % 2 + thirdGroup / 2;

        int totalAmountOfDesks = desksForFirstGroup + desksForSecondGroup + desksForThirdGroup;

        System.out.println(totalAmountOfDesks);
        
    }
}
