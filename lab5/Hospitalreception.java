package lab.hospitalreception;
import java.util.Scanner;

public class Hospitalreception {
    // Global variables for patient information
    static String pNumber, pName, pEmail, pContact, pComplain;
    static int pAge;
    static double pBill;

    // Method to take patient data
    public void Take_Patient_data() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Patient Number: ");
        pNumber = scanner.nextLine();

        System.out.print("Enter Patient Name: ");
        pName = scanner.nextLine();

        System.out.print("Enter Patient Age: ");
        pAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Patient Email: ");
        pEmail = scanner.nextLine();

        System.out.print("Enter Patient Contact: ");
        pContact = scanner.nextLine();

        System.out.print("Enter Patient Complaint: ");
        pComplain = scanner.nextLine();

        System.out.print("Enter Patient Bill: ");
        pBill = scanner.nextDouble();
    }

    // Method to print receipt
    public void Print_Receipt() {
        System.out.println("\n--- Patient Receipt ---");
        System.out.println("Patient Number: " + pNumber);
        System.out.println("Patient Name: " + pName);
        System.out.println("Patient Age: " + pAge);
        System.out.println("Patient Email: " + pEmail);
        System.out.println("Patient Contact: " + pContact);
        System.out.println("Patient Complaint: " + pComplain);
        System.out.println("Total Bill: $" + pBill);
    }

    public static void main(String[] args) {
        Hospitalreception receptionist = new Hospitalreception();
        receptionist.Take_Patient_data();
        receptionist.Print_Receipt();
    }
}
