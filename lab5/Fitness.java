
package lab.fitness;

import java.util.Scanner;

public class Fitness{

    public int calculatePrimeCalories(int input) {
        int sum = 0;
        for (int i = 2; i < input; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public int calculateOddCalories(int input) {
        int sum = 0;
        for (int i = 1; i < input; i += 2) {
            sum += i;
        }
        return sum;
    }

    public int calculateEvenCalories(int input) {
        int sum = 0;
        for (int i = 2; i < input; i += 2) {
            sum += i;
        }
        return sum;
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Fitness app = new Fitness();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter workout duration (negative to exit): ");
            int input = scanner.nextInt();
            if (input < 0) break;

            System.out.println("Calories burned for prime numbers: " + app.calculatePrimeCalories(input));
            System.out.println("Calories burned for odd numbers: " + app.calculateOddCalories(input));
            System.out.println("Calories burned for even numbers: " + app.calculateEvenCalories(input));
        }
    }
}
