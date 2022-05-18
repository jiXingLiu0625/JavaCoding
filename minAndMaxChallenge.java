import java.util.Scanner;

public class minAndMaxChallenge {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        boolean first = true;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your number: ");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (max < number) {
                    max = number;
                }
                if (min > number) {
                    min = number;
                }
            } else {
                break;
            }
        }
        System.out.println("Max number is " + max + " and Min number is " + min);
        scanner.close();
    }
}
