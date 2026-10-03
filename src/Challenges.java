public class Challenges {
    public static void main(String[] args) {
        for  (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0 ) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0 && i % 5 != 0 ) {
                System.out.println("Fizz");
            }
            else if (i % 3 != 0 && i % 5 == 0 ) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
        int num = -5;
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime && num >1) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
        int number = -1234;
        int reversedNumber = 0;
        while(number > 0) {
            int reversed = number % 10;
            number = number / 10;
            reversedNumber = reversedNumber * 10 + reversed;
        }
        System.out.println(reversedNumber);
    }
}
