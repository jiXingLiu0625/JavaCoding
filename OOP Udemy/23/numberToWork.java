public class numberToWork {
    public static void main(String[] args) {

    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        } else {
            int count = 0;
            while (number > 0) {
                number /= 10;
                count++;
            }
            return count;
        }
    }

    public static int reverse(int returnNumber) {
        int remainder = 0;
        int reverseNumber = 0;
        if (returnNumber > 0) {
            while (returnNumber > 0) {
                remainder = returnNumber % 10;
                reverseNumber = reverseNumber * 10 + remainder;
                returnNumber /= 10;
            }
            return reverseNumber;
        } else {
            while (returnNumber < 0) {
                remainder = returnNumber % 10;
                reverseNumber = reverseNumber * 10 + remainder;
                returnNumber /= 10;
            }
            return reverseNumber;
        }
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        if (number == 0) {
            System.out.println("Zero");
        } else {
            int copynumber = number;
            while (copynumber > 0) {
                int remainder = copynumber % 10;
                switch (remainder) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        break;
                }
                copynumber = copynumber / 10;
            }
        }
    }
}
