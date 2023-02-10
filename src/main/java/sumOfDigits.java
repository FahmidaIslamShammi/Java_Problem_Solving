
// Find out sum of digits of a number
//Input: 152
//Output: 8
public class sumOfDigits {
    public static void main(String[] args) {
        int number=152;
        int lastDigit;
        int sum=0;
        while(number > 0)
        {
           //finds the last digit of the given number
            lastDigit = number % 10;
           //adds last digit to the variable sum
            sum = sum + lastDigit;
           //removes the last digit from the number
            number = number / 10;
        }

        System.out.println("Sum of Digits: "+sum);
    }
}


