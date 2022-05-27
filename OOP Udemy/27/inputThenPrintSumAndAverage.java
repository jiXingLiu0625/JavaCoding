import java.util.Scanner;

public class inputThenPrintSumAndAverage {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {
        double XX = 0;
        double YY =0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                XX += number;
                count++;

            } else {
                YY = XX / count;
                System.out.println("SUM = " + Math.round(XX) + " AVG = " + Math.round(YY));
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
