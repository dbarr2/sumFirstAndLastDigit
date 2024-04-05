public class FirstLastDigitSum {

    public static void main(String[] args) {

        System.out.println("Sum of first and last digit: " + sumFirstAndLastDigit(252)); //Expected outcome ==> 4
        System.out.println("Sum of first and last digit: " + sumFirstAndLastDigit(-22)); //Expected outcome ==> -1

    }

    public static int sumFirstAndLastDigit(int number) {

        int sum = 0;
        int lastDigit = 0, firstDigit = 0;

        if (number < 0) {
            return -1;
        } else if (number >= 0 && number <= 9) {
            sum = number + number;
        } else {
            lastDigit = number % 10;
            while (number > 10) {
                number /= 10;
                if (number < 10) {
                    firstDigit = number;
                    break;
                }
            }
        }

        sum = firstDigit + lastDigit;
        return sum;
    }
}
