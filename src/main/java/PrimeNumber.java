//Print prime numbers form 2 to 100
public class PrimeNumber {
    public static void main(String[] args) {
        String primeNumber = " ";
        for (int i = 2; i <= 100; i++) {
            int sum = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    sum = sum + 1;
                }
            }
            if (sum == 2) {
                primeNumber = primeNumber + i + " ";

            }




        }
        System.out.println(primeNumber);
    }
}
