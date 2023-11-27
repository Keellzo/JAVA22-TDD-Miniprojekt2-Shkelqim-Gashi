package se.kellygashi.main;

/**
 * This program counts the sum and the number of prime (int) numbers in a given interval.
 */
public class Prime {

    private int count = 0;
    private int sumOfPrimes = 0;

    public int getCount() {
        return count;
    }

    public int getSumOfPrimes() {
        return sumOfPrimes;
    }


    public Prime(int firstNumber, int lastNumber) {
        if (isInRange(firstNumber) && isInRange(lastNumber) && firstNumber <= lastNumber) {
            calculatePrimes(firstNumber, lastNumber);
        } else {
            throw new IllegalArgumentException("Hoppsan, fel intervall angivet!");
        }
    }

    private boolean isInRange(int number) {
        return number >= 0 && number <= 1000;
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private void calculatePrimes(int firstNumber, int lastNumber) {
        for (int current = firstNumber; current <= lastNumber; current++) {
            if (isPrime(current)) {
                count++;
                sumOfPrimes += current;
            }
        }
    }

    public String printCount() {
        return "Hej, det finns " + count + " primtal mellan 0 och 1000!";
    }

    public String printSum() {
        return "Och den totala summan av dessa primtal är " + sumOfPrimes + ".";
    }


    /*
    public static void main(String[] args) {
        Prime prime = new Prime(0, 1000);
        System.out.println(prime.printCount());
        System.out.println(prime.printSum());
    }
    */
}

