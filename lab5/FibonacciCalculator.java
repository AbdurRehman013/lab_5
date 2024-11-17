/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab.fibonaccicalculator;


import java.util.Scanner;

public class FibonacciCalculator {

    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        FibonacciCalculator calculator = new FibonacciCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate Fibonacci: ");
        int num = scanner.nextInt();

        int result = calculator.fibonacci(num);
        System.out.println("Fibonacci of " + num + " is " + result);
    }
}
