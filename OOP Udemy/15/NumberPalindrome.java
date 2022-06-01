public class NumberPalindrome {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(int number) {
            number = Math.abs(number);
            int reverse = 0;
            int lastDigit = 0;
            int numbercopy = number;
            while (numbercopy > 0) {
                lastDigit = numbercopy % 10;
                reverse = reverse * 10 + lastDigit;
                numbercopy /= 10;
            }
            if (reverse == number){
                return true;
            }
            else {
                return false;
            }
        }
    }